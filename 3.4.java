// Sagnik Chattopadhyaya --- 16500117034


import java.util.*;
class StrReplace{
	public static void main(String Args[]){
		String st1,find,repl;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		st1 = sc.nextLine();
		int n = st1.length();
		System.out.println("Enter the String to replace : ");
		find = sc.nextLine();
		if(st1.contains(find)){
			System.out.println("Enter the String to replace with : ");
			repl = sc.nextLine();
			System.out.println("New String : "+st1.replaceAll(find,repl));
		}
		else
		System.out.println("Word  ot found!");
		
	}
}
