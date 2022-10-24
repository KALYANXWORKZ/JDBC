package com.xworkz.dao;

import java.util.List;

import com.xworkz.model.Employee;

public interface EmployeeDAO {

	void createEmployee(Employee employee);

	Employee getEmployeeById(Integer emoployeeId);

	void updateEmployeeEmailById(String newEmail, Integer emoployeeId);

	void deleteEmployeeById(Integer employeeId);

	List<Employee> getAllEmoloyeesInfo();

}
