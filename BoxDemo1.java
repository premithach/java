import java.util.Scanner;
class Box
{
	double width;
	double hieght;
	double depth;
}
class BoxDemo1
{
	public static void main(String args[])
	{
		Box mybox = new Box();
		double vol;
		
		Scanner ob=new Scanner(System.in);
		mybox.width = ob.nextDouble();
		mybox.hieght = ob.nextDouble();
		mybox.depth = ob.nextDouble();
		
		vol=mybox.width*mybox.hieght*mybox.depth;
		System.out.println("Volume is " +vol);
	}
}