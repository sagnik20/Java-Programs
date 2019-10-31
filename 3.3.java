// Sagnik Chattopadhyaya --- 16500117034


import java.util.*;
class Reverse{
	public static void main(String sagnik[]){
		String st1,st2="";
	        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		st1 = sc.nextLine();
		int n = st1.length();
		for(int i = n-1; i>=0;i--){
			char c = st1.charAt(i);
			st2=st2 + c;
		}
		System.out.println(st2);
	}
}
