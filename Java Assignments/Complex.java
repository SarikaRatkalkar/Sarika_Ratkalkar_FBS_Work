
public class Complex {
	int imaginary;
	int real;
	
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	public void setReal(int real) {
		this.real = real;
	}
	
	void display(){
		System.out.println("complex "+imaginary+"+"+real+"i");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c = new Complex();
		
		c.setImaginary(3);
		c.setReal(5);
		
		c.display();

	}

}
