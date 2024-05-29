class Animal
{
	String name;
	Animal(String name)
	{
		this.name = name ;
	}
	public void DispAni()
	{
		System.out.println("Name of the Animal is : "+name);
	}
}
class States extends Animal
{
	String color;
	int legs ;
	int tail ;
	int eyes ;

    States(String color ,int legs ,int tail ,int eyes )
    {
    	super("cow");
    	this.color= color ;
    	this.legs = legs ;
    	this.tail = tail ;
    	this.eyes = eyes ;
    }
    public void dispStates()
    {
    	System.out.println("color of "+name+" is " + color);
    	System.out.println("no. os legs : "+legs);
    	System.out.println("tail  : "+tail);
    	System.out.println("no. of eyes : "+eyes);
    }
}
class Behavior extends States
{
	String use;

	Behavior(String use)
	{
		super("black",4,1,2);
		this.use = use;
	}
	public void dispBehavior()
	{
		System.out.println("Behavior of the "+name+" is "+use);
	}
}
class Driver
{
	public static void main(String[] args) 
	{
		Behavior ac = new Behavior("most use aggriculture and milk production ");
		ac.DispAni();
		ac.dispStates();
		ac.dispBehavior();	
	}
}