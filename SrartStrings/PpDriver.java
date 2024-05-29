import java.util.Scanner ;
class PpDriver
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("*** WELCOME ***");
		System.out.print("Enter your Name : ");
		String name = sc.nextLine();
		System.out.print("Enter your phone Number : ");
		long phn = sc.nextLong();
		System.out.print("Enter your new acc no : ");
		long accno = sc.nextLong();
		System.out.print("Enter a new upi pin : ");
		int upi = sc.nextInt();
		System.out.print("Enter an amount to deposit : ");
		double accbal = sc.nextDouble();
		System.out.print("Enter your Email id : ");
		String email = sc.next();

		PhonePay a = new PhonePay(name, phn,accno,upi,accbal,email);

		for (; ; ) 
		{
			System.out.print("1.Account Info 2.Change UPI  3.Send 4.AccBal 5.Exit");
			System.out.println();
			System.out.print("Enter an option :");
			int opt = sc.nextInt();
			switch(opt)
			{
				case 1: 
				{
					System.out.println("Account Inforamtion");
					System.out.println("User name : "+ a.name);
					System.out.println("Phone number : "+a.phn);
					System.out.println("Email id : "+ a.email);
					break;
				}
				case 2:
				{
					System.out.print("Enter your old UPI : ");
					int oupi = sc.nextInt();
					if((a.getUpi())==oupi) 
					{
						System.out.print("Enter a new UPI : ");
						int nupi1 = sc.nextInt();
						System.out.print("Confirm new UPI : ");
						int nupi2 = sc.nextInt();
						if (nupi1==nupi2) 
						{
							a.setUpi(nupi1);
							System.out.println("Upi changed successfully");
						}
						else
						{
							System.out.println("Enter a matching upi pin");
						}
					}
					else
					{
						System.out.println("In-correct old UPI pin");
					}
					break;
				}
				case 3:
				{
					System.out.print("Enter your amount : ");
					double samt = sc.nextDouble();
					System.out.print("Enter your UPI : ");
					int aupi = sc.nextInt();
					if (((a.getUpi())==aupi)) 
					{
						if ((samt<=(a.getAccBal()))) 
						{
							double naccbal = a.getAccBal()-samt;
							a.setAccBal(naccbal);
							System.out.println("AMount send Successfully");
						}
						else
						{
							System.out.println("Insufficient Balance");
						}	
					}
					else
					{
						System.out.println("Enter a correct upi pin");
					}
					break;
				}
				case 4:
				{
					System.out.print("Enter your UPI pin : ");
					int nupi = sc.nextInt();
					if (nupi==a.getUpi()) 
					{
						System.out.println("Account balance is : "+(a.getAccBal()));
					}
					else
					{
						System.out.println("Enter an correct Upi ");
					}
					break;
				}
				case 5:
				{
					System.exit(0);
				}
				default :
				{
					System.out.println("Enter a correct option");
					break;
				}
			}
			System.out.println();
		}
	}
}