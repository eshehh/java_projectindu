package ch16_Thread_1026;

public class GooGoo_Sleep implements Runnable {
	// Runnable 인터페이스를 구현한 클래스 정의
	   private int dan;
	   // 구구단 중 몇단인지를 저장할 변수 dan 선언.

	    public GooGoo_Sleep( int dan){
	       this.dan = dan;
	       // 변수 dan 을 초기화할 생성자를 정의
	    }
	    public void run(){
	    	// run() 메소드안에서 랜덤값(임의의값)을 long 형으로 얻음.
	      long sleepTime = (long)(Math.random() * 5000 );
	      System.out.println(dan+"단이"+ sleepTime+"만큼 sleep..");
	      try{
	          Thread.sleep( sleepTime );
	          // Thread.sleep (sleep Time) 메소드를 사용하여 
	          // 현재 실행 중인 스레드를 변수 sleep TIme 의 값만큼 block 시킴. 
	      }catch(Exception e){
	    	  e.printStackTrace(); 
	      }

	     for( int i=1 ; i<=9 ; i++ ){
	    	 // 변수 dan 과 for 문을 사용하여 구구단을 출력 
	      System.out.println( dan+" 단 : "+dan+" * " + i +" = "+ dan*i );
	     }
	   }
	 }
