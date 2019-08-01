// to print n fibonacci numbers 
import java.util.*;
class fibo{
	public static void main(String args[]){
		if( args.length == 0 ){
			System.out.println("Please enter a number while trying again.");
			System.out.println("Quiting.......");
			System.exit(0);
		}
		int n = Integer.parseInt(args[0]);
		if (n > 1){
			int t1 =0,t2 = 1;
			for (int i = 1; i <= n; ++i)
	        {
	            System.out.print(t1 + "  ");
	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }
	    }
	    else{
	    	System.out.println(n);
	    }
	}
}