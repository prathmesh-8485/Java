import java.util.*;

class subsetMethod
{
	public static void main(String[] args) 
	{
		SortedSet a = new TreeSet();
		for (int i=10;i<=100 ;i+=10 ) 
		{
			a.add(i);
		}
		System.out.println(a);
		SortedSet b = a.subSet(10,40);
		System.out.println(b);
	}
}