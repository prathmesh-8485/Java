import java.util.Scanner ;
class Even2
{

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num =sc.nextInt();
		int sum=0;

		while(num!=0)
		{
			int rem=num%10;
			    sum+=rem;
			    num/=10;
		}
		if(sum%2==0)
		{
			System.out.println("sum of digit :"+sum+ " It is Even");
		}
		else 
		{
			System.out.println("sum of digit :"+sum+" is Odd");
		}
	}
}