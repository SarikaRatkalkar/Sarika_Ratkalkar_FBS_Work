
public class area_and_perimeter {

	public static void main(String[] args) {
		double length = 5, breadth = 3, radius = 4, PI = 3.14159; 
		int choice = 1; 
		double area, perimeter; 
		//Area and perimeter of rectangle 
		if(choice == 1){ 
		area = length*breadth; 
		System.out.println("Area of rectangle is: " + area); 
		perimeter = 2*(length + breadth); 
		System.out.println("Perimeter of rectangle is: " + perimeter); 
		}else if(choice == 2){ 
		area = PI*radius*radius; 
		System.out.println("Area of circle is: " + area); 
		perimeter = 2*PI*radius; 
		System.out.println("Perimeter of circle is: " + perimeter); 
		}

	}

}
