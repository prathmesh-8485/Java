import java.util.*;

class vowels
{
	public static void main(String[] args)

	 {
	 	Scanner sc =new Scanner(System.in);
	 	System.out.print("Enter the Name :");
	 	String a = sc.next();

	 	int count =0 ;

	 	for(int i=0 ; i<a.length() ; i++)
	 	{
	 		char b= a.charAt(i);
	 		if(b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u' || b == 'A' || b == 'E' || b == 'I' || b == 'O' || b == 'U')
	 		{
	 			System.out.print(b+" ");
	 			count++;
	 		}
	 	}
	 	System.out.println();
	 	System.out.println("no.of vowels : "+count);

		
	}
}