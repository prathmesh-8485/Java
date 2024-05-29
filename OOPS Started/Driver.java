class Inheritance
{
	public static void m1()
	{
		System.out.println("from parent m1");
	}
	public static void m2()
	{
		System.out.println("from parent m1");

	}
	public static void m3()
	{
		System.out.println("from parent m3");

	}
	
}
class Child extends Inheritance
{
	public static void m1()
	{
		System.out.println("from child m1");
	}
	public static void m2()
	{
		System.out.println("from child m2");

	}
	public static void m3()
	{
		System.out.println("from child m3");

	}
}
class Driver 
{
	public static void main(String[] args) 
	{
		Inheritance i =new Child();
		i.m1();
		Child c = (Child) i ;
		c.m1();
		Inheritance i1 = (Inheritance) c ;
		i1.m2();
		Child t =(Child) i1;
	}
}