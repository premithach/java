class T1 extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("i="+(++i));
		}
		System.out.println("T1 Name:"+getName());
	}
}
class T2 extends Thread{
	public void run()
	{   for(int i=0;i<5;i++)
		{
			System.out.println("i="+(i++));
		}
		System.out.println("T2 Name:"+getName());
	}
}
public class ThreadDemo_Extend5
{
	public static void main(String args[])
	{
		T1 obj1=new T1();
		T2 obj2=new T2();
		obj1.setName("odd numbers");
		//obj1.start();
		obj2.start();
		obj2.setName("even numbers");
		
		try{
			obj1.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("This code is outside of a thread");
		obj1.start();
		System.out.println("Main thread");
		
	}
}
