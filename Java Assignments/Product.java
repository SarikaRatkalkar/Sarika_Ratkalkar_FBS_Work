
public class Product {
	int id;
	String name;
	int quantity;
	double price;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setQunatity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	void display(){
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Quantity = "+quantity);
		System.out.println("Price = "+price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product();
		
		p.setId(101);
		p.setName("Bag");
		p.setPrice(2000);
		p.setQunatity(1);
		
		p.display();

	}

}
