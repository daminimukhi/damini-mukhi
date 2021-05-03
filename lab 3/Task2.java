import java.util.*;
class Task2
{
	public static void main(String [] args)
	{
		Scanner sc  = new Scanner (System.in);
		int units= sc.nextInt();
		int total=0;
		for (int x=1;x<=units;x++)
		{
			if (x>=1 && x<=50)
			{
				total=total+10;
			}
			if ((x>50) && (x<=100))
			{
				total=total+15;
			}
			if ((x>100) && (x<=200))
			{
				total=total+20;
			}
			if ((x>200) && (x<=300))
			{
				total=total+25;
			}
			if (x>300)
			{
				total=total+30;
			}

		}
		System.out.println(total);
	}
}