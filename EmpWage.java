import java.util.*;
import java.io.*;

public class EmpWage{

	public static void main(String args[]){

		//Variable declaration
		int empRatePerHr=20;
		int empHr=8;
		int dailyWage;

		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM!");

		//UC1: Employee check for attendance
		Random ran=new Random();
                int ran1=ran.nextInt(3)+1;
                //System.out.println("Number is : "+ran1);
		if(ran1==3){
			System.out.println("Employee is absent");
		}
		else{
			System.out.println("Employee is Present");
			dailyWage=empRatePerHr*empHr;
			System.out.println("Daily Employee Wage is "+dailyWage);
		}

	}

}
