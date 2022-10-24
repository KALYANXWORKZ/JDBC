package com.xworkz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.xworkz.dao.EmployeeDAO;
import com.xworkz.model.Employee;
import com.xworkz.util.DBUtil;

public class EmployeeDAIOImpl implements EmployeeDAO {

	@Override
	public void createEmployee(Employee employee) {
		String SQL = "insert into employee_table(employee_name,email,salary,bonus)values(?,?,?,?)";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {

			preparedStatement.setString(1, employee.getEmployeeName());
			preparedStatement.setString(2, employee.getEmail());
			preparedStatement.setDouble(3, employee.getSalary());
			preparedStatement.setInt(4, employee.getBonus());
			int executeUpdate = preparedStatement.executeUpdate();
			if (executeUpdate == 1) {
				System.out.println("employee is created...");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	public Employee getEmployeeById(Integer emoployeeId) {
		Employee employee = null;
		String sql = "select from employee_table where employee_id=?";

		try (Connection connection = DBUtil.getConnection(); PreparedStatement ps = connection.prepareStatement(sql)) {

			ps.setInt(1, emoployeeId);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("employee_id");
				String name = rs.getString("employee_name");
				String email = rs.getString("email");
				double salary = rs.getDouble("salary");
				int bonus = rs.getInt("bonus");

				employee = new Employee();
				employee.setEmployeeName(name);
				employee.setEmployee_id(id);
				employee.setEmail(email);
				employee.setSalary(salary);
				employee.setBonus(bonus);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return employee;
	}

	@Override
	public void updateEmployeeEmailById(String newEmail, Integer emoployeeId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployeeById(Integer employeeId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employee> getAllEmoloyeesInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
