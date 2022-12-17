package ch16_Thread_1026;

public class Ch16_Ex1{
	   public static void main( String [] args ) {
	           Go g = new Go(); // Go 클래스의 객체 생성
	           Come c = new Come(); // come 클래스의 객체 생성
	           g.go(); // Go 클래스의 go() 메소드 호출
	           c.come(); // Go 클래스의 come() 메소드 호출
	           // 7행에서 go() 메소드를 먼저 호출하여서
	           // 결과값은 "go" 문자열만 계속 출력된다. 
	           // Go 프로세스가 계속해서 CPU 실행권을 가지면서
	           // 실행되고 있다. 
	           
	      }
	 }