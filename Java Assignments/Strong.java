
public class Strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=14, temp, rem, sum = 0; 
		 
		for(temp = num; temp>0; temp = temp/10){ 
		rem = temp %10; 
		int i; 
		 int fact = 1; 
		 for(i=rem; i>0; i--){ 
		  fact = fact * i; 
		 } 
		 sum = sum + fact; 
		}if(sum == num){ 
			System.out.println("Number is a strong number"); 
		 }else 
			 System.out.println("Number is not a strong number"); 

	}

}
