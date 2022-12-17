package ch16_Thread_1027;

public class Ex16_Ex8 {
	   public static void main( String [] args ) {
	       SharedData data = new SharedData();
	       // UpThread 와 DownThread 클래스의 객체가 공유하는 SharedData 클래스의를 
	       // 객체를 생성한다.
	        UpThread t = new UpThread( data, "UP" );
	        DownThread t2 = new DownThread( data, "Down" );
	        // UpThread 와 DownThread 클래스의 객체를 생성하면서 생성자의 
	        // 인자로 공유 객체인 SharedData 클래스의 객체와 스레드명을 지정.
	        // 이렇게 여러 스레드가 하나의 객체를 공유하면 동기화 문제가 발생
	        // 할수 있지만, 자바 스레드는  synchronized 키워드를 사용하여 
	        // 동기화 문제를 방지할수 있다.
	        t.start();
	        t2.start();
	   }
	 }