// Sagnik Chattopadhyaya --- 16500117034


import java.util.*;
class Vehicle{
	int wheels;
	double speed;
}
class Truck extends Vehicle{
	int loadLimit;
	void display(){
		System.out.println("No. of Wheel of Truck: "+wheels);
		System.out.println("Speed of Truck: "+speed);
		System.out.println("Load limit of Truck: "+loadLimit);
	}
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Wheels :");
		wheels = sc.nextInt();
		System.out.println("Speed :");
		speed = sc.nextInt();
		System.out.println("Load Limit :");
		loadLimit = sc.nextInt();
	}
}
class Car extends Vehicle{
	int passenger;
	void display(){
		System.out.println("No. of Wheel of Car: "+wheels);
		System.out.println("Speed of Car: "+speed);
		System.out.println("Passenger in Car: "+passenger);
	}
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Wheels :");
		wheels = sc.nextInt();
		System.out.println("Speed :");
		speed = sc.nextInt();
		System.out.println("Passenger :");
		passenger = sc.nextInt();
	}
}
class testVehicle{
	public static void main(String sagnik[]){
		Truck o1 = new Truck();
		Car o2 = new Car();
		System.out.println("Enter the Values of Car :");
		o2.input();
		System.out.println("Enter the Values of Truck :");
		o1.input();
		o2.display();
		o1.display();

		if(o1.speed>o2.speed)
			System.out.println("Car is slower than Truck");
		else
			System.out.println("Car is faster than Truck");
	}
	
}
