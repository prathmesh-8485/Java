import java.util.Scanner ;

class Armstrong
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number :");
		int num=sc.nextInt();
		int count=0;
		int num1=num;
		int num2=num;
		int sum =0;

		while(num1!=0)
		{
			count ++;
			num1/=10;
		}

		while(num2!=0)
		{
			int rem=num2%10;
			int b=1;

			for(int i=1;i<=count;i++)
			{
				b*=rem;
			}
			sum+=b;
            num2/=10;
		}
		if(sum == num)
		{
          System.out.println(num+ " is a Armstrong number ");
		}
		else 
		{
          System.out.println(num+" is not a armstrong number");
		}
		
	}
}