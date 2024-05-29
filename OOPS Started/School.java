class School
{
	int stud;
	String name;

	School(int Stud , String name)
	{
		this.name = name;
		this.stud = stud;
	}
	public void displaySchool()
	{
		System.out.println("Nmae of School :"+name);
	}

}

class Student extends School
{
	Student()
	{
	  super(200,"Shivaji maratha");
	}
}
class Driver 
{
	public static void main(String[] args) {
		
		Student sc = new Student();
		sc.displaySchool();
	}
}