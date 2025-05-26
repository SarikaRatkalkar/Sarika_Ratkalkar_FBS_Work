
public class Strong_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  b=9, num,i,temp; 
		 
		 int sum; 
		 
		  
		 int rem,fact; 
		 for (num = 1; num <= b; num++) { 
		  temp = num; 
		  sum=0; 
		  while (temp > 0) { 
		   rem = temp % 10; 
		   fact = 1; 
		   while(rem>0) { 
		    fact = fact * rem; 
		    rem--; 
		   } 
		   sum =sum + fact; 
		   temp =temp/ 10; 
		  } 
		  if (sum == num) { 
			  System.out.println(""+ num); 
		  } 
		 }

	}

}
