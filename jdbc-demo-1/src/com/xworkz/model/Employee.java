package com.xworkz.model;

public class Employee {

	private Integer employee_id;
	private String employeeName;
	private String email;
	private Double salary;
	private Integer bonus;

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getBonus() {
		return bonus;
	}

	public void setBonus(Integer bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employeeName=" + employeeName + ", email=" + email
				+ ", salary=" + salary + ", bonus=" + bonus + "]";
	}

}
