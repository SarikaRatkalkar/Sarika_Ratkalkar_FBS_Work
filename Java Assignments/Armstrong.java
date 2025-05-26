
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=6,i; 
		  
		  
		 int temp, rem, sum , mul;  
		  
		 int tempcount; 
		 for(i=1; i<=range;i++){ 
		  temp =i; 
		   int  count=0; 
		 while(temp>0){ 
		   
		  count++; 
		  temp=temp/10; 
		 } 
		  
		 temp = i; 
		 sum = 0; 
		 while(temp>0){ 
		   
		  rem = temp%10; 
		  tempcount=count; 
		   
		  mul=1; 
		  while(tempcount>0){ 
		    
		   mul = mul*rem; 
		   tempcount--; 
		  } 
		   
		  sum = sum+mul; 
		  temp=temp/10; 
		 } 
		 if(sum==i) 
			 System.out.println(""+ i); 
		 } 

	}

}
