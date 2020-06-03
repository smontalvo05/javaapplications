//The files purpose is store information from the user as an abstract class that can be used as a superclass for other types of employees. 
//CSIS 212-D04
public abstract class Employee 
{
      private final String firstName;//variable to hold name of employee
      private final String lastName;//variable to hold last name of employee
      private final String socialSecurityNumber;//variable to hold social security of employee
      private final String birthday;//variable to hold birthday of employee
      
       // constructor
      public Employee (String firstName, String lastName, String socialSecurityNumber, String birthday) 
      {
         this.firstName = firstName;
         this.lastName = lastName;
         this.socialSecurityNumber = socialSecurityNumber;
         this.birthday = birthday;
      }

      // return first name
      public String getFirstName() 
      {
          return firstName;
      }

      // return last name
      public String getLastName() 
      {
          return lastName;
      }

      // return social security number
      public String getSocialSecurityNumber() 
      {
          return socialSecurityNumber;
      }
      
      public String getBirthday()//return birthday
      {
          
          return birthday;
      }

      // return String representation of Employee object
     @Override
     public String toString() 
     {
         return String.format("%s %s%nsocial security number: %s%nBirthday: %s",getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthday());
     }

      // abstract method must be overridden by concrete subclasses
      public abstract double earnings(); // no implementation here
    
}
