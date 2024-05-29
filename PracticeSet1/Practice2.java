import java.util.* ;

class Practice2
{
	public static void main(String[] args) 
	{
		ArrayList <String> a =new ArrayList();
		a.add("apple");
		a.add("Bannana");
		a.add("Pear");
		a.add("mango");
		System.out.println(a);

		for(String s : a )
		{
			System.out.println(s);
		}

		Collections.sort(a ,Collections.reverseOrder());

	   for(String s : a)
	   {
	   	   System.out.println(s); 
	   }



	}
}