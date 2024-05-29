import java.util.Scanner ;

class ReversePrime
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number :");
        int a =sc.nextInt();
        int count =0 ;
        int rev =0;
        
        for(int i=1;i<=a;i++)
        {
        	if(a%i==0)
        	{
        		count++;
        	}
        }
        while(a>0)
        {
        	int rem=a%10;
        	    rev=rev*10+rem;
        	a/=10;
        }
        for(int i=1;i<=rev;i++)
        {
        	if(rev%i==0)
        		count++;
        }
        if(count == 4)
        {
        	System.out.println("It is a perfect prime ");
        }
        else
        {
        	System.out.println("not a perfect prime number ");
        }
    }

}
