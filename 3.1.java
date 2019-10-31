 // Sagnik Chattopadhyaya --- 16500117034
/*
Write a program to count the no. of occurrence of a given substring in a line of text taken as input.
*/

import java.util.*;
class Count{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the main String : ");
		String str = sc.nextLine();
		System.out.println("Enter the string to search : ");
		String search = sc.nextLine();
		int count =0,index =0;
		while ((index = str.indexOf(search, index)) != -1 ){
		 
		            System.out.println("Found at index: " + index);
		            count++;
		            index++;
		            
		}
			        
		System.out.println("Total occurrences: " + count);
	}
}
