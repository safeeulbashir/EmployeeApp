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
        mainApp.displayEmployeeDetails();
    }
    
    public void displayEmployeeDetails()
    {
    	System.out.println("Enter employee Id:");
    	Scanner scanner= new Scanner(System.in);
    	int ID=scanner.nextInt();
    	EmployeeInformations employeeInformations=EmployeeServices.getEmployeeInformation(ID);
        System.out.println("Name: "+employeeInformations.getEmployee().getFirst_name()+" "+employeeInformations.getEmployee().getLast_name());
        System.out.println("Department: "+employeeInformations.getDepartment().getDep_name());
        System.out.println("Salaries: "+employeeInformations.getSalaries().getSalary());
    }
}
