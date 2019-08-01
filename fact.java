// factorial of a numbers using command line argument
import java.util.*;
class fibo{
	public static void main(String args[]){
		if( args.length == 0 ){
			System.out.println("Please enter a number while trying again.");
			System.out.println("Quiting.......");
			System.exit(0);
		}
		int n = Integer.parseInt(args[0]);
		int fact = 1;
		for (int i=1;i<=n;i++){
			fact =fact * i;
		}
		System.out.println("The factorial of "+n+" : "+fact);
	}
}