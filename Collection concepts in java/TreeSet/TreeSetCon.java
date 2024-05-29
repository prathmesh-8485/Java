import java.util.*;

class TreeSetCon
{
	public static void main(String[] args) 
	{
		SortedSet al = new TreeSet();
		al.add(90);
		al.add(50);
		al.add(80);
		System.out.println(al);


		TreeSet a = new TreeSet();
		a.add(10);
		a.add(30);
		a.add(20);
		System.out.println("a : "+a);
		
		TreeSet b= new TreeSet(al);   //TreeSet(Collection c)
		System.out.println("b : "+b);

	}
}