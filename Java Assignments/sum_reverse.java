
public class sum_reverse {

	public static void main(String[] args) {
		int num = 123; 
		 int sum, a, b, c, rev; 
		  
		 a = num%10; 
		 num = num/10; 
		 b = num%10; 
		 c = num/10; 
		  
		 sum = a + b + c; 
		  
		 rev = (a*100) + (b*10) + c; 
		  
		 System.out.println("Sum of number:" + sum); 
		 System.out.println("\nReverse of number:" + rev); 
	}

}
