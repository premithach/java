class ParamCons
{
	int id;
	String name;
	ParamCons(int i,String n)
	{
		id=i;
		name=n;
	}
	//method to display the values
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String args[])
	{
		ParamCons s1=new
		ParamCons(111,"Karan");
		ParamCons s2=new
		ParamCons(222,"Aryan");
		//calling method to display the values of object
		s1.display();
		s2.display();
	}
}
	