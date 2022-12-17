package ch05_test_1018;

public class Student2 {
	String studentName; //이름
	int studentNum; // 학번 
	String email; // 메일 
	String location; // 사는 곳. 
	//클래스 기본적인 멤버 변수를 선언만 했음. 
	// 기본형을 제외하고는 참조형 변수.예) Student2, String,등
	
	public void studentGetInfo() {
		System.out.println("이름은 : "+studentName);
	
	}
	
	public void sum(int num1, int num2) { //void 리턴의 결괏값이 없다.
		
		System.out.println("sum 함수를 호출한 결괏값 출력: " +num1+num2);
		
	}
	
	public static int sum2(int num1, int num2) { //void 리턴의 결괏값이 없다.
		System.out.println(num1+num2);
		sum3(100, 200);
		return num1+num2; //결괏값의 반환 타입이 int임을 나타냄. 
		// 해당 메서드 선언부에서 확인이 가능함. 
		
	}
	
public static void sum3(int num1, int num2) { //void 리턴의 결괏값이 없다.
		
		System.out.println("sum 함수를 호출한 결괏값 출력: " +num1+num2);
		
	}
	
	public static void main(String[] args) {
		//메인 메소드가 먼저 호출되고,
		
		//해당 객체를 생성하는 new 키워드 설명을 안드렸음. 
		Student2 lsy = new Student2(); // lsy 객체 생성
		Student2 lsy2 = new Student2(); // lsy2 객체 생성
		lsy.studentName = "이상용1";
		lsy2.studentName = "이상용2";
		lsy.studentGetInfo();
		lsy2.studentGetInfo();
		//Student2 : 클래스 이름. 
		// lsy : 참조형 변수 이름. 
		// new : 키워드를 통해서 해당 객체를 생성.
		// Student2() : 매개변수가 없는 기본 생성자라고 함. 
		// 역할은 기본값을 초기화하는 역할. 
		
		//해당 객체를 통해서 함수를 호출. 
		lsy.sum(10, 20);
		
		//지금은 객체 없이 해당 클래스 명으로 함수를 호출. 
		int result = Student2.sum2(10, 20);
		// 두번째 sum2 함수(메서드) 호출하는 부분.
		
	}
	
	
}