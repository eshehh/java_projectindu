package pattern1_gameCharacterWeaponWorld;

public class SimGameChaPlay {

	public static void main(String[] args) {
		// king 캐릭터 생성
		Character king = new King();
		// king 나이프 클래스 인자값으로 
		king.setWeapon(new KnifeBehavior());
		// king fight 메서드 호출. 가상메서드.
		king.fight();
		// 나이프 무기 장착후 사용해보기.
		king.weapon.useWeapon();
	}

}
