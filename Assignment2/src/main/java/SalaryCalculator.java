//The files purpose is to calculate salary for 3 employees.
//CSIS 212-D04
import java.util.Scanner;//API
public class SalaryCalculator 
{
    public static void main(String[] args)//main method
    {
        System.out.print("Steve Montalvo - Assignment 2\n");
        //variables
        Scanner input = new Scanner(System.in);//instaniate API for use
        double regularPay;// regular time pay goes here
        double regHours;// hours less than or equal to 40 entered by user goes here
        double overTimeHours; //remainder of hours over 40 get stored here
        double totalGrossPay;//Total amount goes here
        double overTimePay;//Overtime pay gets stored here
        double overTimeCalculation;//to store overTimepay and hours calculation.
        int employeeAmount = 0;//to not do it more than 3 times
        
        
            while (employeeAmount<=2)//loop to keep enter the 3 employees
            {

                System.out.printf("\nPlease enter employee hours worked: ");// to request user input
                regHours = input.nextDouble();//take user input and put it in regHours.

                System.out.printf("\nPlease enter employee hourly rate: ");//requesting user input
                regularPay = input.nextDouble();//taking user input and storing it in regular pay.
    
                if (regHours<=40)
                {
                    totalGrossPay = regHours*regularPay;// calculation of total gross pay without overTime

                    System.out.printf("Your total Gross Pay for Employee %d without overtime is $%.2f",employeeAmount+1,totalGrossPay); //Displaying result to the user.
                    employeeAmount = employeeAmount +1;//increase amount of employee to get out of loop

                }

                else if (regHours>40)
                {
                   overTimeHours = regHours - 40; // to calculate how many overtime hours are there
                   regHours = regHours - overTimeHours; // to put in the difference of overtime and regular time hours
                   overTimePay = regularPay/2 + regularPay;//to calculate overtime pay
                   overTimeCalculation = overTimeHours * overTimePay;// to give total amount of overtime calculation pay.

                   totalGrossPay = overTimeCalculation + regularPay*regHours;//Calculate total gross pay with overtime

                   System.out.printf("Your total gross pay for Employee %d with overtime is $%.2f",employeeAmount+1,totalGrossPay);//display user the results
                   employeeAmount = employeeAmount +1;//increase amount of employee to get out of loop
                }
            
            }
        
   }
}

