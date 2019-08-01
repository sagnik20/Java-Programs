// to print first n non prime numbers
import java.util.*;
class NonPrime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=2;
		NonPrime np = new NonPrime();
		while (n!=0){
			i++;
			if (np.isPrime(i)){
				System.out.print(i+"  ");
				n--;
			}
		}
	}
	boolean isPrime(int num){
		boolean flag = false;
		for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (flag)
        	return true;
        else
        	return false;
	}
}