package ch06_singleton_1019;

public class Company {

	
	// instance : 참조형 변수 이름.
	// Company : 참조형(클래스형)
	// private : 외부에서 볼수가 없음. 즉, 외부에서 객체 생성을 못함.
	// static : 객체 생성없이 접근 가능 말함. 공유자원.
	//new Company(); 기본 생성자를 호출해서, 해당 객체를 생성함.
	// 왜 이렇게 하죠? 객체를 하나로만 해서 작업 할려고, 객체 여러개 생성 필요가 없어서.
	// 보통, 디비 서버 연결하는 자원에 많이 활용함.
	
	private static Company instance = new Company();
	String name;
	String address;
	int age;
	
	// 기본 생성자, private 밖에서 안보임. 안보이니 생성도 못함.
	// 이유? 객체 하나만 사용할려고.
	
	private Company(){}
	
	//getInstance() : 메서드 명
	// 반환 타입 : Company형
	// 활용 하는 예 :
	// Company c1 = Company.getInstance();
	
	public static Company getInstance(){
		if(instance == null){
			instance = new Company();
		}
		return instance;
	}
}
