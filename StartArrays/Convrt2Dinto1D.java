import java.util.* ;
class Convrt2Dinto1D
{
	public static void main(String[] args) 
	{
        int [][] a={{1,2,3},{4,5}};

        int size =0;
        for (int i=0;i<a.length ;i++ ) 
        {
        	for (int j=0;j<a[i].length;j++) 
        	{
            size++; 	
        	}
   		}
   		int []b=new int [size];
        
        int k=0;
        for(int i=0;i<a.length ;i++ ) 
        {
        	for (int j=0;j<a[i].length;j++) 
        	{
             b[k++] =a[i][j];
        	}
   		}	

   		System.out.println(Arrays.toString(b));
	}
}