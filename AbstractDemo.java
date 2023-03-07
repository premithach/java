abstract class A{
	abstract void dis();

}

class B extends A{
	void dis(){
		System.out.println("This is child method");
	}
}

class AbstractDemo
{
	public static void main(String args[]){
		A o1=new B();
		o1.dis();
	}
}