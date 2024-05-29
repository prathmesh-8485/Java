import java.util.Scanner ;
class NumberToString
{
  public static void main(String[] args) 
  {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the Number :");
   int num =sc.nextInt();
   String a="";

   while(num!=0)
   {
   	int rem =num%10;
   	switch(rem)
   	{
  	case 1: a="one "+a;break;
    case 2: a="two "+a;break;
    case 3: a="three "+a;break;
    case 4: a="four "+a;break;
    case 5: a="five "+a;break;
    case 6: a="six "+a;break;
    case 7: a="seven "+a;break;
    case 8: a="eight "+a;break;
    case 9: a="nine "+a;break;
    case 0: a="zero "+a;break;
   
   	}
   	 
   	 num/=10;
   }	
   	
  	System.out.println(a);	
  }
}