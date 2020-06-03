import javax.swing.JOptionPane;//API for communication box
import java.util.Arrays;//API for Arrays
public class StudentTest 
{
    
     static int[] studentId = {1234,1245,2258,5568,4567,1235,5321,7894,8585,9746};//10 elements to studentId array initiated
     static String [] firstName ={"John", "James", "Maria","Paul","Steve","Micheal","Biddie","Allie","Whitney","Emilia"};//10 elements to firstName array initiated
     static double[] gradePointAverage = {3.4,3.0,2.5,2.0,3.7,2.6,2.8,3.1,3.8,4.0};//10 elements to gradePointAverage array initiated made static to make it available through the whole class
    
public static void main(String[] args)//main method
    {
        String id = captureId();//show message and capture string
        int x = idParse(id);// variable x is collecting return from displayBox method and storing it in x
        startProgram(x,id);//startProgram methos is called with variable x as a peremeter to show user if information is correct or not

    }
    
public static int idParse(String id)
    {
        int i = 0;//control for while loop
         while (i<=0)//while loop to keep the program running if i is <=0
         {
                try 
                {
                     i = Integer.parseInt(id);//parse response that is a String to Int
                }

                catch (IllegalArgumentException e)//catch exception if anything but an integer is entered
                {
                    String message = String.format("%s not a valid response. Please try again.",id);//store user name in string format
                    JOptionPane.showMessageDialog(null, message);//show user that the value entere was not accepted
                    id = captureId();
                }
         }

     int location = Arrays.binarySearch(studentId, i);//return value to main method.//variable to store location of student ID

        return location;
    }

    public static void startProgram(int location, String id)//argument sent from displayBox
    {
            while (!(location>=0))//checking if argument is not greater than or equal to 0 loop will keep telling user to enter a correct ID if no ID is found
            {
              String message = String.format("%s not found in studentId. Please try again.",id);//store user name in string format
              JOptionPane.showMessageDialog(null, message);//display message in dialoug box
              id = captureId();//call method to capture string Id
              location = idParse(id);//pass string id to parse id method and find location 
            }
                
            if (location >= 0) //if value is found display student name gpa and ID information to user.
            {
               String message = String.format("Student First Name: %s%nStudent's GPA is: %.2f%nStudent ID#: %s ",firstName[location],gradePointAverage[location],id);//store user name in string format
               JOptionPane.showMessageDialog(null, message);//display message in dialoug box
            }
    }
    
    public static String captureId()
    {
        String id;
        return id = JOptionPane.showInputDialog("What is your Student ID?");//request input from user
    }

}
    

