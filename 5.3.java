import java.util.*;
class UDE
{ 
    public static void main(String ts7[]) throws MinimumBal
    {
        Scanner sc= new Scanner(System.in);
        double bal;
        System.out.println("Enter current balance:");
        bal=sc.nextDouble();
        System.out.println("Enter amount to withdrawal");
        int n = sc.nextInt();
        try {
            if (bal<n)
                  throw new MinimumBal("Account ae taka nei bhai !\nYour Current balance is "+bal);
            else     System.out.println("Money left:"+(bal-n));
                 } 
        catch (MinimumBal mab)
        {
            mab.printStackTrace();
        }
    }
}
class MinimumBal extends Exception
{
    String message;
    public MinimumBal(String message)
    {
        this.message = message;
    }
    public String toString()
    {
        return message;
    }
}