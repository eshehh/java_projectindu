package pattern1_gameCharacterWeaponWorld;

public abstract class Character {
	//다른 캐릭터가 공유하는 추상클래스 역할. 
	WeaponBehavior weapon;
	
	public abstract void fight();
	
	public void setWeapon (WeaponBehavior w) {
		this.weapon = w;
	}
	
}
