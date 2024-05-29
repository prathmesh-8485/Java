import java.util.*;
class Map1
{
	public static void main(String[] args) 
	{
		Map m = new TreeMap();
		m.put(1,10);
		m.put(2,20);
		m.put(3,10);    //  this method is used to add key and value pairs
		System.out.println("m : "+m);

		Map m1 = new HashMap();
		m1.putAll(m);    // pass map Object 
		System.out.println("m1 : "+m1);

		System.out.println(m1.containsKey(1));  // only check for key is present or not
	
	    System.out.println(m1.containsValue(20));  //only check for value(element/object) is present or not

	    System.out.println(m1.get(3)); // only fetch the element
	    System.out.println(m1);

	    System.out.println(m1.remove(1)); //need to pass key value and it will removes the particular pair
	    System.out.println(m1);

	    m.clear(); // (void) deletes all data of map
	    System.out.println("m : "+m);

	    System.out.println("size : "+m1.size()); // check for number of elements present inside object

	    System.out.println("m1 : "+m1.isEmpty()); // checks the object is empty or not
	    System.out.println("m : "+m.isEmpty());

	    System.out.println("m1 : "+m1.values());  //only prints values does not prints the keys 

	    System.out.println("m1 : "+m1.entrySet()); // returns the set object in square brackets




	}
}