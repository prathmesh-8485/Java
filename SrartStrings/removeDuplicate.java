class RemoveDuplicate
{
	public static void main(String[] args) 
	{
		String a ="CsharpstarZ" ;
		String d="";
		for (int i=0;i<a.length() ;i++ ) 
		{
			int count =0;
			for (int j=i+1;j<a.length() ;j++) 
			{
				char b = a.charAt(i);
				char c = a.charAt(j);

				if(b == c)
				{
					count++;
				}				
			}
			if(count == 0)
			{
			  d+=a.charAt();
			}
		}
		System.out.println(d);
	}
}