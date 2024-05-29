import StaticMethodsCallingFunctions.util.*;

class FirstAndLast
{
	public static void main(String[] args) 
	{
		SortedSet a = new TreeSet();
		for (int i=10;i<=100 ;i+=10 ) 
		{
			a.add(i);
		}
		System.out.println(a);
	
	    System.out.println(a.first());
	    System.out.println(a.last());
	}
}