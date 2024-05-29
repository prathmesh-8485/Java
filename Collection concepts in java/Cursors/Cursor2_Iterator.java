import java.util.* ;
class Cursor2_Iterator
{
	public static void main(String[] args) 
	{
		Vector a = new Vector();
		for(int i=0 ; i<=100 ;i++)
		{
			a.add(i);
		}

		Iterator e =a.iterator();
		while(e.hasNext())    // like boolean type condition iterate like loop
		{
			System.out.println(e.next()); // to fetch elelmnts one by one
		}
	}
}