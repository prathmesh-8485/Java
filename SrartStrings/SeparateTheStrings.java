import java.util.*;

class SeparateTheStrings
{
	public static void main(String[] args) 
	{
		String a="Java is never easy java is most easy ";
		String [] b =a.split(" ");
		System.out.println(Arrays.toString(b));

		for (int i=0;i<b.length;i++) 
		{
			for (int j=i+1;j<b.length;j++) 
			{
				if(b[i].equalsIgnoreCase(b[j]))
					System.out.print(b[i]+" ");
			}
		}
		
	}
}