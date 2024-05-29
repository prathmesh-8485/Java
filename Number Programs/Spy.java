import java.util.Scanner ;

class Spy
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number :");
        int a =sc.nextInt();
        int sum =0 ;
        int prod =1 ;

        while(a > 0)
        {
        	int rem =a % 10;
        	sum += rem ;
        	prod *= rem ;
        	a/=10;
        }

        System.out.println(prod == sum ? "It is a Spy Number":"Not a Spy Number ");
		
	}
}