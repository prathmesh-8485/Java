import java.util.Scanner ;

class A
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		number(a);

	}
	public static void number(char a) 
	{
		int j=1;
		for(char i='A';i<='Z';i++)
		{
			if(a==i)
			{
				System.out.println(i+" : "+j);
			}
			j++;
		}

	}
}