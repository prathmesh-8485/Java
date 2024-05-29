import java.util.*;
class StoreEvenOddInArray
{
	public static void main(String[] args) 
	{
		int []a={1,2,3,4,5,6,7,8,9,0};

		int size=0;
		int size1=0;
		for (int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0)
				size++;
			if(a[i]%2==1)
				size1++;
		}

		int []even=new int[size];
        int [] odd=new int[size1];

        int j=0,k=0;

        for (int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0)
				even[j++]=a[i];

			if(a[i]%2==1)
				odd[k++]=a[i];
		}

		System.out.println("even Array elements : "+Arrays.toString(even));
	    System.out.println("Odd Arrays Elements : "+Arrays.toString(odd));
		
	}
}