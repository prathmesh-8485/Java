import java.util.*;

class PollFirstAndPollLast
{
	public static void main(String[] args) 
	{
		TreeSet a = new TreeSet();
		a.add(90);
		a.add(50);
		a.add(80);
        a.add(10);
		a.add(30);
		a.add(20);
		System.out.println(a);
		System.out.println("First element :"+a.pollFirst());
		System.out.println("Last element :"+a.pollLast());
		System.out.println(a);
		
	}
}