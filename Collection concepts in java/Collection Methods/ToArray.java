import java.util.*;
class ToArray
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

		System.out.println(c.toArray()); //prints reference(return type is object) 
		Object [] a= c.toArray();
		System.out.println(a);   // it also prints address because it is array so we have to override toSTring Method

		System.out.println("Object a elements :"+Arrays.toString(a));  // we have to use Arrays toString method to print the data inside object a
	
	    System.out.println(c.size());  // size method retuns the number of elemnts present in coll object

	    System.out.println(c.isEmpty()); // isEmpty method tells us the object is empty or not

	    c.clear(); // delete the all content of object 
	    System.out.println(c);
	}
}