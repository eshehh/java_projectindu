package ch08_witharraylist_1020;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		// vvip 라는 클래스를 한번 더 설계.
		// 1) 혜택 추가 : 보너스 적립율 : 15%, 할인율 20%, 전문 상담원 VVIP , 추가로 발렛 파킹 제공. 
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerYul = new GoldCustomer(10040, "이율곡");
		Customer customerKim = new VIPCustomer(10050, "김유신", 12345);
		GoldCustomer lsy = new GoldCustomer(10060, "이상용");
		Customer VvipCustomer = new VvipCustomer(10070, "배선한", 12346, 1234);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);
		customerList.add(lsy);
		customerList.add(VvipCustomer);
		
		System.out.println("====== 고객 정보 출력 =======");
		
		for( Customer customer : customerList){
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== 할인율과 보너스 포인트 계산 =======");
		
		int price = 10000;
		for( Customer customer : customerList){
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() +" 님이 " +  + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() +" 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
		}
	}
}
