import java.util.*;

class ElementAndPeek
{
	public static void main(String[] args) 
   {
   	   Queue a = new PriorityQueue();
   	   a.add(10);
   	   a.add(90);
   	   a.offer(30);
   	   a.offer(10);
       a.add(10);
   	   System.out.println(a);

       System.out.println(a.element());
       System.out.println(a);
       System.out.println(a.peek());
       System.out.println(a);

       
   }
}