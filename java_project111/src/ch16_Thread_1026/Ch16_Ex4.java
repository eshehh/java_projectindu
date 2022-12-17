package ch16_Thread_1026;

public class Ch16_Ex4 {
	   public static void main( String [] args ) {
	        System.out.println(Thread.currentThread().getName() );
	        //Thread.currentThread() 메소드는 현재 실행 중인 스레드의 
	        // 정보를 얻는 방법. getName() 메소드를 이용하여 실행 중인 
	        // 스레드의 이름을 얻는다.
	        System.out.println(Thread.currentThread().getPriority() );
	        // getPriority() 메소드를 사용하여 현재 실행 중인 스레드의 
	        // 우선권을 얻을수 있다. 
	        System.out.println( Thread.MAX_PRIORITY);
	        // 스레드 우선권의 최대값을 출력한다. 최댓값은 10.
	        System.out.println( Thread.NORM_PRIORITY );
	        // 스레드 우선권의 최대값을 출력한다. 기본값은 5.
	        System.out.println( Thread.MIN_PRIORITY );
	        // 스레드 우선권의 최대값을 출력한다. 최소값은 1.
	      }
	 }
