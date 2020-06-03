//The files purpose is store information from the user for a SalariedEmployee that extends from Employee. 
//CSIS 212-D04
public class SalariedEmployee extends Employee //class inherits from Employee
{
     private double monthlySalary;//variable to add weekly salary
 
       // constructor
      public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, String birthday, double weeklySalary) 
      {
         super(firstName, lastName, socialSecurityNumber, birthday);//instantiate superclass 

         if (weeklySalary < 0.0) {
            throw new IllegalArgumentException(
               "Weekly salary must be >= 0.0");
         }

         this.monthlySalary = weeklySalary*4;
      }

      // set salary
      public void setMonthlySalary(double weeklySalary) 
      {
         if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
         }

         this.monthlySalary = weeklySalary*4;
      }

      // return salary
      public double getMonthlySalary()
      {
          return monthlySalary;
      }

      // calculate earnings; override abstract method earnings in Employee
      @Override                                                           
      public double earnings() 
      {
          return getMonthlySalary();
      }                

      // return String representation of SalariedEmployee object   
      @Override                                                    
      public String toString() 
      {                                   
         return String.format("salaried employee: %s%n%s: $%,.2f",super.toString(), "weekly salary", getMonthlySalary()); 
      }      
}
