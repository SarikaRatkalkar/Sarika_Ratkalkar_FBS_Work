
public class Admin {
	
	int id;
	String name;
	double salary;
	double allowance;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setallowance(double allowance) {
		this.allowance = allowance;
	}
	
	void display(){
		System.out.println("Id = " + id);
		System.out.println("Name = " + name);
		System.out.println("Salary = " + salary);
		System.out.println("Allowance in percentage " + allowance);
	}

	public static void main(String[] args) {
		Admin a = new Admin();
		
		a.setId(101);
		a.setName("Sita");
		a.setSalary(90000);
		a.setallowance(20);
		
		a.display();

	}

}
