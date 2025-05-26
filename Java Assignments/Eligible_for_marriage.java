
public class Eligible_for_marriage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 17; 
		 char gender = 'F'; 
		   
		 if(gender == 'M'){ 
		  if(age>=21){ 
			  System.out.println("Male is eligible for marriage"); 
		  }else{ 
			  System.out.println("Male is not eligible for marriage"); 
		  } 
		   
		 }else if(gender == 'F'){ 
		//  if(gender == 'F'){ 
		  if(age>=18){ 
			  System.out.println("Female is eligible for marriage"); 
		  }else{ 
			  System.out.println("Female is not eligible for marriage"); 
		  } 
		  }

	}

}
