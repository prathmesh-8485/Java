import java.util.Scanner ;

class Vowel {
  
  public static void main(String args[]) {
    
  //  String name = new String("Hi Welcome to my world!");
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    int a =0;
    int d=0;
    
    for(int i=0; i<3; i++) 
    {
      if(name.charAt(i) == 'a'|| name.charAt(i) == 'e'|| 
          name.charAt(i) == 'i' || name.charAt(i) == 'o' || 
          name.charAt(i) == 'u')
      {
        char c=name.charAt(i);
        d=c;
        System.out.println(name.charAt(i) +" : "+d);
        prime(d);
      }
    }
  }
    public static void prime(int z)
    {
      int count =0;
      for(int i=1;i<=z;i++)
        {
          if(z%i==0)
            count++;
        }
        System.out.println(count == 2 ? "ascii of vowel is prime " :"ascii of voel is not prime");
    }
}