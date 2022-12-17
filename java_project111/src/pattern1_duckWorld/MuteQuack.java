package pattern1_duckWorld;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("====조용조용=====");
	}

}
