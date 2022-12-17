package ch16_Thread_1026;

public class Ex16_Ex2 {
	   public static void main( String [] args ) {
	           Go_Thread g = new Go_Thread(); // Go_Thread 클래스의 객체를 생성.
	           Come_Thread c = new Come_Thread(); // Come_Thread 클래스의 객체를 생성.
	           g.start();
	           //Come_Thread 클래스 객체의 start() 메소드를 호출한다.
	           // Go_Thread 클래스의 객체에서 먼저 start() m메소드를 호출하여 
	           // Go_Tread 클래스 객체의 start() 메소드에 의해 
	           // Com_Thread 객체의 run() 메소드가 번갈아 가면서 결과를 
	           // 출력한다. 
	           
	           c.start();
	      }
	 }
