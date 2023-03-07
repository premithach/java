class ForEach1
{
	public static void main(String args[])
	{
		int n1[]={1,2,3,4,5,6,7,8,9,10};
		int sum1=0;
		for(int i=0;i<10;i++) sum1+=n1[i];
		System.out.println("sum1:"+sum1);
		int n2[]={1,2,3,4,5,6,7,8,9,10};
		int sum2=0;
		for(int i:n2) sum2+=i;
		System.out.println("sum2:"+sum2);
	}
}