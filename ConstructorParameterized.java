import java.util.Scanner;
class Student
{
	String name;
	int roll_no;
	Student(String na,int roll)
	{
		name = na;
		roll_no = roll;
	}
	void read()
	{
		System.out.println("Name of the Student: "+name);
		System.out.println("Rollno of the Student: "+roll_no);
	}
}
class ConstructorParameterized
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Rollno: ");
		int roll = sc.nextInt();
		Student stu1 = new Student(name,roll);
		stu1.read();
	}
}
