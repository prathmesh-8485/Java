import java.util.*;
class Array1
{
	public static void main(String[] args) {
		
		int [] a ={1,3,4,5,6};
		List b = new ArrayList();

		for (int i=0;i< a.length ;i++ ) 
		{
			b.add(a[i]);
		}
		System.out.println(b);

	}
}