
public class Hr {
	int id;
	String name;
	double salary;
	double comission;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setcomission(double comission) {
		this.comission = comission;
	}
	
	void display(){
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Salary = "+salary);
		System.out.println("Comission in percentage "+comission);
	}

	public static void main(String[] args) {
		Hr h = new Hr();
		
		h.setId(101);
		h.setName("Sita");
		h.setSalary(90000);
		h.setcomission(20);
		
		h.display();


	}

}
