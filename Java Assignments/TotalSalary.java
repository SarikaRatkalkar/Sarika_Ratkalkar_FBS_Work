
public class TotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int da, ta, hra; 
		 int basic = 6000; 
		 int total_salary; 
		  
		 if(basic<=5000){ 
		  da = (basic*10)/100; 
		  ta = (basic*20)/100; 
		  hra = (basic*25)/100; 
		 }else{ 
		  da = (basic*15)/100; 
		  ta = (basic*25)/100; 
		  hra = (basic*30)/100; 
		 } 
		 total_salary = basic + da + ta + hra; 
		 System.out.println("Total Salary: "+ total_salary);

	}

}
