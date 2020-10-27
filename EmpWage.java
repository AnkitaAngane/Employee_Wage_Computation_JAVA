import java.util.*;
import java.io.*;

public class EmpWage{

	public static void main(String args[]){

		//Variable declaration
		int empRatePerHr=20;
		int empHr;
		int dailyWage;
		int noWorkingDays=20;
		int totalSalary=0;
		int partTime=0;
		int fullTime=0;
		int absent=0;
		int maxHr=100;
		int totalDays=0;
		int totalEmpHr=0;

		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM!");

		//UC1: Employee check for attendance

		while( totalEmpHr<maxHr && totalDays<noWorkingDays ){

			totalDays+=1;
			Random ran=new Random();
        	        int ran1=ran.nextInt(3)+1;
                	//System.out.println("Number is : "+ran1);
			switch(ran1){
				case 3 :
					//System.out.println("Employee is absent");
					absent+=1;
					empHr=0;
					break;
				case 1 :
					//System.out.println("Employee is Present for full time");
					fullTime+=1;
					empHr=8;
					break;
				default :
					//System.out.println("Employee is Present for part time");
                        		partTime+=1;
					empHr=4;
			}
		totalEmpHr+=empHr;
		dailyWage=empRatePerHr*empHr;
		totalSalary=dailyWage+totalSalary;

		}

		System.out.println("EMPLOYEE DATA :");
		System.out.println("FullTime Present Days : "+fullTime+" Part Time Present Days : "+partTime+" Absent Days : "+absent);
		System.out.println("Total Working Days : "+totalDays+" Total Working Hours : "+totalEmpHr);
		System.out.println("Total Salary for a Month is "+totalSalary);
	}

}
