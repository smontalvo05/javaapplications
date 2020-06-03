//The files purpose is store information from the user from the Rectangle Test class and calculate the total area and total perimeter. 
//CSIS 212-D04
import java.util.Scanner;//API

public class Rectangle//class rectangle
{
    private double length;//set variable double to store length in class rectangle
    private double width;//set variable double to store width in class rectangle
    private double totalPerimeter;//set variable double to store total calculation for perimeter 
    private double totalArea;//set variable double to store total area calculation.
    Scanner input = new Scanner(System.in);//instantiate Scanner API
    
    public Rectangle ()//constructor to set length and width to 1 when object is created.
    {
        length = 1;
        width =1;
        
    }
    public double calculatePerimeter ()//method to calculate the perimeter to the rectangle
    {
       return totalPerimeter = length + width +length +width;//calculation of a perimeter is 2(Length+width)
    }
    
    public double calculateArea()//method to calculate the area of the rectangle
    {
        return totalArea = length*width;
    }
    
    public double getTotalPerimeter()//method to get Perimeter value 
    {
        return totalPerimeter;
    }
    
    public double getTotalArea()//method to get Area Value
    {
        return totalArea;
    }
       
    public void setLength (double length)//method to check the user Input is between 0.0 and 20.0
    {
        if (length <= 0.0 || length > 20.0)
        {
            throw new IllegalArgumentException("You have not selected a valid choice please select a number between 0.0 and 20.0:" );
            
        }
        
        
         this.length = length;//store if number is between perameters.
    }
    
    public double getLength ()//method to get store value in Length
    {
        return length;
    }
    
    public void setWidth(double width)////method to check the user Input is between 0.0 and 20.0
    {
        if (length <= 0.0 || length > 20.0)
        {
            throw new IllegalArgumentException("You have not selected a valid choice please select a number between 0.0 and 20.0:" );
            
        }
        this.width = width;//store if number is between perameters.
    }
    
    public double getWidth ()//method to get store value in Length
    {
        
        return width;
    }
    
     


   
    
}
