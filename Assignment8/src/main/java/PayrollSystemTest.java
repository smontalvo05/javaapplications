//The files purpose is test payroll system. 
//CSIS 212-D04
import java.util.Scanner;//API

public class PayrollSystemTest  
{
    public static void main(String[] args) //main method
    {
        System.out.print("Steve Montalvo - Assignment 8 Excerise 10.12\n");//my name and assignment number
        Scanner input = new Scanner(System.in);//instantiate API
        
        Date [] employeeBirthday = new Date[4];//array to store employeeBirthdays
        Date employeeBirthday1 = new Date(12,22,1986);//instantiate employee1 birthday
        Date employeeBirthday2 = new Date(11,26,1992);//instantiate employee2 birthday
        Date employeeBirthday3 = new Date(01,16,2016);//instantiate employee3 birthday
        Date employeeBirthday4 = new Date(04,16,2017);//instantiate employee4 birthday
 
            employeeBirthday[0]=employeeBirthday1;//set employee birthday to array
            employeeBirthday[1]=employeeBirthday2;//set employee birthday to array
            employeeBirthday[2]=employeeBirthday3;//set employee birthday to array
            employeeBirthday[3]=employeeBirthday4;//set employee birthday to array
        
        
          // create subclass objects                                          
         SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", employeeBirthday[0].toString(), 800.00);    
         HourlyEmployee hourlyEmployee =  new HourlyEmployee("Karen", "Price", "222-22-2222",employeeBirthday[1].toString(), 16.75, 160);  
         CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333",employeeBirthday[2].toString(), 10000, .06);                      
         BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444",employeeBirthday[3].toString(), 5000, .04, 300);                  

        // create four-element Employee array
         Employee[] employees = new Employee[4];  

         // initialize array with Employees          
         employees[0] = salariedEmployee;            
         employees[1] = hourlyEmployee;              
         employees[2] = commissionEmployee;          
         employees[3] = basePlusCommissionEmployee; 
         
         //request input from user to find out what month it is.
         System.out.printf("Please enter the current Month i.e September as 09 December as 12: ");
         int currentMonth = input.nextInt();//store input in variable currentMonth
         System.out.println();//jump one space.
         
         // generically process each element in array employees
         for (Employee currentEmployee : employees) 
         {
            System.out.println(currentEmployee); // invokes toString
            // determine whether element is a SalariedEmployee and process
             if (currentEmployee instanceof SalariedEmployee) 
            {
                //Check if current month enter is employee birth month.
                 if (currentMonth == employeeBirthday[0].getMonth())
                {
                    double bonus = currentEmployee.earnings() + 100;//add 100 to earnings for this month only.
                    System.out.printf("Earnings for Birthday with $100 Bonus Money is: $%,.2f%n", bonus);
                }
            }
             // determine whether element is a HourlyEmployee
            if (currentEmployee instanceof HourlyEmployee) 
            {
                //Check if current month enter is employee birth month.
                if (currentMonth == employeeBirthday[1].getMonth())
                {
                    double bonus = currentEmployee.earnings() + 100;//add 100 to earnings for this month only.
                    System.out.printf("Earnings for Birthday with $100 Bonus Money is: $%,.2f%n", bonus);
                }

            }
                // determine whether element is a CommissionEmployee
            if (currentEmployee instanceof CommissionEmployee) 
            {
                //Check if current month enter is employee birth month.
                if (currentMonth == employeeBirthday[2].getMonth())
                {
                    double bonus = currentEmployee.earnings() + 100;//add 100 to earnings for this month only.
                    System.out.printf("Earnings for Birthday with $100 Bonus Money is: $%,.2f%n", bonus);
                }

            }
            // determine whether element is a BasePlusCommissionEmployee
            if (currentEmployee instanceof BasePlusCommissionEmployee) 
            {
                //Check if current month enter is employee birth month.
                if (currentMonth == employeeBirthday[3].getMonth())
                {
                    double bonus = currentEmployee.earnings() + 100;//add 100 to earnings for this month only.
                    System.out.printf("Earnings for Birthday Month with $100 Bonus Money is: $%,.2f%n", bonus);
                }
            }
                System.out.printf( "Regular Monthly earning $%,.2f%n%n", currentEmployee.earnings());
        }
    }
            
}

                                                         
      

