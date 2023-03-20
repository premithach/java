class T1 extends Thread{
	public void run(){
		System.out.println("Thread 1");
	}
}
public class ThreadDemo_Extend
{
	public static void main(String args[]){
		T1 obj1=new T1();
		obj1.start();
		System.out.println("This code is outside of the thread");
	}
}