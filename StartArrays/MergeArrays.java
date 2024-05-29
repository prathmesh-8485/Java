import java.util.*;
class Alternatively
{
	public static void main(String[] args) 
	{
		int []a={1,2,3,4};
		int []b={40,50,60};

		int []c=new int[a.length+b.length];

		int k=0;
		for (int i=0;i<a.length;i++) 
		{
		    c[k++]=a[i];
		    c[k++]=b[i];	
		}
		System.out.println(Arrays.toString(c));
	}
}