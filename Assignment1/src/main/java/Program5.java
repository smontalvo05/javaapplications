//Program1 the files purpose is to complete Assignment 1 with Program 1
//CSIS 212-D04LUO

import java.util.Scanner;//API Source: https://watch.liberty.edu/playlist/dedicated/99781741/1_a6u530io/1_24exs93t 

public class Program5 //class
{

public static void main (String[] args)//main method
{
System.out.println("Steve Montalvo - Assignment 1\n");    
Scanner input = new Scanner (System.in);//instantiate scanner
int number1;// store number 1
int number2;// store number 2
int remainder;// store calculation

System.out.println("Please enter the first number: ");// ask user for input
number1 = input.nextInt();//store input

System.out.println("Please enter the second number: ");// ask user for input
number2 = input.nextInt();//store input

remainder = number1%number2;//calculate remainder of the two numbers Source: https://watch.liberty.edu/playlist/dedicated/99781741/1_a6u530io/1_24exs93t

if (remainder == 0)//logic question to see if they are an integer
    System.out.printf("%d is an integer of %d",number1, number2);//result out to user if logic fits

if (remainder != 0)//logic question to see if they are an integer
    System.out.printf("%d is not an interger of %d",number1, number2);//result out to user if logic fits

}
}
