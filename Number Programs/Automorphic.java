import java.util.Scanner ;
class Automorphic
{
  public static void main(String[] args) 
  {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the Number :");
   int num =sc.nextInt();
   int count=0;
   int num1=num;
   int div =1;

   while(num1!=0)
   {
    count++;
    num1/=10;
   }
     for(int i=1;i<count;i++)
     {
      div*=10;
     }
     int rem=num%div;
     if(num == rem)
      System.out.println("Automorphic ");
    else 
      System.out.println("not ");
     }
}