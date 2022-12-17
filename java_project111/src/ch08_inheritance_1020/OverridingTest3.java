package ch08_inheritance_1020;

public class OverridingTest3 {

	public static void main(String[] args) {
		
		int price = 10000;
		Customer customerLee = new Customer(10010, "�̼���");   //Customer �ν��Ͻ� ����
		System.out.println(customerLee.getCustomerName() +" ���� �����ؾ� �ϴ� �ݾ��� " + customerLee.calcPrice(price) + "���Դϴ�.");
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������", 12345);  //VIPCustomer �ν��Ͻ� ����
		System.out.println(customerKim.getCustomerName() +" ���� �����ؾ� �ϴ� �ݾ��� " + customerKim.calcPrice(price) + "���Դϴ�.");
		
		Customer vc = new VIPCustomer(10030, "������", 2000);  // VIPCustomer �ν��Ͻ��� Customer Ÿ�Կ� ���� 
		System.out.println(vc.getCustomerName() +" ���� �����ؾ� �ϴ� �ݾ��� " + vc.calcPrice(10000) + "���Դϴ�.");
		
	}
}
