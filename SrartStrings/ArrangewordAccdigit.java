import java.util.*;
class ArrangewordAccdigit
{
	public static void main(String[] args)
	{
		String str="he2llo hi1 ho3w a4re y5ou";
			int count =0;
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(ch ==' ')
				{
					count++;
			    }
			}
			String[] b =new String[count+1];
			int index=0;
			String val="";
			int last =str.length();
			for(int j=0;j<str.length();j++)
			{
				char ch1=str.charAt(j);
				if(ch1!=' ')
				{
					if(ch1>=48&&ch1<=57)
					{ 
						index=ch1-48;
					}
					else
					{
						val+=ch1;

					}

				}
				if(ch1==' '||j==(last-1))
				{
					b[index-1]=val;
					val="";
				}


			}
			String output =" ";
			for(int k=0;k<b.length;k++)
			{
				for(int i=0;i<b[k].length();i++)
				{
					char ch1=b[k].charAt(i);
					output=output+ch1;

				}
				output=output+' ';
				
			}
			System.out.println(output);
		
		}
	}