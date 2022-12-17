package ch09_gamelevel_1021;

public class UltimateSkill {
	private String skillName;
	private int skillTime;
	private String skillRange;
	
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public int getSkillTime() {
		return skillTime;
	}
	public void setSkillTime(int skillTime) {
		this.skillTime = skillTime;
	}
	public String getSkillRange() {
		return skillRange;
	}
	public void setSkillRange(String skillRange) {
		this.skillRange = skillRange;
	}
	
	public UltimateSkill(String skillName, int skillTime, String skillRange) {
		super();
		this.skillName = skillName;
		this.skillTime = skillTime;
		this.skillRange = skillRange;
	}
	
	public void showSkillInfo() {
		System.out.println("필살기 이름 : " + skillName+ " 지속시간: "+skillTime+ " 스킬범위: "+skillRange);
		
	}
}
