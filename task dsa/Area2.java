import java.util.*;
class Area2
{
    double length;
    float breadth;
    public void returnArea(double length, float breadth)
    {
        this.length = length;
        this.breadth = breadth; 
    }    

    public static void main(String[] args)
    {
        Area2 a = new Area2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length : ");
        double length = sc.nextDouble();
        System.out.println("Please enter the breadth : ");
        double breadth = sc.nextFloat();     
        System.out.println("Length of rectangle is : " + length );
        System.out.println("breadth of rectangle is : " + breadth );
        System.out.println("Area of rectangle is : " + (length * breadth));
        sc.close();
    }
}
