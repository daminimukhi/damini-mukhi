
class Employee{
	private int salary;
	private int hrs;
	public void getinfo(int salary,int hrs){
       this.salary = salary;
       this.hrs = hrs;
       System.out.println(this.salary);
       System.out.println(this.hrs);
	}
	public void getinfo(){
      System.out.println(this.salary);
      System.out.println(this.hrs);
	}
    public void addSal(){
    	if (this.salary < 500){
    		this.salary = this.salary + 10;
    	}
    	
    }
    public void addWork(){
    	if(this.hrs > 6){
    		this.salary = this.salary + 5;
    	}
    }
   public static void main(String args[]){
   	  Employee emp = new Employee();
   	  System.out.println("setting Employee info:");
   	  emp.getinfo(490,7);
   	  emp.addSal();
   	  emp.addWork();
   	  System.out.println("getting Employee info:");
   	  emp.getinfo();
   }
}