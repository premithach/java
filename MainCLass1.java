/*1. Declare a class Named Teacher. The class will have all the data members(First_Name, Last_Name,Emp_ ID, Dept_Name) as per 
your convenient.The class will have constructors. Write a function to read the values of the class variables. The values of 
the variable will be stored in a FILE (text file). The values will be stored in a structured format of your own choice.Further,
 read the content of the FILE and display the content in an ordered form (First Name, LastName).

Concept Learning:
1. FILE manipulation
2. Use try catch blocks
3. Use multiple try catch block
4. Finally statement
Try to have your own Exception     */


import java.io.IOException;
import java.util.ArrayList;

public class MainClass1{
    public static void main(String[] args) throws IOException {
        // Create a Teacher object
        Teacher teacher = new Teacher("John", "Doe", "1234", "Mathematics");

        // Save the Teacher object to a file
        teacher.saveToFile("teacher.txt");

        // Read the Teacher object from the file
        ArrayList<Teacher> teachers = Teacher.readFromFile("teacher.txt");

        // Print the list of Teacher objects
        for (Teacher t : teachers) {
            System.out.println(t.toString());
        }
    }
}
