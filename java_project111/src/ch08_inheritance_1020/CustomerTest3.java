package ch08_inheritance_1020;
   
public class CustomerTest3 {
	 public static void main(String[] args) {
		  VIPCustomer customerKim = new VIPCustomer(10020, "������", 12345);
		  // customerKim.setCustomerID(10020);
		  // customerKim.setCustomerName("������");
		  customerKim.bonusPoint = 10000;
		  System.out.println(customerKim.showCustomerInfo());
	 }
}
