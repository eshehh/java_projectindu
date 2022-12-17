package ch08_virtualfunction_1020;

public class TestA {

	int num;

	void aaa(){
		System.out.println("aaa() 출력");
	}
	
	public static void main(String[] args){
		
		TestA a1 = new TestA();
		a1.aaa();
		
		TestA a2 = new TestA();
		a2.aaa();
		
		System.out.println("TestB 자기꺼 원래 출력. ");
		TestB b1 = new TestB();
		b1.aaa();
		
		System.out.println("TestA 부모형 선언 하고 출력... ");
		TestA b2 = new TestB();
		b2.aaa();
	}
}
