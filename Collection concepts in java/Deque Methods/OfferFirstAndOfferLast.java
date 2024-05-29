import java.util.*;
class OfferFirstAndOfferLast
{
	public static void main(String[] args) 
	{
		Deque a = new ArrayDeque(6);
		a.add(10);
		a.offer(20);
		a.add(10);
		a.add("ten");
		a.add(10.00);
		System.out.println(a.offerFirst("First"));
		System.out.println(a);
        System.out.println(a.offerLast("Last"));
        System.out.println(a.offerLast("Last1"));
        System.out.println(a.offerLast("Last2"));
		System.out.println(a);
	}
}