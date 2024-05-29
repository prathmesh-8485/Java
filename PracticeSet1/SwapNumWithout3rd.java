class SwapNumWithout3rd
{
	public static void main(String[] args) 
	{
		int a =10 ;
		int b =20 ;
		System.out.print("numbers before swapping - a : "+a+" b : "+b);
		a = a+b ;
		b=a-b;
		a=a-b;
		System.out.println();

		System.out.print("numbers after swapping - a : "+a+" b : "+b);

	}
}