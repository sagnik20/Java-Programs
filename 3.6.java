//java program that reads line of integer seperated by commas and displays each integer and find the sum of the integer
// Sagnik Chattopadhyaya --- 16500117034


import java.util.Scanner;
class SumOfIntegers
{
	public static void main(String sagnik[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String st1 = sc.nextLine();
		int i,sum = 0,len = st1.length();
		for(i=0;i<len;i++){
			if(st1.charAt(0)==',')
				continue;
			char b = st1.charAt(i);
			if(b==','){
				sum += Character.getNumericValue(st1.charAt(i-1));
				System.out.println("Number is :" + Character.getNumericValue(st1.charAt(i-1)));
			}
		}
		sum += Character.getNumericValue(st1.charAt(i-1));
		System.out.println("Number is :" + Character.getNumericValue(st1.charAt(i-1)));
		System.out.println("The sum is : "+sum);
	}
}
