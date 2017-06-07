package com.safee.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalariesDao {
	public static Salaries getSalaries(int empId)
	{
		try(Connection connection= JdbcConnectionFactory.getConnection();)
		{
			String SQL="Select * from SALARIES WHERE emp_no=? ORDER BY from_date, to_date DESC";
			PreparedStatement preparedStatement= connection.prepareStatement(SQL);
			preparedStatement.setInt(1, empId);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
			{
				Salaries salaries= new Salaries();
				salaries.setEmp_no(resultSet.getInt("emp_no"));
				salaries.setSalary(resultSet.getInt("salary"));
				salaries.setFrom_date(resultSet.getDate("from_date"));
				salaries.setTo_date(resultSet.getDate("to_date"));
				
				return salaries;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
