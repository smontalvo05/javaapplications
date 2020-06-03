//The files purpose is to display only odd numbers products.
//CSIS 212-D04
public class Calculation {
    
        public static void main(String[] args)//main method
        {
            System.out.println("Steve Montalvo - Assignment 3 Exercise 4.12");
            
            int valueCalculation=1;// to store calculation after math equation
            
            for (int number = 1; number<=15; number+=2)//logic to run through only the odd numbers from 1-15
            {
                valueCalculation = number*valueCalculation;// calculation to send through each number
            }
            System.out.printf("Product of all the odd integers is: %d%n", valueCalculation);//report to user what is the product of all the odd integers together.
                
            
        }
    }
    

