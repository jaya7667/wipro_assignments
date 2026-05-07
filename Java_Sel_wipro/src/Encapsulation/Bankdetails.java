package Encapsulation;
class BankAccount{
	private double balance;
	public void deposit(double amount)
	{
		if (amount<0)
		{
			balance +=balance+amount;
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
	public void withdraw(double amount)
	{
		if(amount<=balance)
		{
			balance = balance-amount;
			System.out.println("Insufficient Balance");
		}
	}
	public double getBalance()
	{
		return balance;
	}
}

public class Bankdetails {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		acc.deposit(1000);
		acc.deposit(2000);
		System.out.println("Balance="+acc.getBalance());
		Student st= new Student();
		System.out.println(st.name);
		System.out.println(st.rollno);
		// TODO Auto-generated method stub

	}

}
