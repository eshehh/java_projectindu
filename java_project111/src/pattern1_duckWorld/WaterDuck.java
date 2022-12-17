package pattern1_duckWorld;

public class WaterDuck extends Duck {

	public WaterDuck() {
		// 꽥 소리내는 클래스 생성자 호출
		quackBehavior = new Quack();
		// 날수 있는 오리 
		flyBehavior = new FlyWithWings();
		// 수영 하는 오리 
		swimBehavior = new Swimming();
		
	}
	
	@Override
	public void display() {
		System.out.println("상용 물오리입니다.");
	}

}
