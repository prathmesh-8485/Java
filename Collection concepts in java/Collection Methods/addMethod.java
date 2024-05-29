import java.util.* ;

class addMethod
{
	public static void main(String[] args) 
	{
		Collection c = new ArrayList();
		c.add(10);
		c.add(20);          //  adding one element inside coll object
		System.out.println(c);

		for(int i=10 ; i<=100 ; i+=10)
		{
			c.add(i);      //adding multiple elements using add method
		}
		System.out.println(c.toString());
	}
}