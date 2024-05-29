import java.util.Scanner;
class reverseString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name : ");
		String a =sc.next();
		String rev= "";

		for(int i=a.length()-1 ; i>=0 ; i--)
		{
		     rev =rev+a.charAt(i);
		}
		System.out.println("reverse string : "+rev);
	}
}