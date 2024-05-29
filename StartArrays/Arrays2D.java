class Arrays2D{
	public static void main(String[] args) {
		char [][] a={{'a','b'},{'c','d'}};
		int i=0;
		while(i<a.length)
		{
			int j=0;
			while(j<a[i].length)
			{
		    System.out.println(a[i][j++]);
			}
			i++;
		}

        
        int k=0;
		do
		{
			int l=0;
			do
			{	
			System.out.print(a[k][l++]+" ");
			}
			while(l<a[k].length);
			k++;
		}
		while(k<a.length);
       System.out.println("");

       for(char m : a)
       {
       	  for(char n : m)
       	  {
       	  	System.out.println(n);
       	  }
       }

       
	}
}