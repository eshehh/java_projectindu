package ch14_exception_1025;

import java.io.FileInputStream;

public class AutoCloseTest {
	// 이 클래스에서는 close() 메서드를 직접 호출 하는 부분이 없음.
	// 하지만 try with resource 구문으로 인해서
	// 자동으로 close () 출력되는 부분을 확안하는 예제.
	public static void main(String[] args) {
		AutoCloseObj obj = new AutoCloseObj();
		// try with resource 기본 구문
		// 매개변수에 직접적인 객체 들어왔다.
		try (AutoCloseObj obj2 = obj){
			// 임의로 예외를 발생시키는 코드.
			// throw vs throws(던지기, 예외를 미루는 키워드)
			System.out.println("강제로 예외 발생 전 부분입니다.");
			throw new Exception();
		//	System.out.println("강제로 예외 발생 후 부분입니다.");
		}catch(Exception e) {
			System.out.println("예외부분입니다.");
		}
	}
}
