import java.util.Scanner ;

class Peterson
{
 public static void main(String[] args) 
    {
 	 Scanner sc =new Scanner(System.in);
 	 int num =sc.nextInt();
 	 int num1=num;
 	 int sum=0;
 	 while(num1!=0)
 	 {
       int rem=num1%10;
       int fact =1;
        for(int i=1;i<=rem;i++)
        {
        	fact=fact*i;
        }
        System.out.println("fact of "+rem +" is "+fact+" ");
        sum+=fact;
       num1/=10;
 	 }	
System.out.println(sum==num?"Peterson number " : "not a perterson number");
 	}	
}