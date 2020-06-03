//The files purpose is give multiplication questions to the user.
//CSIS 212-D04
import java.util.Scanner;//API to recieve input from user
import java.util.Random;//API to randomize numbers


public class ComputerAssistedInstruction {

    public static void main (String[] args)//main method
    {
        System.out.print("Steve Montalvo - Assignment 4 Exercise5.35");
        
        int counter =1;//counter to keep the questions going up to 3
        
        while (counter<=3)//loop to keep new questions coming
        {
            int result = multiplication();//method call for new question generations
            userInput(result);//method to check user input
            
            if (counter<3)//loop to see if this question is necessary
            {
            System.out.println("Here is your next question: ");// let the user know here is the new question
            }
            ++counter;//increase counter by one
            
        }
    }
     public static int multiplication()//method to generate new numbers for questions and multiplication.
    {
        
        Random rand = new Random();// random initialized
        int x = rand.nextInt(10);//random variable up to 10
        int y = rand.nextInt(10);//random variable up to 10
        int result = x*y;//equation for multiplication
        System.out.printf("What is the answer when you multiply? %d * %d%n Your Answer: ",x, y);//show the user the problem equation
        return result;//return result from the equation
        
    }
     
    public static void userInput (int result)//method to check user input.
    {
        Scanner input = new Scanner (System.in);//initialized Scanner API
       
       int userAnswer = input.nextInt();//variable to store users answer
      
        while(userAnswer != result)//loop to tell the user they entered the incorrect answer
        {
           System.out.print("No, Please try again!\n Your Answer: ");//feedback to user
           userAnswer = input.nextInt();//variable to recheck the users input
            
        }
        if (userAnswer==result)//loop to check if the user is correct
            {
                System.out.println("Very Good!");//feedback to user
                
            }
    }
    
}   
    
   
    

