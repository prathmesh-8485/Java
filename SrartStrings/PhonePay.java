class PhonePay
{

	String name ;
	long phn ;
	private long accno  ;
	private int upi ;
	private double accbal;
	String email ;

	PhonePay(String name,long phn,long accno,int upi,double accbal,String email)
	{
		this.name = name ;
		this.phn = phn ;
		this.accno = accno ;
		this.upi = upi ;
		this. accbal = accbal;
		this.email = email ;
		System.out.println("Account Created Successfuly");
		System.out.println();
	} 
	public long getAccNo()
	{
		return accno ;
	}
	public int getUpi()
	{
		return upi;
	}
	public void setUpi(int upi)
	{
		this.upi = upi;
	}
	public double getAccBal()
	{
		return accbal ;
	}
	public void setAccBal(double accbal)
	{
		this.accbal = accbal ;
	}
}