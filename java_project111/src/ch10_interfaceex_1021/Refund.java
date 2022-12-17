package ch10_interfaceex_1021;

public interface Refund {

	void refund();
	
	default void order(){
		System.out.println("환불 주문하기");
	}
}