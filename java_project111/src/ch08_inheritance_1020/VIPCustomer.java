package ch08_inheritance_1020;

public class VIPCustomer extends Customer{

	private int agentID;
	double saleRatio;
	
	// 샘플로 메서드를 통해서 다형성의 특징 설명
	// 매개변수에 자식 클래스인 VIPCustomer 만 사용이되고
	public void testMethod(VIPCustomer vip) {
		
	}
	// 매개변수에 자식 클래스인 VIPCustomer 와 Customer 부모클래스 사용이 동시에 된다.
public void testMethod2(Customer cus) {
		
	}
	// 매개변수에 최고 상위 클래스인 Object 가 와서 모든 클래스를 사용할수있다.
public void testMethod3(Object o1) {
	
}
	
	public VIPCustomer()
	{
		//부모클래스의 생성자가 먼저 호출이 됩니다. 사실
		// super() 예약어 생략이 되어 있음.
		super();
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCusomer() 생성자 호출");
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID){
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIPCusomer(int, String) 생성자 호출");
	}
	
	
	public int calcPrice(int price){
		System.out.println("vip clac 메서드입니다.");
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID(){
		return agentID;
	}
	
	
}
