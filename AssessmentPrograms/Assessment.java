class Assessment
{
	public static void main(String[] args) 
	{
		System.out.println("V");
		char c='W';
		char d='V';
		for(int i=1 ; i<=4 ;i++)
		{
			for(int j=1 ; j<=i ;j++)
			{
				System.out.print(c);
			}
			System.out.print(d);
			System.out.println();
			c++;
			d++;
		}
	}
}