import java.util.*;
class RetainAll
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

		ArrayList a =new ArrayList();
		a.add(10);
		a.add(20);

        System.out.println(c.retainAll(a)); // retailAll method deletes all the element rest of the object elements
        System.out.println(c);
	}
}