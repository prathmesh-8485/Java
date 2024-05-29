import java.util.*;

class lohel
{
	public static void main(String[] args) 
	{
		String a = "hello";
		String b = "lohel";

		char [] c =a.toCharArray();
		char [] d =b.toCharArray();

		Arrays.sort(c);
		Arrays.sort(d);

		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));

		if(Arrays.equals(c,d))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("not an ANagram");
		}
		
	}
}