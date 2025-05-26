
public class Employee {

	int id;
	String name;
	double salary;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	void display(){
		System.out.println("Id = "+ id);
		System.out.println("Name = "+ name);
		System.out.println("Salary = "+ salary);
	}
	
	public static void main(String args[]) {
		
		Employee e = new Employee();
	
		e.setId(101);
		e.setName("Sita");
		e.setSalary(90000);
		
		e.display();
	}
}
