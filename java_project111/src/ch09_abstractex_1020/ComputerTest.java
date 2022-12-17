package ch09_abstractex_1020;

public class ComputerTest {

	public static void main(String[] args) {
		//추상 클래스는 인스턴스화 할수 없다. 
//		Computer c1 = new Computer();
		Computer c2 = new DeskTop();
		// 바라보는 관점이 c2 Computer
		c2.display();
		c2.turnOn();
		c2.turnOff();
		c2.typing();
//		Computer c3 = new NoteBook();
		System.out.println("==================");
		Computer c4 = new MyNoteBook();
		c4.display();
		c4.turnOn();
		c4.turnOff();
		c4.typing();
	}
}
