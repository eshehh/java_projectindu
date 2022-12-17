package ch10_interfaceex_1021;

public class CalculatorTest {
	
	public void testInterfaceMethod(Calc calc) {
		//테스트 메서드에 올수 있는 매개변수 형은 무엇인가요?
		// Calc 를 포함한 , Calc 인터페이스를 구현한 하위 클래스 모두가 올수 있다. 
		//APIE 
		// A : 추상화 
		// P : 다형성 
		// I : 상속 
		// E : 캡슐화 
		
	}

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		
		//다형성 , 인터페이스 Calc 를 구현을 하면, 마치 상속에서 부모 클래스 형으로 받듯이,
		// 해당 구현한 인터페이스 형으로도 받을수 있습니다. 
		Calculator calculator = calc;
		Calc calc2 = calculator;
		Calc newCalc = calc;
		
		Test t1 = new Test();
		Calc calc3 = t1;
		Test t2 = (Test)calc3;
		
		
		calc.description();   //디폴트 메소드 호출
				
	    int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));  //정적 메소드 사용하기

	}
}