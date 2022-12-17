package ch10_interfaceex_1021;

public interface Calc {
	
	
	// 컴파일로 변할 때, 상수로 바뀌고
	double PI = 3.14;
	int ERROR = -999999999;
	
	// 컴파일로 변할 때, 추상 메서드로 변경된다. 
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description(){
		System.out.println("정수 계산기를 구현합니다");
		myMethod();
	}
	
	static int total(int[] arr){
		
		int total = 0;
		
		for(int i: arr){
			total += i;
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("private 메서드 입니다.");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static 메서드 입니다.");
	}
}
