class CommandLine
{
	public static void main(String[] args)
	{
		System.out.println("\nCommand-Line arguments are");
		
		//loop through all arguments
		for(String str: args) 
		{
			System.out.println(str);
		}
	}
}