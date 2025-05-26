
public class Time {
	int hour;
	int min;
	int sec;
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	void display(){
	    System.out.println("Day is "+hour+":"+min+":"+sec);	
	}

	public static void main(String[] args) {
        Time t = new Time();
		
		t.setHour(11);
		t.setMin(06);
		t.setSec(28);
		
		t.display();
	}

}
