
import java.util.*;
class ListAddMethod
{
	public static void main(String[] args) 
	{
		List l =new ArrayList();
		l.add(10);
		l.add(20);
		System.out.println(l);
		for(int i='A' ;i<='Z' ;i++)
		{
			l.add(i);
		}
		System.out.println(l);
		l.add(4,100);  // list add method use to add elements at particular index number
		System.out.println(l);
	}
}