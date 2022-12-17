package ch09_gamelevel_1021;

public class MainBoard {

	public static void main(String[] args) {

		String str = new String();
		// 추상클래스 및 다형성 흐름을 간단히 요약. 
		// Player 는 이 클래스 안에 , 추상클래스(부모클래스) PlayerLevel 를 참조형 변수 level 선언. 
		// has A 관계로 사용합니다. 
		// Player 디폴트 생성자에 , 기본 BeginnerLevel 인스턴스가 생성이 됩니다. 
		// 그리고 각 자식 클래스 3개 있음. BeginnerLevel, AdvancedLevel, SuperLevel 
		// 3개 클래스의 공통점 자식 클래스, 그래서 부모가 추상클래스이므로, 자식은 상속을 했기 때문에,
		// 반드시, 부모에서 정의한 추상 메서드를 강제로 구현 합니다. 
		// 반드시 구현 하는 기능은 4가지. 
//		public abstract void run();
//		public abstract void jump();
//		public abstract void turn();
//		public abstract void showLevelMessage();
		
		// 템플릿 메서드는 final 표기 해서, 변경 못하게 했고, 
		// go ( 템플릿 메서드는) 안에 정의한 순서대로 진행을 합니다. 
		// 진행 할 때, 호출하는 메서드는 자식 메서드입니다. (가상메서드), 
		// 부모에도 있고, 자식에도 있고, (같은 메서드) 있다면, 자식을 선택한다. 
		
		// 다형성 예졔 ) .. 부모클래스형(타입) level ;
		// 	level= new BeginnerLevel(); 사용 했습니다. 
		
		//추가하기
		// SuperLevel 다음 단계 : UltraLevel 만들기.
		// 추상 클래스인 PlayerLevel 상속 받고,
		// 기능을 구현하는데 . 구현 내용은 각자 알아서 좋게 작성.
		// 해당 레벨은 4라고 합니다
		// Player 클래스에 있는 각 메서드 구현
		
		
		
		Player player = new Player();
		player.play(1);
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		UltraLevel uLevel = new UltraLevel();
		player.upgradeLevel(uLevel);
		player.play(4);
		player.useUltimateSkill(new UltimateSkill("울트라스킬", 5, "전역범위"));
	}
}
