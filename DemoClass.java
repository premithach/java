class DemoClass
{
	int a;
	void display()  //a public method
	//which can only be accessed by objects
	{
		System.out.println("a="+a);
	}
	
	static void show()  //a static method which means that
	//it can be accessed without creating an object of rhe class
	{
		System.out.println("Hi");
	}
	DemoClass()
	{
		System.out.println("****WELCOME****");
	}
	public static void main(String args[])
	{
		DemoClass obj1=new DemoClass();
		System.out.println("a value is"+obj1.a);
		obj1.display();
		show();
	}
}