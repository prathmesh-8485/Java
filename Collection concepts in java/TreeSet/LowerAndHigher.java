import java.util.*;

class LowerAndHigher
{
	public static void main(String[] args) 
	{
		TreeSet a = new TreeSet();
		a.add(90);
		a.add(50);
		a.add(80);
        a.add(10);
		a.add(30);
		a.add(20);
		System.out.println(a);
		System.out.println("First element :"+a.lower(50));
		System.out.println("Last element :"+a.higher(50));
	}
}