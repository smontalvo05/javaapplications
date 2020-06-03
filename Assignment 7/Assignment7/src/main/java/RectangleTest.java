//The files purpose is request input form user and then call the Rectangle Class to calculate Area and Perimeter and display it to the user. 
//CSIS 212-D04
import java.util.Scanner;//API

public class RectangleTest {//class to test class Rectangle
    
   static Scanner input = new Scanner(System.in);//static instantiate to use input Scanner through the whole class
   static Rectangle rectangleInput = new Rectangle();//static instantiate to use object Rectangle through the whole class
   static int userChoice;//static variable to use through the whole class.
   
    public static void main (String[] args)//main method
    {
        System.out.println("Steve Montalvo - Assignment 7 Exercise 8.4");//my name and assignment number
        displayMainMenu();//method to show main menu.
        checkUserInput();//method to check userInput.
        menuOptionActions(userChoice);//show total of perimeter.
    }
    public static void displayMainMenu()//show main menu method
    {
        System.out.println("Please select the number next to the option.");
        System.out.print("1. Set Length\n2. Set Width\n3. Exit\n Choice: ");
        
    }
    public static void checkUserInput ()//method to check input from the user to make sure they select only a corresponding menu option
    {
        userChoice = input.nextInt();//store user input in userChoice
        
        while (userChoice!=1&&userChoice!=2&&userChoice!=3)//loop to check user option if valid
            {
                System.out.printf("You did not choose a valid response please choose only the number 1 2 or 3.%nYour Response: ");//display to user that option chosen is not valid and request input again
                userChoice = input.nextInt();//store user response and check again.
            }

    }
    
    public static void menuOptionActions (int userChoice)//method to assign action to take from user choice
    {
        switch (userChoice)//switch statement to check user choice and correct menu option action
            {
                case 1:
                    
                    try {
                        rectangleInput.setLength(userInput("Length"));//call set method from Rectangle and method call to tell the user they choose the corresponding menu option and request input to send to set method
                        }
                    catch (IllegalArgumentException e) 
                          {
                          System.out.printf("%nException while setting Length: %s%n",e.getMessage());//Display message to catch illegal argument.
                          }
                    
                        displayTotal();//display total calculation from Rectangle
                    break;
                case 2:
                    
                     try {
                          rectangleInput.setWidth(userInput("Width"));//call set method from Rectangle and method call to tell the user they choose the corresponding menu option and request input to send to set method
                         }
                    catch (IllegalArgumentException e) 
                          {
                          System.out.printf("%nException while setting Width: %s%n",e.getMessage());//Display message to catch illegal argument.
                          }
                    
                        displayTotal();//display total calculation from Rectangle
                    break;
                case 3:
                    exit();//method call to display to user they chose to exit the program.
                    break;
            }
    }
    
    public static double userInput(String name)//method call to display message to user that they chose a corresponding action
    {
        System.out.printf("You have selected to set the %s.\nPlease enter a number between 0.0 and 20.0: ",name);//display to user they chose menu option
        double userInput = input.nextDouble();//store input from user
        return userInput;//return result to use in set method
    }
    public static void displayTotal ()//method to display total perimeter and total area to the user
    {
        System.out.printf("The total parameter of the rectangle is: %.2f%nThe total area of the rectangle is: %.2f", rectangleInput.calculatePerimeter(), rectangleInput.calculateArea());
    }
    
    public static void exit()//method to show user they exited the program.
    {
        System.out.println("You have exited the program.");
    }
}
