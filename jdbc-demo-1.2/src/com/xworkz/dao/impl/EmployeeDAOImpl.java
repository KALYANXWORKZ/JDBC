package com.xworkz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.xworkz.dao.EmployeeDAO;
import com.xworkz.model.EmployeeEntity;
import com.xworkz.util.DBUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public boolean save(EmployeeEntity entity) {
		String sql = "insert into employee_details1(name,location,salary)values(?,?,?)";
		try (Connection connection = DBUtil.getConnection(); PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setString(1, entity.getName());
			ps.setString(2, entity.getLocation());
			ps.setInt(3, entity.getSalary());
			
			int executeUpdate = ps.executeUpdate();
			
			if(executeUpdate==1) {
				System.out.println("Employee object is created");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

}
