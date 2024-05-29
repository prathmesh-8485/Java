class Comp2
{
	int c;
	int d;
    Comp1 ac; 

	Comp2(int a,int b,Comp1 ac)
	{
		this.c = a;
		this.d = b;
		this.ac=ac;
	}
	public void displayComp2()
	{
		System.out.println("c - "+this.c);
		System.out.println("d - "+this.d);
	}
}