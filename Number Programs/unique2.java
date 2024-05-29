import java.util.Scanner ;

class Unique2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		int count=0;
		while(num!=0)
		{
			int rem =num%10;
			num/=10;
			int temp=num;
			while(temp!=0)
			{
				int rem1=temp%10;
				if(rem == rem1)
				{
					System.out.println("not unique");
					count++;
					break;
				}
			temp/=10;
			}
		}
		 if(count==0)
		System.out.println("Unique");

	}
}