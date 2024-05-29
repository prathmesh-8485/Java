class StaticMethodsCallingFunctions
{
	static int a=10;
           int b=30;
	public static void main(String[] args) {
		//a=10;
		System.out.println(a);
		StaticMethodsCallingFunctions c = new StaticMethodsCallingFunctions();
		c.m1();
		c.m2();
	}
	public void m1()
	{
		m2();
		System.out.println(a);
		System.out.println(b);
	}
	public static void m2()
	{
		B.m3();
		StaticMethodsCallingFunctions ne =new StaticMethodsCallingFunctions();
		System.out.println(a);
		System.out.println(ne.b);
	}
}
class B
{
	public static void m3()
	{
		StaticMethodsCallingFunctions d =new StaticMethodsCallingFunctions();
		System.out.println(StaticMethodsCallingFunctions.a);
		System.out.println(d.b);
	}
}
