import java.util.*;
class removeFirstOccurrence
{
	public static void main(String[] args) 
	{
		Deque a = new ArrayDeque(6);
		a.offer(20);
		a.add(10);
		a.add("ten");
		a.add(10);
		a.add(10.00);
		System.out.println(a);
		System.out.println(a. removeFirstOccurrence(10));
		System.out.println(a);
    
	}
}