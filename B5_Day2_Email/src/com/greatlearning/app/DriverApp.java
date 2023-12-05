package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmployeeServiceImpl;

public class DriverApp {

	public static void main(String[] args) {
		EmployeeServiceImpl empImpl = new EmployeeServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter your first name ");
		String firstName=sc.next().toLowerCase();
		
		System.out.println("please enter your last name ");
		String lastName=sc.next().toLowerCase();
		
		
		System.out.println(" 1. Technical");
		System.out.println(" 2. Admin");
		System.out.println(" 3. Humar Resource");
		System.out.println(" 4. Legal");
		
		System.out.println("please choose department");
		int choice = sc.nextInt();
		
		String genEmail="";
		String genPassword="";
		
		switch(choice)
		{
		case 1: genEmail= empImpl.generateEmailID(firstName, lastName, "tech");break;
		case 2: genEmail= empImpl.generateEmailID(firstName, lastName, "admin");break;
		case 3: genEmail= empImpl.generateEmailID(firstName, lastName, "hr");break;
		case 4: genEmail= empImpl.generateEmailID(firstName, lastName, "legal");break;
		default:System.out.println("please enter valid input");
		}
		

         genPassword=empImpl.generatePassword();
         Employee e1 = new Employee();
          e1.setFirstName(firstName);
          e1.setLastName(lastName);
          e1.setEmail(genEmail);
          e1.setPassword(genPassword);
          
          empImpl.showEmployeeDetails(e1);
	}

}
