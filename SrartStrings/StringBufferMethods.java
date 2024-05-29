class StringBufferMethods
{
	public static void main(String[] args) 
	{
		StringBuffer a=new StringBuffer();
		System.out.println(a.capacity());
		a.append("Anvi khedekar");
		System.out.println(a);
		System.out.println(a.capacity());
		a.ensureCapacity(50);
		System.out.println(a.capacity());
		a.trimToSize();
		System.out.println(a.capacity());
		System.out.println(a.length());
		a.insert(0,"miss ");
		a.insert(10,"Nilesh ");
		System.out.println(a);
		a.delete(0,4);
		System.out.println(a);
		a.deleteCharAt(6);
		System.out.println(a);
		a.reverse();
		System.out.println(a);

	}
}