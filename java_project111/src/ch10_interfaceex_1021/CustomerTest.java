package ch10_interfaceex_1021;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
	
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		
		Refund refunder = customer;
		refunder.refund();
		refunder.order();
		
//		if( seller instanceof Customer){
//			Customer customer2 = (Customer)seller;
//			customer2.buy();
//			customer2.sell();
//		}
		
//		customer.order();
	}
}


// 고객이 환불 인터페이스 만들기.
// refund 라는 추상 메서드 만들기
// 고객이 환불 인터페이스 구현하기
// 해당 고객으로 환불 받아보기
// 다형성으로 환불 인터페이스형으로 선언해서, 사용해보기.

