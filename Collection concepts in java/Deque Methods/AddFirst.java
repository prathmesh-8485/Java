import java.util.*;
class AddFirst
{
	public static void main(String[] args) 
	{
		Deque a = new ArrayDeque();
		a.add(10);
		a.offer(20);
		a.add(10);
		a.add("ten");
		a.add(10.00);
		a.addFirst("First");
		System.out.println(a);
		a.addLast("Last");
		System.out.println(a);
	}
}