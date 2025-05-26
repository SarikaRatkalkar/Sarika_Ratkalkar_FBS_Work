
public class Perfect_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10, i,sum; 
		  
		 
		 for(i=1;i<=n;i++){ 
		  sum =0; 
		  int j=1; 
		  while(j<=i){ 
		  if(i%j==0){ 
		   sum = sum + j; 
		  } 
		  j++; 
		}if(sum==i) 
			 System.out.println(""+ i); 
		 } 

	}

}
