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
	void happy(){
		System.out.println("This is happy");
	}
}

class AbstractDemo2
{
	public static void main(String args[]){
		B o1=new B();
		o1.dis();
	}
}