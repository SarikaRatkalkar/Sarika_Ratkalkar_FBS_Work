
public class Date {
	int date;
	int month;
	int year;
	
	public void setDate(int date) {
		this.date = date;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	void display(){
	    System.out.println("Day is "+date+"/"+month+"/"+year);	
	}

	public static void main(String[] args) {
		Date d = new Date();
		
		d.setDate(28);
		d.setMonth(02);
		d.setYear(2002);
		
		d.display();

	}

}
