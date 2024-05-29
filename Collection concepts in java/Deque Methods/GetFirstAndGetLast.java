import java.util.*;
class GetFirstAndGetLast
{
	public static void main(String[] args) 
	{
		Deque a = new ArrayDeque(6);
		a.add(10);
		a.offer(20);
		a.add(10);
		a.add("ten");
		a.add(10.00);
		System.out.println(a);
		System.out.println(a.getFirst()); //only fetch
		System.out.println(a);
        System.out.println(a.getLast());
		System.out.println(a);
	}
}