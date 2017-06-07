package com.safee.services;

import com.safee.repositories.*;

public class EmployeeInformations {

	private Employee employee;
	private Salaries salaries;
	private Department department;
	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}
	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	/**
	 * @return the salaries
	 */
	public Salaries getSalaries() {
		return salaries;
	}
	/**
	 * @param salaries the salaries to set
	 */
	public void setSalaries(Salaries salaries) {
		this.salaries = salaries;
	}
	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
