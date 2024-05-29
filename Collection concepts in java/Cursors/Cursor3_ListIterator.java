import java.util.*;
class Cursor3_ListIterator
{
	public static void main(String[] args) 
	{
		List a = new ArrayList();
		for(int i=0 ;i<=100 ; i+=10)
		{
			a.add(i);
		}

		ListIterator l = a.listIterator();

		// while(l.hasNext())
		// {
		// 	System.out.println(l.next());
		//     System.out.println("next Index : "+ l.nextIndex() +"   previous Index"+ l.previousIndex()); 
		// }

		// while(l.hasNext())
		// {
			
		// 	if(((Integer)l.next()) % 2 == 0)
		// 	{
		// 		l.remove();
		// 	}
		// 	System.out.println(l.next());
		// }


		while(l.hasNext())
		{
			try
			{
			l.set(190);
			}
			catch(Exception e)
			{
				System.out.println("think ");
			}
			
			if((Integer)l.next() % 2==1)
			{
				l.set(125);
			}
			try
			{System.out.println(l.next());}
			catch(Exception e){System.out.println("think 2");}
		}
	
	}
}