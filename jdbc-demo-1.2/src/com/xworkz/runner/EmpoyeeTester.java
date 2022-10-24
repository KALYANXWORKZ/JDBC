package com.xworkz.runner;

import com.xworkz.dao.EmployeeDAO;
import com.xworkz.dao.impl.EmployeeDAOImpl;
import com.xworkz.model.EmployeeEntity;

public class EmpoyeeTester {
	
	public static void main(String[] args) {
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		EmployeeEntity employee=getEmployee();
		employeeDAO.save(employee);
		System.out.println(employee);
		
	}

	private static EmployeeEntity getEmployee() {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setName("Kumar");
		employeeEntity.setLocation("Mysore");
		employeeEntity.setSalary(55000);
		return employeeEntity;
	}
}
