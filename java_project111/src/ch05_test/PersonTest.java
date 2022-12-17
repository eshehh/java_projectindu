package ch05_test;

public class PersonTest {
   
	 public static void main(String[] args) {
		 //기본 생성자 호출
		  Person lsy = new Person();
		  //데이터에 직접 접근 할거냐?
//		  lsy.name="이상용";
		  lsy.height= 171F;
		  lsy.weight= 75F;
		  
//		  set (메서드)를 이용해서 name 값 설정하기.dddddㅇㅇ
		  lsy.setName("이상용세터로추가했음.");
		  lsy.showInfo();
		  //get (메서드)를 이용할것이냐?
		  System.out.println("get메서드로 이름호출: "
		  		+ lsy.getName());
		  //
		
		  
		  // 매개변수가 1개인 생성자를 호출. 
		  Person lsy2 = new Person("이상용");
		  lsy2.height= 171F;
		  lsy2.weight= 75F;
		  lsy2.showInfo();
		  
		  
//		  매개변수가 3개인 생성자를 호출. 
		  Person lsy3 = new Person("이상용",171F,75F);
		  lsy3.showInfo();
//		  personKim.name = "������";
//		  personKim.weight = 85.5F;
//		  personKim.height = 180.0F;
//		
//		  Person personLee = new Person("�̼���", 175, 75);
	 }
}
