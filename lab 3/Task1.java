import java.util.*;
class Task1{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter yout obtained marks ");
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int totalmarks=300;
		int obtainedmarks=num+num1+num2;
		int per=(obtainedmarks*100)/totalmarks;
		System.out.println("Percentage " + per);
		if (per>90)
		{
			System.out.println("A grade");
		}
		if ((per>=80) && (per<=90))
		{
			System.out.println("B grade");

		}
	if ((per<=79) && (per>=70))
	{
		System.out.println("C grade");
	}
	if ((per<=69) && (per>=60))
	{
		System.out.println("D grade");

	}
	if (per<60)
	{
		System.out.println("Fail");
	}


	}
}