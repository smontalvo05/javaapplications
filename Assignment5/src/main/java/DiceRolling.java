//The files purpose is roll two separate dies and display results of total of each die to the user after rolling the dice 36,000 times. 
//CSIS 212-D04
import java.util.Random;//Random API

public class DiceRolling {
    public static void main (String[] args)//main method
    {
      System.out.println("Steve Montalvo - Assignment 5 Exercise 6.17");//my name
       int[] diceTotal = new int[11]; //Integer Array to place dice totals
        
        rollDice(diceTotal);//method call rollDice 
        display(diceTotal);//method cal display
        
        
    }
    
    public static int[] rollDice (int[] diceTotal)//method to roll die's
    {
        
        Random rndm = new Random();//instantiate random API//instantiate random API
        
        for (int counter=0; counter < 36000; counter++)//loop to roll dice 36,000 times
        {
           int die = 1+ rndm.nextInt(6);//variable to hold die value of die 1
           int die2 = 1+ rndm.nextInt(6);//variable to hold die value of die 2
           int total = die + die2;// variable to hold sum of die 1 and 2 
           
           switch (total)//switch statement to check total and add count to array total 
           {
               case 2:
                   diceTotal[0] +=1;
                   break;
               case 3:
                   diceTotal[1] +=1;
                   break;
                case 4:
                    diceTotal[2] +=1;
                   break;
                case 5:
                    diceTotal[3] +=1;
                    break;
                case 6:
                    diceTotal[4] +=1;
                    break;
                case 7:
                    diceTotal[5] +=1;
                    break;
                case 8:
                    diceTotal[6] +=1;
                    break;
                case 9:
                    diceTotal[7] +=1;
                    break;
                case 10:
                    diceTotal[8] +=1;
                    break;
                case 11:
                    diceTotal[9] +=1;
                    break;
                case 12:
                    diceTotal[10] +=1;
                    break;

           }
        }
        
        return diceTotal;//return array back to main method after method is finished
    }
    
    public static void display (int[] x)//display results in tabular format
    {
        int dieNumber =2;//variable to show total of each die starting with 2
        System.out.printf("%5s     %5s%n","Dice Total", "Dice Rolled Amount");//display string format only once
        for (int counter = 0; counter<x.length; counter++)//loop to display what is in array in tabluar format
        {
            System.out.printf("%5d %20d%n",dieNumber,x[counter]);//display results to user
            ++dieNumber;//increase counter through array.length
        }
         
    }
}
