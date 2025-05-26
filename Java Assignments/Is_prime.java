
public class Is_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5, i=2, flag = 0; 
		  
		 if (num ==0 || num ==1){ 
		  flag = 1; 
		 } 
		 for(i=2; i<=num/2; i++){ 
		  if(num%i==0){ 
		   flag = 1; 
		   break; 
		  } 
		 } 
		 if(flag == 0){ 
			 System.out.println("Number is prime number"); 
		 }else 
			 System.out.println("Number is not a prime number"); 

	}

}
