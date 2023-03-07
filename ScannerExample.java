import java.util.Scanner;
class ScannerExample
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);    //creating obj
		System.out.println("Enter Username");
		String name=obj.nextLine();
		System.out.println("Your name is: "+name);
	}
}