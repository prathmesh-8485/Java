import java.util.*;
class ContainsMethods
{
	public static void main(String[] args) 
	{
		Collection c = new ArrayList();
		c.add(10);
		c.add(20);
		c.add("hii");
		c.add('h');
		c.add(10.5);
		System.out.println(c);
        System.out.println(c.contains(90)); // specific element is present or not

		ArrayList a =new ArrayList();
		a.add(10);
		a.add(20);

		System.out.println(c.containsAll(a));// checking the objects elements are present in coll object or not
	}
}