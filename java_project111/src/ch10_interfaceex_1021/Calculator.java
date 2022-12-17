package ch10_interfaceex_1021;

public abstract class Calculator implements Calc{

	//인터페이스를 구현한 클래스이면서, 동시에 추상 클래스로 전환했음. 
	// 그래서, 구현한 메서드는 더하기, 빼기만 재정의를 했고, 
	// 나머지 나누기, 곱하기 메서드는 구현을 안했음. -> 대신에 추상 클래스로 변했음. 
	// 나를 상속한 클래스가 대신 나머지 메서드를 구현 해야 합니다. 
	// CompleteCalc 클래스가 상속을 받으면서, 구현 하지 않은 나머지 2개 메서드를 재정의 합니다. 
	
	
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	
}
