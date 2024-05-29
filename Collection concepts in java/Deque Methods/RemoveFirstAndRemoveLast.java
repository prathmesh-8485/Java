import java.util.*;
class RemoveFirstAndRemoveLast
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
		System.out.println(a.removeFirst());
		System.out.println(a);
        System.out.println(a.removeLast());
		System.out.println(a);
	}
}