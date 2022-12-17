package ch06_sample_1019;
class Person{
	String name;
	int age;
	
	Person(){
		this("이름없음", 1);  // Person(String, int) 생성자 호출
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	// 정체가 메서드임. 그런데, 반환하는 형 : 클래스 형 (Person)
	Person returnItSelf() {
		return this; // 클래스 형 (Person) 인 참조형 변수를 가리킨다.: this 가.
	}

	// get 메서드임. 반환하는 형 : 문자열 형(String)
	public String getName() {
		return name;
	}
	// get 메서드임. 반환하는 형 : 기본 형(정수형 int)
	public int getAge() {
		return age;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {

		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		System.out.println(noName.getName());
		System.out.println(noName.getAge());
		
		
		// 변수를 선언 하는데 형 참조형(Person)
		// p : 참조형 변수
		// returnItSelf() 메서드를 호출하면 결과 값의 타입은(형) : Person 형입니다.
		// 그래서, 받을 변수의 타입 또한 일치 시켜서 Person으로 선언해서 받습니다.
		Person p = noName.returnItSelf();
		//String p2 = noName.returnItSelf();
		
		//만약, 해당 형이 아닌 다른 형으로 받는 방법은 없을까?
		// 있음. 가장 큰 형인 최상위 클래스라고 함. Object 
		// Object 로 받을수 있고, 원래의 형으로 되돌릴수도 있습니다. 
		// 형변을 통해서.
		
		Object p3 = noName.returnItSelf();
		Person p4 = (Person)p3;
		
		// ctrl 누른 상태에서 , 해당 메서드 명을 클릭하면, 메서드가 정의된 곳으로 간다.
		
		System.out.println("p 출력");
		System.out.println(p);
		System.out.println("p3 출력");
		System.out.println(p3);
		System.out.println("p4 출력");
		System.out.println(p4);
		System.out.println(noName);
	}
}