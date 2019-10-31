import java.util.*;
class Exception2
{
    static void main(String ts7[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        try
        {
            System.out.println("Enter a value(in numbers):");
            a[15]=sc.nextInt();
        }
        catch(ArrayIndexOutOfBoundsException t)
        {
            System.out.println("You don't have sufficient elements to enter inside the array");
        }
    }
}