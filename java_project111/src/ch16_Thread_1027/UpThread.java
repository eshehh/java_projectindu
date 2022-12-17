package ch16_Thread_1027;

public class UpThread extends Thread{
	//Thread 클래스를 상속받은 UpThread 클래스를 작성.
    
    SharedData data;
    String name;
    // 공유 데이터인 SharedData 클래스와 스레드명을 저장하는 String 형의 변수
    // name 을 선언. 
  public UpThread(SharedData data, String name ){
       this.data = data;
       this.name = name;
       // SharedData 클래스의 객체 data와 String 객체인 name 의 값을 
       // 초기화하는 생성자를 작성. 
   }
   public void run(){
   for( int i=0; i < 10000; i++ ){
     try{
       Thread.sleep(500);
       // sleep() 메소드에 의해 0.5초 간격으로 블록되면서 SharedData  클래스의 
       // up() 메소드를 호출한다. SharedDate 클래스에 정의된 up() 메소드는 
       // synchronized(동기화)되어 있다.
    }catch(Exception e){ e.printStackTrace();}
 data.up(name);
 }
}
}
