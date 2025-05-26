
public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 2;  
		 int a = 10; 
		 int basicSalary = 5000; 
		 double ba, ta ,hra; 
		 double totalSalary; 
		  
		 if(choice == 1){ 
		  if(a%2==0){ 
			  System.out.println("a is even"); 
		  }else{ 
			  System.out.println("a is odd"); 
		  } 
		 }else if(choice == 2){ 
		  if(basicSalary<=5000){ 
		   ba = basicSalary * 0.1; 
		   ta = basicSalary * 0.15; 
		   hra = basicSalary * 0.2; 
		  }else{ 
		   ba = basicSalary * 0.15; 
		   ta = basicSalary * 0.20; 
		   hra = basicSalary * 0.25; 
		  } 
		  totalSalary = basicSalary + ba + ta + hra; 
		  System.out.println("Total Salary is : " + totalSalary); 
		 }else if(choice > 2){ 
			 System.out.println("Invalid Choice"); 
		 }

	}

}
