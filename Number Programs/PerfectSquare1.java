import java.util.Scanner ;

class PerfectSquare1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		int a=0;
       for (int i=1;i<=num ;i++ ) 
       {
        int sqr=i*i;
        if(sqr==num)
        {
        	a=sqr;
        }
       }
       if(a==num)
       {
       	System.out.println("perfet sqt");
       }
       else{
       	System.out.println("not");
       }
}
}
