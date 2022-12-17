package ch09_gamelevel_1021;

public class Player {
	
	//Player 에 PlayerLevel 추상 클래스형으로 선언 함. 
	// 포함 관계 has A 관계, 모든 클래스들의 관계가 무조건 상속인건 아니죠.
	private PlayerLevel level;
	private UltimateSkill ultimateSkill;
	
	public Player()
	{
		// Player 의  인스턴스를 생성하면, 기본 생성자에서, 추사 클래스형인 PlayerLevel 형으로 선언된
		// 변수에 BeginnerLevel 의 디폴트 생성자 호출이 됨. 
		// 즉 , 설계 Player 를 만드면 기본으로 BeginnerLevel 을 사용한다. 
		level= new BeginnerLevel();
		level.showLevelMessage();
	}

	public PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count){
		level.go(count);
	}
	
	public void useUltimateSkill(UltimateSkill ultimateSkill) {
		this.ultimateSkill = ultimateSkill;
		ultimateSkill.showSkillInfo();
	}
}
