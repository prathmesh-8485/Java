import java.util.*;

class RemoveAndPoll
{
	public static void main(String[] args) 
   {
   	   Queue a = new ArrayDeque();
   	   a.add(10);
   	   a.add("ten");
   	   a.offer(30);
   	   a.offer(10.00);
   	   System.out.println(a);

       System.out.println(a.remove());
       System.out.println(a);
       System.out.println(a.poll());
       System.out.println(a);
       System.out.println(a.remove());
       System.out.println(a);
   }
}