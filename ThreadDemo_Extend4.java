class T1 extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("i="+(++i));
		}
		System.out.println("This code is running in a thread1");
		System.out.println("Thread Name:"+getName());
		System.out.println("Thread priority:"+getPriority());
		//Thread priorities are integers we can use min,max and Norm other than numbers
		System.out.println("Thread State:"+getState());
	}
}
class T2 extends Thread{
	public void run()
	{   for(int i=0;i<5;i++)
		{
			System.out.println("i="+(i++));
		}
		System.out.println("This code is running in a thread2");
		System.out.println("Thread Name:"+getName());
		System.out.println("Thread priority:"+getPriority());
		//Thread priorities are integers we can use min,max and Norm other than numbers
		System.out.println("Thread State:"+getState());
	}
}
public class ThreadDemo_Extend4
{
	public static void main(String args[])
	{
		T1 obj1=new T1();
		T2 obj2=new T2();
		obj1.setName("odd numbers");
		obj1.start();//when we call start method then run method is invoking when we comment that then run method won't exectute
		//Thread t1=Thread.Currentna
		obj2.start();
		obj2.setName("even numbers");
		obj2.setPriority(10);
		System.out.println("This code is outside of a thread");
	}
}