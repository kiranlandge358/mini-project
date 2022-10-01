package com.flipkart;

public class Test {
	
	
	public static void main(String[] args) throws InterruptedException {
	
    Products product=new Products();
	product.insert();
	Thread.sleep(2000);
	
	User user=new User();
	user.getUserInput();
	Thread.sleep(2000);
	
	Sort sort=new Sort();
	sort.getSorted();
	
    System.out.println("THANK YOU FOR VISITING FLIPKART");


	
	}

}
