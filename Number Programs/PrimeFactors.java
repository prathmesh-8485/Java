import java.util.Scanner ;
class PrimeFactors
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.print("ENter the number :");
		int num =sc.nextInt();		
        System.out.print("The Prime Factors are :");
 
		for (int i=1;i<=num ;i++ ) 
		{
			int count =0;
			if(num%i==0)
			{
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				if(count==2)
					System.out.print(i+" ");
			}

			
		}
		
	}
}