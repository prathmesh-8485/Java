import java.util.*;
class removeMethod
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

		c.remove(10.5);  // removing one element
		System.out.println(c);

		c.removeAll(c);
		System.out.println(c);
	}
}