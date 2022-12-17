package ch16_Thread_1027;

public class GooGoo_Join implements Runnable {
	// Runnable 인터페이스를 구현한 클래스 정의
	   private int dan;
	// 구구단 중 몇단인지를 저장할 변수 dan 선언.
	    public GooGoo_Join( int dan){
	       this.dan = dan;// 변수 dan 을 초기화할 생성자를 정의
	    }
	    public void run(){
	       try{
	          Thread.sleep(2000); // 0.5초 동안 실행 중인 스레드를 block 시킴.
	        }catch(Exception e){ e.printStackTrace(); }
	      
	     for( int i=1 ; i<=9 ; i++ ){ 
	   System.out.println( dan+" 단 : "+dan+" * " + i +" = "+ dan*i );
	     }// 변수 dan 과 for 문을 사용하여 구구단을 출력 
	   }
	 }
