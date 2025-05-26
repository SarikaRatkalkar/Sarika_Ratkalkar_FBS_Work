
public class Distance {
	
	int feet;
	int inch;
	
	public void setFeet(int feet) {
		this.feet = feet;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	void display(){
		System.out.println("Distance is "+feet+" and "+inch+" inches");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Distance d = new Distance();
		
		d.setFeet(25);
		d.setInch(3);
		
		d.display();

	}

}
