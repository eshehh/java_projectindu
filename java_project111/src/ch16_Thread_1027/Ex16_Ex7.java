package ch16_Thread_1027;

public class Ex16_Ex7 {
	   public static void main( String [] args ) {
	        
	           Thread t2 = new Thread( new GooGoo_Join(2) );
	           Thread t3 = new Thread( new GooGoo_Join(3) );
	           Thread t4 = new Thread( new GooGoo_Join(4) );
	           Thread t5 = new Thread( new GooGoo_Join(5) );
	           Thread t6 = new Thread( new GooGoo_Join(6) );
	           Thread t7 = new Thread( new GooGoo_Join(7) );
	           Thread t8 = new Thread( new GooGoo_Join(8) );
	           Thread t9 = new Thread( new GooGoo_Join(9) );
	           
	           t2.setPriority(4);
	           t3.setPriority(4);
	           t4.setPriority(4);
	           t5.setPriority(4);
	           t6.setPriority(4);
	           t7.setPriority(4);
	           t8.setPriority(4);
	           t9.setPriority(4);
	        
	           t2.start();
	           t3.start();
	           t4.start();
	           t5.start();
	           t6.start();
	           t7.start();
	           t8.start();
	           t9.start();
	           try{
	              t9.join();
	            }catch(Exception e) { e.printStackTrace(); }         

	          System.out.println( "main() 종료.........");   
	      }
	 }
