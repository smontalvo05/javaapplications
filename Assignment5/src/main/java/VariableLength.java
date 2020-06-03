//The files purpose is store information in ArrayList and calculate it through a method and then display the results. 
//CSIS 212-D04
import java.util.Scanner;// API for user input
import java.util.ArrayList;//API for ArrayList

public class VariableLength 
{
  
        public static void main (String[] args)//Main Method
        {
               System.out.println("Steve Montalvo - Assignment 5 Exercise 6.14");//my name and assignment number

               int counter = 1;// to keep count of how many time is has looped
               
               while (counter<3)// loop to ask the code to repeat two times.
                {
                     ArrayList <Integer> array = new ArrayList <>(); //ArrayList to store List.
                     
                     array = userInput(array); //method call to have user input information and store it in first list.

                     int totalArray = product(array);// method call to take input and calculate the users input and store in total arraylist

                     display (totalArray, counter, array); //method call to display result.
                     
                     counter++;//add one to the counter. 
                }
		
        }  
        

        public static ArrayList<Integer> userInput (ArrayList<Integer> interger) //method to have user input data.
        {
            Scanner input = new Scanner(System.in); //instantiate user input
            
            String answer = "Yes";//instantiate answer
            
            while (answer != "No")// loop to keep entering integers if the user chooses to.
            {
                   System.out.print("Please enter a integer: ");//request user input
                   interger.add(input.nextInt());//take user input and add it to the List
                   System.out.print("Do you want to add another integer type Yes or No: ");//question to ask the user if they want to add another number
                   answer = input.next();//store answer in answer variable
                   
                switch (answer)//switch statement to check answer from user and keep the loop going if select yes or end loop if choose no.
                {
                    case "yes":
                        answer = "Yes";
                        break;
                    case "Yes":
                        answer = "Yes";
                        break;
                    case "no":
                        answer = "No";
                        break;
                    case "No":
                        answer = "No";
                        break;
                }
       
            }
 
                return interger;//return result 
        }
        
        public static int product (ArrayList<Integer> x) //method call to calculate the user input 
        {
            
            int total = 1;// variable to store total of the List
            
            for (int counter =0; counter < x.size(); counter++)//loop to go through the ArrayList 
            {
                total = total*x.get(counter);//calculation of the total ArrayList and store it in total
            }
            return total; //return total from the ArrayList calculation
        }
        
        public static void display (int total, int counter, ArrayList <Integer> integer)//method to display user total
        {
                System.out.printf("The total for ArrayList #%d is: %d%n",counter, total);// tell the user the total 
                
                for (int counters =0; counters <integer.size(); counters++)//loop to remove items in list to clean the list out.
                {
                    integer.remove(counters);//remove items
                }
   
        }
}
