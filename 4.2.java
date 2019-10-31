 // Sagnik Chattopadhyaya --- 16500117034

import java.util.*;
abstract class Shape{
	int a,b;
	abstract void printArea();
}

class Rectangle extends Shape{
	void printArea(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Length and Breadth of Rectangle : ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("The area of Rectangle : "+a*b);
	}
}

class Square extends Shape{
	void printArea(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the side of Square: ");
		a=sc.nextInt();
		//b=sc.nextInt();
		System.out.println("The area of Square : "+a*a);
	}
}

class Circle extends Shape{
	void printArea(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Radious of the Circle : ");
		a=sc.nextInt();
		//b=sc.nextInt();
		System.out.println("The area of Rectangle : "+(3.14*a*a));
	}
}

class Demo{
	public static  void main(String sagnik[]){
		int ch;
		Rectangle o1 = new Rectangle();
		Circle o2 = new Circle();
		Square o3 = new Square();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number 1,2 or 3");
		ch = sc.nextInt();
		switch(ch){
			case 1:o1.printArea();break;
			case 2:o2.printArea();break;
			case 3:o3.printArea();break;
			default: System.out.println("Wrong value!");System.exit(0);
		}
	}
}
