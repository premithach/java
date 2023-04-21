/* 3. Create two classes Named Student and Teacher with required data members. Assume that the information about the Student 
and Teacher is stored in a text file. Read n and m number of Student  and Teacher information from the File. Store the 
information in Array list of type Student and Teacher Array List<Student> and Array List<Teacher>. Print the information of 
Teacher who taught OOPS and Maths. Use Iterator and other functions of util in your program. */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Student {
    private String name;
    private int rollNo;
    private float cgpa;
    
    public Student(String name, int rollNo, float cgpa) {
        this.name = name;
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }
    
    public String getName() {
        return name;
    }
    
    public int getRollNo() {
        return rollNo;
    }
    
    public float getCGPA() {
        return cgpa;
    }
}

class Teacher {
    private String name;
    private String subject;
    
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSubject() {
        return subject;
    }
}

public class MainClass3 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        
        try {
            File file = new File("students_and_teachers.txt");
            Scanner scanner = new Scanner(file);
            
            int numStudents = scanner.nextInt();
            for (int i = 0; i < numStudents; i++) {
                String name = scanner.next();
                int rollNo = scanner.nextInt();
                float cgpa = scanner.nextFloat();
                
                Student student = new Student(name, rollNo, cgpa);
                students.add(student);
            }
            
            int numTeachers = scanner.nextInt();
            for (int i = 0; i < numTeachers; i++) {
                String name = scanner.next();
                String subject = scanner.next();
                
                Teacher teacher = new Teacher(name, subject);
                teachers.add(teacher);
            }
            
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        
        System.out.println("Teachers who taught OOPS and Maths:");
        Iterator<Teacher> iterator = teachers.iterator();
        while (iterator.hasNext()) {
            Teacher teacher = iterator.next();
            if (teacher.getSubject().equals("OOPS") || teacher.getSubject().equals("Maths")) {
                System.out.println(teacher.getName());
            }
        }
    }
}
