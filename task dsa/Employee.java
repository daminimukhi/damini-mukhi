
import java.util.*;
class Employee {
	 float salary;
	 float hours;
	
	public void getInfo( float salary, float hours) {
		this.salary = salary;
		this.hours = hours;
	}
	
	public float AddSal() {
		if(salary < 500) {
			salary = salary + 10;
		}
		return salary;
	}
	
	public float AddWork() {
		if(hours > 6) {
			salary = salary + 5;
		}
		return salary;
	}

	public static void main (String[] args)
	{
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary");
		float salary = sc.nextFloat();
		System.out.println("Enter Number Of Hours Of Work");
		float hours = sc.nextFloat();
		emp.getInfo(salary, hours);
		salary = emp.AddSal();
		salary = emp.AddWork();
		System.out.println("The final salary is " + salary);
	}
}