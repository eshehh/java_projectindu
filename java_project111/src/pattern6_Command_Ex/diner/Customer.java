package pattern6_Command_Ex.diner;

public class Customer {
	Waitress waitress;
	Order order;
	public Customer(Waitress waitress) {
		this.waitress = waitress;
	}
	public void createOrder(Order order) {
		this.order = order;
	}
	public void hungry() {
		waitress.takeOrder(order);
	}
}