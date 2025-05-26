
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=134, rev=0, rem, temp; 
		 
		    for(temp = num; num>0; num = num/10){ 
		     rem = num%10; 
		     rev = rev*10+rem; 
		 } 
		 
		 if(rev == temp){ 
			 System.out.println("Number is a palindrome"); 
		 }else 
			 System.out.println("Number is not a palindrome"); 

	}

}
