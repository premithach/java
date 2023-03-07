abstract class A{
	abstract void dis();
	void show()
	{
		System.out.println("Hi!");
	}

}

class B extends A{
	void dis(){
		System.out.println("This is child method");
	}
}

class AbstractDemo1
{
	public static void main(String args[]){
		A o1=new B();
		o1.dis();
	}
}

//abstract class also holds the general methods