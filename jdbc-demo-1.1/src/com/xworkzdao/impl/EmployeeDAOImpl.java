package com.xworkzdao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.xworkz.dao.EmployeeDAO;
import com.xworkz.model.EmployeeModel;
import com.xworkz.util.DBUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void save(EmployeeModel model) {
		String sql = "insert into employee_details(name,company,salary)values(?,?,?)";
		try (Connection connection = DBUtil.getConnection(); PreparedStatement ps = connection.prepareStatement(sql)) {

			ps.setString(1, model.getName());
			ps.setString(2, model.getCompany());
			ps.setInt(3, model.getSalary());
			
			int executeUpdate = ps.executeUpdate();
			if(executeUpdate==1) {
				System.out.println("Employee is created....:)");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
