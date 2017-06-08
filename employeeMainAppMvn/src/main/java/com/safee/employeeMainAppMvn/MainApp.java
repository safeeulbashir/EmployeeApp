package com.safee.employeeMainAppMvn;

import java.util.Scanner;

import com.safee.services.EmployeeInformations;
import com.safee.services.EmployeeServices;

/**
 * Hello world!
 *
 */
public class MainApp 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        
        MainApp mainApp=new MainApp();
        mainApp.runProgram();
    }
    
    public void displayEmployeeDetails()
    {
    	EmployeeServices employeeServices= new EmployeeServices();
    	System.out.println("Enter employee Id:");
    	Scanner scanner= new Scanner(System.in);
    	int ID=scanner.nextInt();
    	EmployeeInformations employeeInformations= employeeServices.getEmployeeInformation(ID);//.getEmployeeInformation(ID);
        System.out.println("Name: "+employeeInformations.getEmpName());
        System.out.println("Joining Date: "+employeeInformations.getJoinDate());
        System.out.println("Department: "+employeeInformations.getDeptartmentName());
        System.out.println("Gross Salaries: "+employeeInformations.calculateGrossSalary());
    }

	private void runProgram() {
		// TODO Auto-generated method stub
		displayOptions();
		Integer selection=getSelection();
		OPTIONS opt = OPTIONS.valueOf(selection);
		do {
			switch (opt) {
			case FIND:
				displayEmployeeDetails();
				break;
						}
			displayOptions();
			selection = getSelection();
			opt = OPTIONS.valueOf(selection);
		} while (opt != opt.EXIT);
		
	}

	private Integer getSelection() {
		// TODO Auto-generated method stub
		System.out.println("Enter Choice: ");
		@SuppressWarnings("resource")
		Scanner myScanner = new Scanner(System.in);
		return myScanner.nextInt();
	}

	private void displayOptions() {
		// TODO Auto-generated method stub
		System.out.println("1. Find Employee");
		
		System.out.println("2. Exit");
		
	}

}
