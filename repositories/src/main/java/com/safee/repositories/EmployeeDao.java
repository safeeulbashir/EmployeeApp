package com.safee.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDao {
	public static Employee getEmployee(int empId)
	{
		try(Connection connection= JdbcConnectionFactory.getConnection();)
		{
			String SQL="Select * from EMPLOYEES WHERE emp_no=?";
			PreparedStatement preparedStatement= connection.prepareStatement(SQL);
			preparedStatement.setInt(1, empId);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
			{
				Employee employee= new Employee();
				employee.setEmp_no(resultSet.getInt("emp_no"));
				employee.setFirst_name(resultSet.getString("first_name"));
				employee.setLast_name(resultSet.getString("last_name"));
				employee.setBirth_date(resultSet.getDate("birth_date"));
				employee.setHire_date(resultSet.getDate("hire_date"));
				employee.setGender(resultSet.getString("gender"));
				return employee;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
