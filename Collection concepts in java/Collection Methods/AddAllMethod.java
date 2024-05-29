import java.util.*;
class AddAllMethod
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
		for (char i = 'A';i <= 'Z' ;i++ ) 
		{
			a.add(i);
		}
		System.out.println(a);
		c.addAll(a);    // ading the object(all data of object ) inside cooll object
		System.out.println(c);
	}
}