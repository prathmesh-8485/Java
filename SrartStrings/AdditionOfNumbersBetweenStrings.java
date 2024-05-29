class AdditionOfNumbersBetweenStrings
{
	public static void main(String[] args)
	 
	{
		String a="h1i ho2w ar3e yo4u b14ye";

		int sum=0;  // 0 1
		int rem=0;  // 0 1
	
		for(int i=0;i<a.length();i++)
		{
			int count =0 ;
			int val =0;
			char c = a.charAt(i);  // h 1 i ' ' h o 2 3 4, 1 4
			if(c!=' ')   // h!=' '
			{
			    if(c>=48 && c<=57) // h=104  1=49 2=50
		     	{
		     		count++; // c=1 
		     		if(count == 1) 
		     		{
		     			rem=c-48;  //rem =49-48=1 50-48=2 52-48=4
		     			val+=rem;  //1 2 1 
		     		}
		     		if(count==2)  //c==2
		     		{
		     			val=(val*10)+(c-48); // 1*10+52-48=14;
		     		}
			    }  
			}
			if(c == ' ' || i==(a.length()-1))  // ' ',' ',' ',' '
			{
				sum+=val; //0+1=1  1+2=3
			}
		}
		System.out.println(sum);

    }
}