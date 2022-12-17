package ch08_witharraylist_1020;

public class VvipCustomer extends Customer{

	private int agentID;
	double saleRatio;
	private int parkingNum;
	
	public VvipCustomer(int customerID, String customerName, int agentID, int parkingNum){
		super(customerID, customerName);
	
		customerGrade = "VvIP";
		bonusRatio = 0.15;
		saleRatio = 0.2;
		this.agentID = agentID;
		this.parkingNum = parkingNum;
	}
	
	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public String showCustomerInfo(){
		return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다" +  "발렛파킹 번호" + parkingNum+ "입니다";  
	}

	public int getAgentID(){
		return agentID;
	}
}
