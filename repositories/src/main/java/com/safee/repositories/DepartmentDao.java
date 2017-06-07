package com.safee.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentDao {
	public static Department getSalaries(int empId)
	{
		try(Connection connection= JdbcConnectionFactory.getConnection();)
		{
			String SQL="SELECT * FROM departments WHERE dept_no IN (SELECT dept_no FROM dept_emp WHERE emp_no = ?);";
			PreparedStatement preparedStatement= connection.prepareStatement(SQL);
			preparedStatement.setInt(1, empId);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
			{
				Department department= new Department();
				department.setDep_name(resultSet.getString("dept_name"));
				department.setDept_no(resultSet.getString("dept_no"));
				return department;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
