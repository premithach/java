//Java Program to create and call a default constructor  
class DefaultConstructor
{
	//creating a default constructor  
	int Roll_no;
	String Name;
	DefaultConstructor()
	{
		System.out.println("Welcome to Java");
		System.out.println("Student Roll_no:"+Roll_no);
		System.out.println("Student Name:"+Name);
	}
	//main method
	public static void main(String args[])
	{
		//calling a default constructor  
		DefaultConstructor b=new DefaultConstructor();  
	}  
}