package com.safee.services;

import com.safee.repositories.*;

public class EmployeeServices {

	
	public static EmployeeInformations getEmployeeInformation(int emp_no)
	{
		EmployeeInformations employeeInformations= new EmployeeInformations();
		employeeInformations.setEmployee(EmployeeDao.getEmployee(emp_no));
		employeeInformations.setDepartment(DepartmentDao.getSalaries(emp_no));
		employeeInformations.setSalaries(SalariesDao.getSalaries(emp_no));
		return employeeInformations;
	}
}
