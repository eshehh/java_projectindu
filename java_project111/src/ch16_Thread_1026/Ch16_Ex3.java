package ch16_Thread_1026;

public class Ch16_Ex3 { 
	   public static void main( String [] args ) {
	           Go_Runnable g = new Go_Runnable();
	        // Go_Runnable 클래스의 객체를 생성. 아직 스레드는 아니다.
	           Come_Runnable c = new Come_Runnable();
	        // Come_Runnable 클래스의 객체를 생성. 아직 스레드는 아니다.
	           Thread t = new Thread( g );
	           // Go_Runnable 클래스의 객체를 스레드로 실행하기 위해서 
	           // Thread 객체를 생성하면서 생성자의 인자에 
	           //Go_Runnable 객체를 지정한다. Thread 클래스의 생성자에 
	           // Go_Runnable 클래스의 객체를 지정함으로써 
	           // 이제 Go_Runnale 클래스는 Thread라고 할수 있다. 
	           Thread t2 = new Thread( c );
	           // Come_Runnable 클래스의 객체를 스레드로 실행하기 위해서 
	           // Thread 객체를 생성하면서 생성자의 인자에 
	           //Come_Runnable 객체를 지정한다. Thread 클래스의 생성자에 
	           // Come_Runnable 클래스의 객체를 지정함으로써 
	           // 이제 Come_Runnale 클래스는 Thread라고 할수 있다. 
	           t.start();
	           // Go_Runnable 클래스의 객체의 start() 메소드를 호출
	           t2.start();
	           //Come_Runnable 클래스의 객체의 start() 메소드를 호출
	      }
	 }
