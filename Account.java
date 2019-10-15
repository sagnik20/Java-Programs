// Sagnik Chattopadhyaya --- 16500117034

/*
3.Declare a class “BankAccount” with the following:
	i. Account Holder’s Name
	ii. Account Number
	iii. Account Type (S for savings and C for Current)
	iv. Balance amount
Methods:
	i. Initialize data
	ii. Deposit money
	iii. Withdrawal of money –minimum balance should beRs. 1,000/-after withdrawl.
	iv. To display all items
Write an appropriate main() to run it.

*/

import java.util.*;
class BankAccount{
	String Name,Type;
	int Amount;
	long Number;
	void init(String n,String t,long m,int a){
		Name = n;
		Type = t;
		Number = m;
		Amount = a;
	}
	void deposit(int a){
		Amount+= a;
	}
	void withdraw(int a){
		if((Amount - a)>1000){
			Amount-= a;		
		}
		else
			System.out.println("Cannot Withdraw! Minimum balance should be Rs.1000!");
	}
	void display(){
		System.out.println("Account Holder's Name  :  "+Name);
		System.out.println("Account Number  :  " + Number);
		System.out.println("Account Type  :  "+ Type);
		System.out.println("Remaining Balance  :  " + Amount);
	}
	public static void main(String sagnik[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Account Holder's Name  : ");
		String name = sc.nextLine();
		System.out.print("Enter the Account Number  : ");
		long number = sc.nextLong();
		System.out.print("Enter the Account Type (S/C)  : ");
		String type = sc.next();
		System.out.print("Enter the Account balance  : ");
		int bal = sc.nextInt();
		BankAccount ob = new BankAccount();
		ob.init(name,type,number,bal);
		while(true){
			System.out.println("Enter \n 1. Deposit \n 2. Withdraw \n 3. Display \n 4.Exit");
			int c = sc.nextInt();
			switch(c){
				case 1: System.out.print("Enter amount to deposit :");int a = sc.nextInt();ob.deposit(a);break;
				case 2: System.out.print("Enter amount to withdraw :"); a = sc.nextInt();ob.withdraw(a);break;
				case 3: ob.display();break;
				case 4: System.exit(0);
				default: System.out.println("Try AGAIN!");break;
			}
		}
	}
}
