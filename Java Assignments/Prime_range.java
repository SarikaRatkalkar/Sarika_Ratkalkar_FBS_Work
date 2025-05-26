
public class Prime_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=8, i, j, flag; 
		  
		 for(i=2;i<=range;i++){ 
		   
		  flag = 0; 
		  for(j=2;j<=i/2;j++){ 
		   if(i%j==0) 
		   { 
		    flag=1; 
		    break; 
		   } 
		  }if(flag == 0) 
			  System.out.println(""+i); 
		 } 

	}

}
