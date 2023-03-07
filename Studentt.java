class Studentt
{
	int id;
	String name;
	int age;
	//creating two arg constructor
	Studentt(int i,String n)
	{
		id=i;
		name=n;
	}
	//creating three arg constructor
	Studentt(int i,String n,int a)
	{
		id=i;
		name=n;
		age=a;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String args[])
	{
		Studentt s1=new Studentt(111,"Karan");
		Studentt s2=new Studentt(222,"Aryan");
		s1.display();
		s2.display();
	}
}
	