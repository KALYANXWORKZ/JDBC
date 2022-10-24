package com.xworkzdao.runner;

import com.xworkz.dao.EmployeeDAO;
import com.xworkz.model.EmployeeModel;
import com.xworkzdao.impl.EmployeeDAOImpl;

public class EmployeeRunner {
	public static void main(String[] args) {
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		EmployeeModel employeeModel = getEmployee();
		employeeDAO.save(employeeModel);
		System.out.println(employeeModel);

	}

	private static EmployeeModel getEmployee() {
		EmployeeModel employeeModel = new EmployeeModel();
		employeeModel.setName("Daya");
		employeeModel.setCompany("DELL");
		employeeModel.setSalary(45000);

		return employeeModel;
	}
}
