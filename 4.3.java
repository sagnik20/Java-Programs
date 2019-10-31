import java.util.*;
abstract class GeometricObject
{
    Scanner sc=new Scanner(System.in);
    String colour;double weight;
    GeometricObject()
    {
        colour="white"; weight=1.0;
    }
    void getColour()
    {
        System.out.println("Enter a colour:");
        colour=sc.next();
    }
    void getWeight()
    {
        System.out.println("Enter a weight:");
        weight=sc.nextDouble();
        
    }
    abstract void findArea(); abstract void findCircumference();
}
class Triangle extends GeometricObject
{
    Scanner sc=new Scanner(System.in);
    double b,hy,h,area=0.0,circum=0.0;
    void findArea()
    {
        System.out.println("Enter base,height and hypothenius:");
        b=sc.nextInt();
        h=sc.nextInt();
        hy=sc.nextInt();
        area=(b*h)/2;
        System.out.println("Area of Triangle:"+area);
    }
    void findCircumference()
    {
        System.out.println("Enter base,height and hypothenius:");
        b=sc.nextInt();
        h=sc.nextInt();
        hy=sc.nextInt();
        circum=(b+h+hy);
        System.out.println("Circumference of Triangle:"+circum);
    }
    }
class Check
{
public static void main(String ts7[])
    {
        Scanner sc=new Scanner(System.in);
        Triangle ob=new Triangle();
        int ch;
        System.out.println("Enter:\n1.Area\n2.Rectangle\n3.Call Colour\n4.Call Weight");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1: ob.findArea(); break;
            case 2: ob.findCircumference(); break;
            case 3: ob.getWeight(); break;
            case 4: ob.getColour(); break;
            default: System.out.println("Thik kore chap");
        }
        System.out.println("Colour:"+ob.colour); 
        System.out.println("Weight:"+ob.weight); 
            
    }
}
