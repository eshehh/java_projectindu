package pattern1_duckWorld;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	SwimBehavior swimBehavior;
	
	public Duck() {}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performSwim() {
		swimBehavior.swim();
	}
	
	//메소드 2개 추가. fly 행동 인터페이스, quack 행동 인터페이스 매개변수로 받아 설정하는 
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
		
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
		
	}
	
	public void swim () {
		System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
	}

}
