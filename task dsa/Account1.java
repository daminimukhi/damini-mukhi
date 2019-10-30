class Account1
{
protected double balance;
public void deposit(double in_amount)
	{
	balance = in_amount;
	}
public void withdraw(double in_amount)
	{
	System.out.println("The Withdrawal Amount Is : "+ in_amount);
	System.out.println("The Balance After Withdrawal Is : "+ (balance-in_amount));
	}
}

class savingAccount extends Account1
{
	private double defaultInterestRate=2.5;
	public double interestRate()
	{
	double b = balance + defaultInterestRate * balance; 
	return b;
	}
	public void setDefaultInterestRate(double in_rate)
	{
	defaultInterestRate=in_rate;
	}
	public void applyMonthlyInterest()
	{
	double b = balance + defaultInterestRate * balance; 
	System.out.println("The amount along with Monthly Interest Is : "+ b);
	}
}