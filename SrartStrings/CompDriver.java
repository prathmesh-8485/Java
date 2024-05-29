class CompDriver
{
	public static void main(String[] args) 
	{
		Comp2 ab = new Comp2(30,40,(new Comp1(10,20)));
		ab.displayComp2();
		ab.ac.displayComp1();
	}
}