//Encapsulation

class Driver3 
{

	private int a=10;
	static int b =20 ;
	

	
	public static void main(String[] args) 
	{
		Driver3 ac = new Driver3();
		ac.setB();
		
		System.out.println(b);
		System.out.println(ac.geB());
	}
	
	public void setB()
	{
		this.a = 40;
	}
	public int geB()
	{
		return this.a;
	}

}
