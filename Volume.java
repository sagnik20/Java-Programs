// Sagnik Chattopadhyaya --- 16500117034


import java.util.*;
class Volume{
	double volume;
	void calVol(int r){
		volume = (4/3)*3.14*(r^3);
		System.out.println("The volume of Sphere : " + volume);
	}
	void calVol(int l,int b,int h){
		volume = l*b*h;
		System.out.println("The volume of Cuboid : " + volume);
	}
	void calVol(int r,int h){
		volume = 3.14*(r^2)*h;
		System.out.println("The volume of Cone : " + volume);
	}
	public static void main(String args[]){
		Volume ob = new Volume();
		if( args.length == 0 ){
			System.out.println("Please enter a number while trying again.");
			System.out.println("Quiting.......");
			System.exit(0);
		}
		else if (args.length == 1){
			ob.calVol(Integer.parseInt(args[0]));
		}
		else if (args.length == 2){
			ob.calVol(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		}
		else if (args.length == 3){
			ob.calVol(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
		}

		// int a = Integer.parseInt(args[0]);
	}
}