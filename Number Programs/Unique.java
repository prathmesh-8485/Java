import java.util.Scanner ;

class Unique
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int num =sc.nextInt();
	
		int count=0;
        
		while(num != 0)
		{
			int rem =num % 10;
			num/=10;
			int temp1=num;
			while(temp1 != 0)
			{
				int rem1=temp1%10;
				if(rem == rem1)
				{
					System.out.println("It is not a Unique number");
					count++;
					break;
				}
				temp1/=10;
			}
		}
		if(count==0)
		{
			System.out.println("It is a Unique number");
		}
		
	}
} 