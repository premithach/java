class A{
	final void dis(){
		System.out.println("This is parent method");
	}
}

class B extends A{
	void dishow(){
		System.out.println("This is child method");
	}
}

class FinalDemo
{
	public static void main(String args[]){
		A o1=new A();
		o1.dis();
	}
}