class Asses2
{
	public static void main(String[] args) 
	{
		
		int v1=0 ;
		int v2=1 ;
		int a = 'C' ;

        for(int i=1 ; i<=26 ;i++)
        {
        	int v3 = v1 + v2 ;
        	v1 = v2 ;
        	v2 = v3 ;
        	System.out.println(i);
        	a++=i;
        }
        System.out.println(a);

	}
}