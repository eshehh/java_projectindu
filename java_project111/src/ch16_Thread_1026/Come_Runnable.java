package ch16_Thread_1026;

public class Come_Runnable implements Runnable{
	//Runnable 인터페이스를 구현하는 Come_Runnable 클래스를 정의.
		// 단지 Runnable 인터페이스를 구현만 했기 때문에 
		// Come_Runnable 클래스는 아직 스레드는 아니다. 
	   public void run() {
	         while(true){
	          System.out.println("come");
	         }
	         // Come_Runnable 클래스에서 run() 메소드를 오버라이딩하고,
	         // 메소드 내에서 무한루프를 실행한다.
	      }
	  }