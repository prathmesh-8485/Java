import java.util.Arrays;
class AllMethodsOfStrings
{
	public static void main(String[] args) 
	{
		String a=new String("hii hello ");
		String d="hii hello ";
		System.out.println("length :"+a.length());
		System.out.println(a.concat("how r u"));
		System.out.println(a.charAt(0));
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.trim());
	    System.out.println("length :"+a.length());
		String [] b=a.split(" ");
		System.out.println(Arrays.toString(b));
		System.out.println(a.replace("hii","hello"));
		char [] c=a.toCharArray();
		System.out.println(Arrays.toString(c));
		System.out.println(c.length);
		System.out.println(a.isEmpty());
		System.out.println(a.equals(d));
		System.out.println(b);   // printing Address
		System.out.println(a.indexOf('l')); 
		System.out.println(a.lastIndexOf('l'));
		System.out.println(a.substring(0,3
	));


	}
}