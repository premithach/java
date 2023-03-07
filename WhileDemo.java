class WhileDemo
{
	public static void main(String args[])
	{
		int i=100;
		int j=200;
		while(++i>--j);
		//while(++i<--j);
		System.out.println(i);
	}
}