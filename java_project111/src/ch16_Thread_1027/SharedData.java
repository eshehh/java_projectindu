package ch16_Thread_1027;

public class SharedData {
	//서로 다른 두개의 객체(DownThread 와 UpThread 클래스의 객체가) 공유해서 
	//사용할 SharedData 클래스를 작성한다.
    int data;
  
   public  void up (String name){
	   // SharedData 클래스의 int 형 변수 data의 값을 1 증가시키는 up()
	   // 메소드를 작성한다. 동기화(synchronized)되어 있기 때문에 
	   // 12 ~ 14 행 코드가 모두 수행되는 것을 보장.
      System.out.print( name +" 이"+ data );
      data++;
      System.out.println( "를 "+ data +" 로 증가시킴 _ up 메서드 수행을 보장 받았음.");
   }
   public synchronized void down (String name){
	   // SharedData 클래스의 int 형 변수 data의 값을 1 감소시키는 down()
	   // 메소드를 작성한다. 동기화(synchronized)되어 있기 때문에 
	   // 20 ~ 22 행 코드가 모두 수행되는 것을 보장.
      System.out.print( name +" 이"+ data );
      data--;
      System.out.println( "를 "+ data +" 로 감소시킴  down 메서드 수행을 보장 받았음.");
   }
}
