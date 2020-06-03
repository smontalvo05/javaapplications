//The files purpose is to find out the area of a circle.
//CSIS 212-D04
import java.util.Scanner;

public class CircleArea {
    
    public static void main (String[] args)
    {
        System.out.println("Steve Montalvo - Assignment 4 Exercise 5.20");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the radius of the circle: ");
        double radius = input.nextDouble();
        
        System.out.printf("The area of the circle is: %.2f",circleArea(radius));
      
     }
    
    public static double circleArea (double radius)
    {
        double area = Math.PI*(radius*radius);
        
        return area;
    }
    
}
