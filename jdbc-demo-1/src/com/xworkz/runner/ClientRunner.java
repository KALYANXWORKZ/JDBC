package com.xworkz.runner;

import com.xworkz.dao.EmployeeDAO;
import com.xworkz.dao.impl.EmployeeDAIOImpl;
import com.xworkz.model.Employee;

public class ClientRunner {
	public static void main(String[] args) {
		EmployeeDAO employeeDAO = new EmployeeDAIOImpl();
		Employee employee=getEmployee();
		employeeDAO.createEmployee(employee);
				
	}
		private static Employee getEmployee() {
			Employee employee = new Employee();
			employee.setBonus(60000);
			employee.setEmail("dayanand@gmail.com");
			employee.setEmployee_id(102);
			employee.setEmployeeName("Dayanand");
			employee.setSalary(45000.00); 
			
			return employee;
		}
	}


