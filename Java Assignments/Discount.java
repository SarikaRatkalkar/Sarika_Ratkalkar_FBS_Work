
public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 500; 
		 double discount = 0; 
		 double finalprice; 
		  
		 if(price<=500){ 
		  discount = price*0.1; 
		 }else if(price>500 && price<=1000){ 
		  discount = price*0.2; 
		 }else if(price>1000 && price<=2000){ 
		  discount = price*0.25; 
		 } 
		 finalprice = price-discount; 
		 System.out.println("Final Price = " + finalprice);

	}

}
