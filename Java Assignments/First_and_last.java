
public class First_and_last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=133, rem, sum;  
		  
		  rem = num%10; 
		  int temp = num; 
		  while(temp>=10){ 
		   temp = temp/10; 
		 }        
		  sum = rem+temp;  
		  System.out.println("The sum of first and last digit of the number is:"+ sum);

	}

}
