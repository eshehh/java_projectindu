package pattern6_Command_Ex.diner;

public class Waitress {
	Order order;
	public Waitress() {}
	public void takeOrder(Order order) {
		this.order = order; 
		order.orderUp();
	}
}