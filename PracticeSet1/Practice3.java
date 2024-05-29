import java.util.*;
class Practice3
{
	public static void main(String[] args) 
	{
		String s = "howhiareyouhihowhi";
		System.out.println(s);

		String s1 = "hi";

		char [] c=s.toCharArray();
		System.out.println(Arrays.toString(c));
		int count =0 ;

        for(int i=0 ;i<c.length ;i++)
        {
        	if(c[i] == 'h')
        	{
        		if(c[i+1] == 'o')
        		{
        			if(c[i+2] == 'w')
        			count++;
        		}
        	}
        }

        System.out.println("no. of how :"+count);

	}
}