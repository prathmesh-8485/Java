import java.util.*;

class TailSetMethod
{
	public static void main(String[] args) 
	{
		SortedSet a = new TreeSet();
		for (int i=10;i<=100 ;i+=10 ) 
		{
			a.add(i);
		}
		System.out.println(a);
		SortedSet b = a.tailSet(50);
		System.out.println(b);
	}
}