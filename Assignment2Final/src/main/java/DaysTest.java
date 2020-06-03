
public class DaysTest //DaysTest Class to test days class
{
    public static void main (String[] args)//main method
    {
            System.out.println("Steve Montalvo - Assignment2 Final");//my name and assignment number
            Days day = new Days();//instantiate day object
            String userInput = day.displayMenu();//cal method userInput to display menu and capture userInput and store in variable userInput.
            userInput = day.checkUserInputFromMenu(userInput);//call method to check userInput against enum and if not correct to let user know and try again until correct.
            day.getHoursOfOperation(userInput);//method call to get hours of operation. 
            System.out.print(day.toString());//method call to display hours of operation.
        
    }
    
}
