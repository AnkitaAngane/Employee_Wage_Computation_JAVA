import java.util.*;
import java.io.*;

public class EmpWage{

	public static void main(String args[]){

		//Variable declaration
		int empRatePerHr=20;
		int empHr;
		int dailyWage;

		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM!");

		//UC1: Employee check for attendance
		Random ran=new Random();
                int ran1=ran.nextInt(3)+1;
                //System.out.println("Number is : "+ran1);
		switch(ran1){
			case 3 :
				System.out.println("Employee is absent");
				break;
			case 1 :
				System.out.println("Employee is Present for full time");
				empHr=8;
				dailyWage=empRatePerHr*empHr;
				System.out.println("Daily Employee Wage is "+dailyWage);
				break;
			default :
				System.out.println("Employee is Present for part time");
                        	empHr=4;
                        	dailyWage=empRatePerHr*empHr;
                        	System.out.println("Daily Employee Wage is "+dailyWage);
		}

	}

}
