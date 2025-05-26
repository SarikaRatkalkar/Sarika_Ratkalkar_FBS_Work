
public class SalesManager {
	
	int id;
	String name;
	double salary;
	double incentive;
	double target;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setincentive(double incentive) {
		this.incentive = incentive;
	}
	
	public void settarget(double target) {
		this.target = target;
	}
	
	void display(){
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Salary = "+salary);
		System.out.println("Incentive in percentage = "+incentive);
		System.out.println("Target is = "+target);
	}

	public static void main(String[] args) {
		SalesManager sm = new SalesManager();
		
		sm.setId(101);
		sm.setName("Sita");
		sm.setSalary(90000);
		sm.setincentive(3000);
		sm.settarget(50000);
		
		sm.display();

	}

}
