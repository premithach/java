import java.util.Scanner;
class Student
{
	String name;
	int roll_no;
	Student()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		name = sc.nextLine();
		System.out.print("Enter Rollno: ");
		roll_no = sc.nextInt();
	}
	void read()
	{
		System.out.println("Name of the Student: "+name);
		System.out.println("Rollno of the Student: "+roll_no);
	}
}
class ConstructorDefault
{
	public static void main(String args[])
	{
		Student stu1 = new Student();
		stu1.read();
	}
}
