import java.util.Scanner ;

class SumOfDigit1
{
	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();

		int sum=0;
		while(num != 0)
		{
			int rem=num%10;
            sum+=rem;
		}
		System.out.println("SUm of digits is :"+sum);
	}
}
