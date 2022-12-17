package pattern1_duckWorld;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		System.out.println("======청둥오리======");
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		mallard.swim();
		
		// 물오리 만들기. 
		System.out.println("======물오리======");
		Duck swimDuck = new WaterDuck();
		swimDuck.performQuack();
		swimDuck.performFly();
		swimDuck.swim();
		swimDuck.performSwim();
		
		//모델 오리 만들기
		System.out.println("======로켓오리======");
		Duck model = new ModelDuck();
		System.out.println("======로켓 오리 변경전===");
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		System.out.println("======로켓 오리 변경후===");
		model.performFly();
		
		//사냥꾼이 사용하는 모형 오리 삑만 , 덕 상속 안받고
		System.out.println("======사냥꾼 가짜 오리======");
		FakeDuckQuack fakeDuckQuack = new FakeDuckQuack();
		fakeDuckQuack.quackBehavior.quack();
		
		
	}

}
