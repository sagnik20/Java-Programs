//Roots of a Quadtratic Equation for all possible 
import java.util.*;
import java.lang.*;
class quad{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a,b & c of the equation:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("The entered equation is : "+a+"x^2+"+b+"x+"+c+"=0");
		double d =(double) (b*b - 4*a*c);
		if(d>=0){
			double xPositive = ((-b)+ Math.sqrt(d))/(2*a);
			double yPositive = ((-b)- Math.sqrt(d))/(2*a);
			System.out.println("The Roots are :\n x="+xPositive+"\n y="+yPositive);
		}
		else if(d ==0){
			double root = -b/(2*a);
			System.out.println("The roots of the equation are equal. Root: "+root);
		}
		else{
			double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out.println("Real_root = "+realPart+"\nImaginaryRoot = "+imaginaryPart);
		}
	}
}