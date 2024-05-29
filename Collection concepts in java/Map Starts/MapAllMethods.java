import java.util.*;
class MapAllMethods
{
	public static void main(String[] args) 
	{
		Map m = new HashMap();
		m.put(1,10);
		m.put(2,20);
		m.put(3,10);    //  this method is used to add key and value pairs
		m.put(4,"hii");
		m.put(5,'a');


		System.out.println("m : "+m);

		Map m1 = new HashMap();
		m1.putAll(m);    // it accepts the map Object and create similar type map
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

	    Collection c =m1.values();
	    System.out.println("c : "+c); //only prints values does not prints the keys 

	    Set s = m1.entrySet();
	    System.out.println("s : "+s); // returns the set object in square brackets




	}
}