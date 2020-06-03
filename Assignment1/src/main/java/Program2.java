import javax.swing.JOptionPane;//API
//Program1 the files purpose is to complete Assignment 1 with Program 2
//CSIS 212-D04LUO

public class Program2 
{
    public static void main(String arg[])//main method
    {
    System.out.println("Steve Montalvo - Assignment 1\n");//name
    String name = JOptionPane.showInputDialog("What is your name?");//request input from user
    
    String message = String.format("Welcome, %s, to Christ Fellowship!\nThe Scripture of the day is: Matthew 6:12", name);//store user name in string format
    
    JOptionPane.showMessageDialog(null, message);//display message in dialoug box
    
    }
}
