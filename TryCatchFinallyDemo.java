class TryCatchFinallyDemo{
	public static void main(String args[]){
		try{
			int data=50/0;  //may throw exception
			System.out.println(data);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code");
	}
}