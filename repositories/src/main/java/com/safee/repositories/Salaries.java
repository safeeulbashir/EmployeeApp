package com.safee.repositories;

import java.sql.Date;

public class Salaries {
int emp_no;
int salary;
Date from_date;
Date to_date;
/**
 * @return the emp_no
 */
public int getEmp_no() {
	return emp_no;
}
/**
 * @param emp_no the emp_no to set
 */
public void setEmp_no(int emp_no) {
	this.emp_no = emp_no;
}
/**
 * @return the salary
 */
public int getSalary() {
	return salary;
}
/**
 * @param salary the salary to set
 */
public void setSalary(int salary) {
	this.salary = salary;
}
/**
 * @return the from_date
 */
public Date getFrom_date() {
	return from_date;
}
/**
 * @param from_date the from_date to set
 */
public void setFrom_date(Date from_date) {
	this.from_date = from_date;
}
/**
 * @return the to_date
 */
public Date getTo_date() {
	return to_date;
}
/**
 * @param to_date the to_date to set
 */
public void setTo_date(Date to_date) {
	this.to_date = to_date;
}
}
