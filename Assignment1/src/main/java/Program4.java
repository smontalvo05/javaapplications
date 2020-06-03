//Program1 the files purpose is to complete Assignment 1 with Program 4
//CSIS 212-D04LUO

import java.util.Scanner; 
public class Program4 
{
public static void main(String[] args)
{
System.out.println("Steve Montalvo - Assignment 1\n");
Scanner input = new Scanner(System.in);//initialize Scanner

int number1; //store first number variable
int number2; // store second number variable
int sum;//store sum of first number and second number
int difference; //store subtraction of first number and second
int product;//store multiplication of first number and second
int division;// store division of first number and second

System.out.println("Please enter your first number:");//asking user a question
number1 = input.nextInt();//caputre input from user

System.out.println("Please enter your second number:");//asking user a question
number2 = input.nextInt();//caputre input from user

sum = number1 + number2;// adding both numbers
difference = number1 - number2; // subtracting both numbers
division = number1/number2;// dividing both numbers
product = number1*number2;//multiply both numbers

System.out.printf("The sum of your numbers is: %d\n",sum); //show user the sum
System.out.printf("The difference of your number is: %d\n",difference);//show user the difference
System.out.printf("The quotient of your numbers is: %d\n", division);//show user the division
System.out.printf("The product of your number is: %d\n", product); //show user the product



}    
}
