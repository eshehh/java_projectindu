package ch09_gamelevel_1021;

public class UltraLevel extends PlayerLevel{
	@Override
	public void run() {
		System.out.println("빛의 속도로 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("하늘 높이 jump 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("두 바퀴 돕니다.");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 울트라 레벨 입니다. *****");
	}

	
}
