package ch16_Thread_1026;

public class Ch16_Ex5 {
	   public static void main( String [] args ) {
	        
	           Thread t2 = new Thread( new GooGoo_Sleep	(2) );
	           Thread t3 = new Thread( new GooGoo_Sleep	(3) );
	           Thread t4 = new Thread( new GooGoo_Sleep	(4) );
	           Thread t5 = new Thread( new GooGoo_Sleep	(5) );
	           Thread t6 = new Thread( new GooGoo_Sleep	(6) );
	           Thread t7 = new Thread( new GooGoo_Sleep	(7) );
	           Thread t8 = new Thread( new GooGoo_Sleep	(8) );
	           Thread t9 = new Thread( new GooGoo_Sleep	(9) );
	           // 구구단에서 2단부터 9단까지를 출력하기 위해 
	           // 총 8개의 GooGoo 클래스를 이용하는 스레드 객체를 생성.
	           t2.start();
	           t3.start();
	           t4.start();
	           t5.start();
	           t6.start();
	           t7.start();
	           t8.start();
	           t9.start();
	         // 8개 모두의 스레드를 start() 메소드를 호출하여 실행.
	          System.out.println( "main() 종료.........");   
	          // "main() 종료....." 문자열을 출력하여 Main 스레드도 실행 중임을
	          // 알린다. Main 스레드의 역할은 4행분터 25행까지의 main() 메소드를 
	          // 수행하는 것이다. 결국, 실제로는 9개의 스레드가 실행되고 있는 것.
	          // 따라서 "main() 종료........." 문자열이 가장 먼저 출력될수도 있지만,
	          // 출력 결과처럼 다른 스레드 중간에 출력될수도 있다. 
	          // 9개의 스레드가 번갈아 가면서 실행중이기 때문이다. 
	          
	      }
	 }