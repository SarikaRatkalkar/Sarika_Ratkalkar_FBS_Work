
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, n=10; 
		  int t1 = 0, t2 = 1; 
		  int nextTerm = t1 + t2; 
		 
		   
		 
		  System.out.println("Fibonacci Series: "+ t1 + t2); 
		 
		for (i = 3; i <= n; ++i) { 
			System.out.println(" "+ nextTerm); 
		t1 = t2; 
		t2 = nextTerm; 
		nextTerm = t1 + t2; 
		} 

	}

}
