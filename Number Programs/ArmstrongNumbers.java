import java.util.Scanner ;

class ArmstrongNumbers
{
	public static void main(String[] args) {
		
		System.out.println("Armstrong numbers :");
		for(int i=1;i<1000000000;i++)
		{
			int temp=i;
			int temp1=i;
			int count=0;
		    int sum=0;
		while(temp>0)
		{
			count++;
			temp/=10;
		}
		while(temp1>0)
		{
			int rem=temp1%10;
			int prod =1;
			for(int j=1;j<=count;j++)
			{
				prod*=rem;
			}
			sum+=prod;
			temp1/=10;
		}
		if(i== sum)
		{
			System.out.println(i);
		}
	}
	}
}