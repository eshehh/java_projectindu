package ch16_Thread_1027;

public class GooGoo_Yield implements Runnable {
	// Runnable 인터페이스를 구현한 클래스 정의
	   private int dan;
	// 구구단 중 몇단인지를 저장할 변수 dan 선언.
	    public GooGoo_Yield( int dan){// 변수 dan 을 초기화할 생성자를 정의
	       this.dan = dan;
	    }
	    public void run(){ //dan 값이 8이면 현재 실행 중인 스레드가
	    	// block 되고 우선권이 동일한 다른 스레드에게 실행할 기회를 준다.
	      if( dan == 8 ) {
	      System.out.println("8 yield..");
	        Thread.yield();
	      }
	     for( int i=1 ; i<=9 ; i++ ){
	   System.out.println( dan+" ´ : "+dan+" * " + i +" = "+ dan*i );
	// 변수 dan 과 for 문을 사용하여 구구단을 출력 
	     }
	   }
	 }