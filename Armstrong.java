import java.util.Scanner;
class Armstrong
{
    public static void main(String[] args)
    {
        int n,num,Sum = 0, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            r = num % 10;
            Sum = Sum + (r * r * r);
            num = num / 10;
        }
        if (n == Sum)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }
    }
}
