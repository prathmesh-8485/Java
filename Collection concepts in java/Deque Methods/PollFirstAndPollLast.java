import java.util.*;
class PollFirstAndPollLast
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
		System.out.println(a.pollFirst());  // deletes first element 
		System.out.println(a);
        System.out.println(a.pollLast());  // removes last element
		System.out.println(a);
	//	System.out.println(a.capacity());
	}
}