import java.util.*;
import java.io.*;

public class EmpWage{

/*	public void set(int Wage,int WorkingDay,int Hour){

		empRatePerHr=Wage;
		maxHr=Hour;
		noWorkingDays=WorkingDay;

	}
*/
	public void EmpWageBuilder(){

		int empRatePerHr;
		int noWorkingDays;
		int maxHr;

		Scanner in = new Scanner(System.in);

		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM!");
		System.out.println("OFFICE USE");
		System.out.println("Enter the necessary details as per your company");

		System.out.println("Enter a hourly Wage for your company :");
		empRatePerHr=in.nextInt();

		System.out.println("Enter a maximum Working Days : ");
		noWorkingDays=in.nextInt();

		System.out.println("Enter a maximum Working Hours for month : ");
		maxHr=in.nextInt();

		System.out.println("");

		//Variable declaration
		int empHr;
		int dailyWage;
		int totalSalary=0;
		int partTime=0;
		int fullTime=0;
		int absent=0;
		int totalDays=0;
		int totalEmpHr=0;

		System.out.println("COMPANY DATA");
		System.out.println("Employee Wage per hour "+empRatePerHr+" Maximum Working Days "+maxHr+" Maximum Working Hours "+maxHr);
		System.out.println("");
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
		System.out.println("------------------------------------------------------------------------");
		System.out.println("");
	}

	public static void main(String args[]){

	EmpWage[] obj = new EmpWage[3];

	obj[0]=new EmpWage();
	obj[1]=new EmpWage();
	obj[2]=new EmpWage();

	obj[0].EmpWageBuilder();
	obj[1].EmpWageBuilder();
	obj[2].EmpWageBuilder();

/*	EmpWage company1 = new EmpWage();
//	company1.set(20,20,100);
	company1.EmpWageBuilder();

	EmpWage company2 = new EmpWage();
//	company2.set(30,15,70);
	company2.EmpWageBuilder();

	EmpWage company3 = new EmpWage();
//	company3.set(15,25,90);
	company3.EmpWageBuilder();
*/
	}

}
