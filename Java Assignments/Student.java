
public class Student {

	private int rollNo;
    private String name;
    private double marks;

    
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public void setMarks(double marks) {
        this.marks = marks;
    }

    
    public void display() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }


    public static void main(String[] args) {
        // Creating an object of Student class
        Student student = new Student();

        // Setting values using setter methods
        student.setRollNo(101);
        student.setName("Sita");
        student.setMarks(99);

        // Calling display method to print details
        student.display();
    }
}



