// Sagnik Chattopadhyaya --- 16500117034

import java.util.Scanner;
class Abbreviation
{
    public static void main(String args[])
    	{
	    Scanner sc=new Scanner(System.in);
	    int n=0;
	    String st;
	    String a[]=new String[n];
	    char b=' ';
	    System.out.println("Enter your Name:");
	    st=sc.nextLine();
	    int l=st.length();
	    for(int i=0;i<l;i++)
	    {
		b=st.charAt(i);
		if(b==' ')
		     n++;
	    }
		 a=st.split(" ",n+1);
	    System.out.print("Abbreviated Name :");
	    for(int i=0;i<n;i++)
		System.out.print(a[i].charAt(0)+".");
	    System.out.println(a[n]);
	}
}

