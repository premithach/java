class TryCatch{
	public static void main(String args[]){
		try{
			System.out.println("HI");
			//System.out.println(12/0);
			System.out.println("Welcome");
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
	}
}

//if we r printing 12/0 then it will get error java.lang.ArithmeticException: / by zero, it will print hi 