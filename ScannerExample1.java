import java.util.Scanner;
class ScannerExample1
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);    //creating obj
		System.out.println("Enter your name");
		System.out.println("Enter your roll number");
		System.out.println("Enter your fee");
		String name=obj.nextLine();
		String roll=obj.nextLine();
		String fee=obj.nextLine();
		System.out.println("Your name is: "+name);
		System.out.println("Your roll number is: "+roll);
		System.out.println("Your fee is: "+fee);
	}
}