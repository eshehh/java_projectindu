package ch05_test;

public class Person {
	//private : 접근 지정자, 외부에서 해당 속성을 볼 수 없게 함.
	// get, set 함수를 이용해서 해당 데이터에 우회하여 접근
private	  String name;
	  float height;
	  
	  //자동으로 생성된 set, get 함수등.
	  public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	float weight;
	  
	  
	  // 기본 생성자 : 역할 : 멤버 변수를 초기화한다.
	  // 기본 생성자는 해당 클래스 내에서 아무런 생성자가 없다면
	  // 시스템에서 기본으로 만들어줌.
	  // 만약, 하나 이상의 생성자가 있다면 안만들어줌.
	  public Person() {}
	
	  
	  // 매개변수가 1개인 생성자.
	 public Person(String pname) {
		   name = pname;
	  }
	  
	  // 매개변수가 3개인 생성자.
	  public Person(String pname, float pheight, float pweight){
		   name = pname;
		   height = pheight;
		   weight = pweight;
	  }

	  public void showInfo() {
		System.out.println("이름 = "+ name +
				 " 키 : "+ height +
				 " 몸무게 : "+weight);
	}



}   



