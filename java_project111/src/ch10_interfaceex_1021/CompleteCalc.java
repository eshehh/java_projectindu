package ch10_interfaceex_1021;

public class CompleteCalc extends Calculator{

	// CompleteCalc 클래스는 부모 클래스 Calculator(추상클래스): 2개를 구현하고, 2개를 구연 안함. 
	// 구현을 안한 2개의 메서드는 상속받은 자식 클래스가 재정의 했습니다. 
	
	// CompleteCalc 기본 디폴트 생성자 호출시 , 사용자가 정의한 생성자가 없음. 
	// 그래서, 기본 디폴트 생성자를 컴파일러가 알아서 만들어 줌. CompleteCalc()
	// 기본 생성자안에서 다시, 부모의 생성자를 또 호출 함. super() 
	// 2가지 생략이 되어 있음. 
	
	@Override
	public int times(int num1, int num2) {
		
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0 )
			return num1/num2;
		else 
			return Calc.ERROR;
	}
	
	public void showInfo(){
		System.out.println("Calc 인터페이스를 구현하였습니다" );
	}

	@Override
	public void description() {
		super.description();
	}
}
