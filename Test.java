class Person{  //superclass Person
	Person()
	{
		System.out.println("Person class Constructor");
	}
}
//subclass student extending the person class
class Student extends Person{
	Student()
	{
		//invoke or call parent class constructor
		super();
		System.out.println("Student class Constructor");
	}
}
class Test{
	public static void main(String[] args)
	{
		Student s =new Student();
	}
}
