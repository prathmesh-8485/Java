import java.util.*;

class AddAndOffer
{
	public static void main(String[] args) 
   {
   	   Queue a = new LinkedList();
   	   a.add(10);
   	   a.add("ten");
   	   a.add(null);
   	   System.out.println(a);

   	   a.offer(null);
   	   a.offer(30);
   	   a.offer(10.00);
   	   System.out.println(a);
   }
}