package ch13_innerclass_1024;


class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
		//getRunnable 메서드 이름이고, 매개변수로 i 라는 변수를 입력값
	// getRunnable 메서드 호출 하면 , 결과 값이 참조형 변수. 결과값의 타입이 인터페이스 형. Runnable
	// new MyRunnable(); 다형성 개념. 리턴 타입을 받는 형이 Runnable이다. 
	Runnable getRunnable(int i){

		int num = 100;
		
		class MyRunnable implements Runnable{ // MyRunnable 자식 클래스 입장. Runnable : 부모 형, 상위 개념. 

			int localNum = 10;
				
			@Override
			public void run() {
				//num = 200;   //에러 남. 지역변수는 상수로 바뀜
				//i = 100;     //에러 남. 매개 변수 역시 지역변수처럼 상수로 바뀜
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
				}
			}
		 return new MyRunnable(); // 리터 타입이 new MyRunnable(); -> 사실은 Runnable 를 구현했다. 그래서, 
		 // 상위 개념이 있다. 
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {

		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}
