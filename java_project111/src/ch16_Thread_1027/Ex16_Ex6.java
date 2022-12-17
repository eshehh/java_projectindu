package ch16_Thread_1027;

public class Ex16_Ex6 {
	   public static void main( String [] args ) {
	        
	           Thread t2 = new Thread( new GooGoo_Yield(2) );
	           Thread t3 = new Thread( new GooGoo_Yield(3) );
	           Thread t4 = new Thread( new GooGoo_Yield(4) );
	           Thread t5 = new Thread( new GooGoo_Yield(5) );
	           Thread t6 = new Thread( new GooGoo_Yield(6) );
	           Thread t7 = new Thread( new GooGoo_Yield(7) );
	           Thread t8 = new Thread( new GooGoo_Yield(8) );
	           Thread t9 = new Thread( new GooGoo_Yield(9) );
	           // 총 8개의 GooGoo 클래스를 이용하는 스레드 객체를 생성.
	           t2.setPriority(4);
	           t3.setPriority(4);
	           t4.setPriority(4);
	           t5.setPriority(4);
	           t6.setPriority(4);
	           t7.setPriority(6);
	           t8.setPriority(5);
	           t9.setPriority(5);
	        //8개의 스레드의 우선권을 지정한 값으로 변경.
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
	          //"main() 종료........." 문자열을 출력하여 Main 스레드도 실행중임 알림.
	      }
	 }
