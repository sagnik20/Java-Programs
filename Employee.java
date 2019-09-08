// Sagnik Chattopadhyaya --- 16500117034

import java.util.*;
class Employee{
	EmpName name;
	Department dept;
	Salary salary;
	String desig;
	int id,cell;
	static int count = 0;

	boolean permanent;
	Employee(EmpName naMe, Department dep,Salary sl, String s,int i, int c, boolean p){
		name = naMe;
		dept = dep;
		salary = sl;
		desig = s;
		id = i;
		cell = c;
		permanent = p;
		Employee.count++;

	}
	public static void main(String args[]){
		boolean perma;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the firstName : ");
		String fn = sc.nextLine();
		System.out.println("Enter the middleName : ");
		String mn = sc.nextLine();
		System.out.println("Enter the lastName : ");
		String ln = sc.nextLine();
		System.out.println("Enter the Department Name : ");
		String dn = sc.nextLine();
		System.out.println("Enter the Department Code : ");
		int dc = sc.nextInt();
		System.out.println("sagnik owns");
		System.out.println("Enter the Basic Pay : ");
		double b = sc.nextDouble();
		System.out.println("Enter the D A : ");
		double da = sc.nextDouble();
		System.out.println("Enter the H R A : ");
		double ha = sc.nextDouble();
		System.out.println("Enter the Provident Fund : ");
		double p = sc.nextDouble();
		System.out.println("Enter the insurance : ");
		double i = sc.nextDouble();
		System.out.println("Enter the Designation : ");
		String desig = sc.nextLine();
		System.out.println("Enter the Id : (only numbers)");
		int id = sc.nextInt();
		System.out.println("Enter the Cell Number : ");
		int cell = sc.nextInt();
		System.out.println("Is the Employee permanent ? y/n ");
		String per = sc.next();
		if(per == "y")
			perma = true;
		else
			perma = false;


		EmpName en = new EmpName(fn, mn, ln);
		Department dp = new Department(dn,dc);
		Salary sa = new Salary(b,da,ha,p,i);
		Employee instace = new Employee(en,dp,sa,desig,id,cell,perma);
		System.out.println("The number of objects created : " + Employee.count);
	}
}
class Salary{
	double basic,daPercent,hra,pf,insurance;
	Salary(double b, double da, double ha, double p, double i){
		basic = b;
		daPercent = da;
		hra = ha;
		pf = p;
		insurance = i;
	}
}
class EmpName{
	String firstName,midName,lastName;
	EmpName(String fn,String mn,String ln){
		firstName = fn;
		midName = mn;
		lastName = ln;
	}
}
class Department{
	String deptName;
	int deptCode;
	Department(String dn, int dc){
		deptName = dn;
		deptCode = dc;
	}
}
