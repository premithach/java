class CmdNumeric
{
	public static void main(String[] args)
	{
		int sum=0;
		for (String str: args)
		{
		// convert into integer type
		int argument = Integer.parseInt(str);
		//Adding
		sum+=argument;
		}
		System.out.println("Sum="+sum);
	}
}