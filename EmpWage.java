import java.util.*;
import java.io.*;

interface EmpWageCal{

public void EmpWageBuilder();

}


public class EmpWage implements EmpWageCal{

	//Variable declaration
		int empHr;
		int dailyWage;
		int totalSalary=0;
		int partTime=0;
		int fullTime=0;
		int absent=0;
		int totalDays=0;
		int totalEmpHr=0;

		int empRatePerHr;
		int noWorkingDays;
		int maxHr;
		int k=1;

	public void EmpWageBuilder(){

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

		List DWage = new ArrayList();

		System.out.println("COMPANY DATA");
		System.out.println("Employee Wage per hour : "+empRatePerHr+" Maximum Working Days : "+maxHr+" Maximum Working Hours : "+maxHr);
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
		DWage.add(dailyWage);
		totalSalary=dailyWage+totalSalary;

		}

		System.out.println("EMPLOYEE DATA :");
		System.out.println("FullTime Present Days : "+fullTime+" Part Time Present Days : "+partTime+" Absent Days : "+absent);
		System.out.println("Total Working Days : "+totalDays+" Total Working Hours : "+totalEmpHr);
		System.out.println("Daily Wages are : "+DWage);
		for (int count=0;count<DWage.size();count++){
			System.out.println("Day"+k+" Wage "+DWage.get(count));
			k+=1;
		}
		System.out.println("Total Salary for a Month is "+totalSalary);
		System.out.println("");
	}

	public int getTotalWage(){
		return totalSalary;
	}

	public static void main(String args[]){

//Using array of objects
/*	EmpWage[] obj = new EmpWage[3];

	obj[0]=new EmpWage();
	obj[1]=new EmpWage();
	obj[2]=new EmpWage();

	obj[0].EmpWageBuilder();
	obj[1].EmpWageBuilder();
	obj[2].EmpWageBuilder();
*/

//Using array list o objects

	ArrayList<EmpWage> company = new ArrayList<EmpWage>();
    	company.add(new EmpWage());
    	company.add(new EmpWage());
    	company.add(new EmpWage());

/*	for (EmpWage c: company){
		c.EmpWageBuilder();
	}
*/
	Scanner sc=new Scanner(System.in);

	for (EmpWage c: company){
		c.EmpWageBuilder();
		System.out.println("Wish to know total Wage. If yes then type yes else no");
		String str=sc.nextLine();
		if (str.equals("yes")){
	                System.out.println("Total Wage : "+c.getTotalWage());
		}
		System.out.println("------------------------------------------------------------------------");
		System.out.println("");
        }

}

}
