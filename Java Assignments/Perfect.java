
public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, num=28; 
		int j; 
		for (j=1; j<=num/2; j++){ 
		if(num%j==0){ 
		sum = sum + j; 
		} 
		}if(sum==num){ 
			 System.out.println("Number is a prefect number"); 
		}else 
			 System.out.println("Number is not a perfect number");

	}

}
