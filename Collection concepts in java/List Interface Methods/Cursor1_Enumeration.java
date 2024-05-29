import java.util.* ;
class Cursor1_Enumeration
{
	public static void main(String[] args) 
	{
		Vector a = new Vector();
		for(int i=0 ; i<=100 ;i++)
		{
			a.add(i);
		}

		Enumeration e =a.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}