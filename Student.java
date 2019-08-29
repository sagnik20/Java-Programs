// Sagnik Chattopadhyaya --- 16500117034

import java.util.*;
class Student{
	String Name;
	int mark1, mark2, mark3;
	Student(String n, int m1, int m2, int m3){
		Name = n;
		mark1 = m1;
		mark2 = m2;
		mark3 = m3;
	}
	void total(){
		int total = mark1 + mark2 + mark3;
		double avg = total / 3.0;
		display(total, avg);
	}
	void display(int a, double b){
		System.out.println("Total " + a);
		System.out.println("Average " + b);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of the Student");
		String n = sc.nextLine();
		System.out.println("Enter the Marks in first subject: ");
		int a = sc.nextInt();
		System.out.println("Enter the Marks in second subject: ");
		int b = sc.nextInt();
		System.out.println("Enter the Marks in third subject: ");
		int c = sc.nextInt();
		Student ob = new Student(n,a,b,c);
		ob.total();
	}

}