//The files purpose find out the multiple of 3 pairs of numbers.
//CSIS 212-D04
import java.util.Scanner;//API
public class Multiple {//class name
    
    
    public static void main (String[] args)//main method
    {
        Scanner input = new Scanner (System.in);//instantiate the API
        
        int number1; //variable to store first number
        int number2;// variable to store second number
        int counter = 1; //counter variable to keep count of the loop
        System.out.println("Steve Montalvo - Assignment 4 Exercise 5.16");
        while(counter<=3)//loop to ask the user for three pairs of numbers
        {
            System.out.print("Please enter an integer: ");//ask the user to enter an integer
            number1 = input.nextInt();//method to store user input in number1
            System.out.print("Please enter an integer: ");//ask the user to enter the second integer
            number2 = input.nextInt();//method to store user input in number2
            


            boolean result = isMultiple(number1, number2);//method call to determine if the two numbers are multiples of each other

            showResult(result, number1, number2);//method call to show user results
            ++counter;//add one to the counter
        }
  
    }
    public static boolean isMultiple (int x, int y)//method to determain if two numbers are multiples of each other
    {
        int result;//variable to store if there is a remainder or not
        boolean answer;// variable to store answer if the numbers are variable or not
        result = y%x; //calculation to determain if the two integers are multiples of each other
        
        if (result>0)//boolean to find out if the variable has a remainder
        {
            answer = false;
        }
        
        else 
        {
            answer = true;
        }
              
        return answer;//return the answer of true or false back to the main method
        
    }
    
    public static void showResult(boolean result, int number1, int number2)//method to show the user the results of the calculation
    {
        if (result == false)//boolean to find out if it is true or false to let the user know they are not multiples of each other
        {
            System.out.println(number2+" is not a multiple of "+number1);
        }
        else
        {
            System.out.println(number2+" is a multiple of "+number1);
        }
    }
    
}
