import java.util.Scanner;//API

public class Days //class days
{
    private enum daysOfTheWeek{Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday};//private variable enum to set days of the week
    private final String[] workHours; //variable string array work hours
    private Scanner input;//variable input for Scanner object
    private daysOfTheWeek day;//variable daysOfTheWeek day 
    private int location;//variable to hold location of the enum 
    private final daysOfTheWeek[] dayOfTheWeek;//variable to hold String[] when daysOfTheWeek is converted.
    
    public Days() //converter
    {
        this.day = daysOfTheWeek.Sunday;//instantiate day variable
        this.workHours = new String[]{"8:00AM -5:00PM", "7:30AM - 4:30PM", "9:00AM - 3:00PM", "10:30AM - 6:00PM", "10:00AM - 2:30PM", "6:00AM -6:00PM", "12:00PM - 5:00PM"};//instantiate workhours with hours
        this.location = 0;//instantiate location variable
        this.dayOfTheWeek = daysOfTheWeek.values();//instantiate convert enum into a String[]
        this.input = new Scanner (System.in);//instantiate API
    }
    
    public void setDay(daysOfTheWeek day)//set day
    {
        this.day = day;
    }
    
    public void setLocation (int location)//set location
    {
         this.location = location;
    }
    
    public int getLocation()//get location
    {
        return location;
    }
    
   
    public String checkUserInputFromMenu(String userInput)//method to check userInput from Menu display
    {
     
        int x =0;//variable to keep loop going if answer incorrect
                
                while(x<=0)//loop
                {
                          try//try to ValueOf method to check against enum and see if input from user is correct with the enum
                             {
                              daysOfTheWeek.valueOf(userInput);
                              x++;//add one to loop to take it out of the loop.
                             }
                          catch(IllegalArgumentException e)//catch exception handling and display to user that he has entered an invalid response.
                             {
                               System.out.printf("%s entered is not valid please select one of the days in menu.%n",userInput);//message to display user has entered value that is not accepted
                               userInput = displayMenu();//display menu method and have user try again.
                             }
                }
                return userInput;
    }
    public String displayMenu()//display menu method
    {
                     
                      for(int i = 1; i<dayOfTheWeek.length;i++)//loop to display what is in the dayOfTheWeek array
                      {
                         System.out.printf("%d. %s%n",i,dayOfTheWeek[i]);//format to display what is in the array
                      }

                       System.out.printf("Please select a day from the menu: ");//tell user to enter a response
                       String userInput = input.next();//capture userResponse in variable UserInput
                       
          return userInput;//return UserInput
    }
    public void getHoursOfOperation (String userInput)//method to set and day and location from userInput
    {
        
        
        switch(daysOfTheWeek.valueOf(userInput))//switch method to set day and location after checking with enum what if userInput is correct
                {
                    case Sunday:
                        setDay(daysOfTheWeek.Sunday);//call method to set day
                        setLocation(daysOfTheWeek.Sunday.ordinal());//call method to set location
                        break;
                    case Monday:
                        setDay(daysOfTheWeek.Monday);//call method to set day
                        setLocation(daysOfTheWeek.Monday.ordinal());//call method to set location
                        break;
                    case Tuesday:
                        setDay(daysOfTheWeek.Tuesday);//call method to set day
                        setLocation(daysOfTheWeek.Tuesday.ordinal());//call method to set location
                        break;
                    case Wednesday:
                        setDay(daysOfTheWeek.Wednesday);//call method to set day
                        setLocation(daysOfTheWeek.Wednesday.ordinal());//call method to set location
                        break;
                    case Thursday:
                        setDay(daysOfTheWeek.Thursday);//call method to set day
                        setLocation(daysOfTheWeek.Thursday.ordinal());//call method to set location
                        break;
                    case Friday:
                        setDay(daysOfTheWeek.Friday);//call method to set day
                        setLocation(daysOfTheWeek.Friday.ordinal());//call method to set location
                        break;
                    case Saturday:
                        setDay(daysOfTheWeek.Saturday);//call method to set day
                        setLocation(daysOfTheWeek.Saturday.ordinal());//call method to set location
                        break;
                }
    }
@Override    
public String toString()//override string method from object class to display information needed 
    {
     return String.format("%s hours are %s", day.toString(), workHours[getLocation()]);
    }

}
