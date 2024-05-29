class String1
{
	public static void main(String[] args)
	 
	{
		String a="h1i ho2w ar3e yo4u b5ye";

        int sum=0;
        
		for(int i=0;i<a.length();i++)
		{
			char c = a.charAt(i);

			if(c>=48 && c<=57)
			{
			int b=c-48;	
			//System.out.println(c+" "+b);
				sum+=b;
			}
		}
		System.out.println("sum of numbers between characters  : "+sum);

		
	}
}