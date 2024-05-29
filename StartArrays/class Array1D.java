import java.util.Arrays ;
class Array1D
{
	public static void main(String[] args) 
	{
		
	    int a[] ={1,2,3,4,5};
	    
	    for(int i=0;i<a.length;i++)
	    {
	    	System.out.print(a[i]+ " ");//printing array using for loop
	    }
	    System.out.println("");
        
	    int j=0;
	    while(j<a.length)
	    {
	    	System.out.println(a[j]+"        "+a[j]);//printing using while loop
	    	j++;
	    }

	    int k=0;
	    do
	    {
	    	System.out.print(a[k]+" ");  //using do ehile loop
	    	k++;
	    }
	    while(k<a.length);

        System.out.println("");

	    for(int l : a)
	    {
	    	System.out.println(l);   //printing array using for each loop
	     }

	    System.out.println(Arrays.toString(a));  //using Arrays method


	}
}

