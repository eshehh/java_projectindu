package ch08_inheritance_1020;

public class OverridingTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());

		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		customerKim.bonusPoint = 10000;
		//System.out.println(customerKim.showCustomerInfo());
		
		Customer lsy = new VIPCustomer(10030,"이상용",7777);
//		lsy.calcPrice(10000);
		
		int price = 10000;
		System.out.println(lsy.getCustomerName() +" 님이 지불해야 하는 금액은 " + lsy.calcPrice(price) + "원입니다.");
		System.out.println(customerKim.getCustomerName() +" 님이 지불해야 하는 금액은 " + customerKim.calcPrice(price) + "원입니다.");
	}
}
