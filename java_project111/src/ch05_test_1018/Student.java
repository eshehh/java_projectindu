package ch05_test_1018;

public class Student {
	int stuNo; // 1번
	String stuName; // 이상용.
	String stuClass; // 402호
	String stuHome; // 부산 강서구.
	
	public Student() {};
	public Student(int stuNo) {};
	public Student(int stuNo, String stuName) {};
	public Student(int stuNo, String stuName,String stuClass) {};
	
	
	
	public Student(int stuNo, String stuName, String stuClass, String stuHome) {
		super();
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuClass = stuClass;
		this.stuHome = stuHome;
	}
	public String getStuClass() {
		return stuClass;
	}

	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}

	public String getStuHome() {
		return stuHome;
	}

	public void setStuHome(String stuHome) {
		this.stuHome = stuHome;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public int getStuNo() {
		return stuNo;
	}
	
	public void studySub(String stuName) {
		System.out.println(stuName + "이 자바 공부중.");
	}
	
	public static void main(String [] args) {
		// 여러분은 직접 본인들의 아이디의 이니셜로 해당 참조형 변수 ( 인스턴스) 만들기. 
		// 해당 값을 설정은 , 번호, 이름 직접 설정하고, 클래스랑, 집은 set 함수를 통해서 만들기. 
		// 해당 값을 출력 할 때, 번호, 이름 직접 출력하고, 클래스랑, 집은 get 함수를 통해서 출력 해보기.  
		Student lsy = new Student();
		lsy.stuNo = 1;  // 직접 값에 접근을 해서 설정.
		lsy.stuName = "이상용";
		lsy.studySub("이상용");
		System.out.println("해당 학생증 번호를 get 메서드를 통해서 접근해서 출력");
		System.out.println(lsy.getStuNo());
		System.out.println("해당 학생증 번호를 직접 접근해서 출력");
		System.out.println(lsy.stuNo);
		
		Student lsy2 = new Student(); // 이상용2 번 학생의 학생 번호를 2번으로 set 메서드를 통해서 지정. 
		lsy2.setStuNo(2);
		System.out.println("해당 학생증 번호를 get 메서드를 통해서 접근해서 출력");
		System.out.println(lsy2.getStuNo());
		lsy2.studySub("이상용2");
		
		// 해당 값을 설정은 , 번호, 이름 직접 설정하고, 클래스랑, 집은 set 함수를 통해서 만들기. 
				// 해당 값을 출력 할 때, 번호, 이름 직접 출력하고, 클래스랑, 집은 get 함수를 통해서 출력 해보기.  
		Student lsy3 = new Student();
		lsy3.stuNo = 3;
		lsy3.stuName = "이상용3";
		lsy3.setStuClass("402 강의장");
		lsy3.setStuHome("부산시 강서구");
		System.out.println("해당 학생증 번호를 직접 접근해서 출력");
		System.out.println(lsy3.stuNo);
		System.out.println("해당 학생증 이름을 직접 접근해서 출력");
		System.out.println(lsy3.stuName);
		
		System.out.println("해당 학생증 클래스를 get 메서드를 통해서 접근해서 출력");
		System.out.println(lsy3.getStuClass());
		System.out.println("해당 학생증의 주소를 get 메서드를 통해서 접근해서 출력");
		System.out.println(lsy3.getStuHome());
		
		lsy3.studySub("이상용3");
		
		System.out.println("===해당 인스턴스 (참조형 변수)를 확인 해보자. 안에 뭐가 들어 있는지.?====================");
		System.out.println("lsy : " + lsy);
		System.out.println("lsy2 : " + lsy2);
		System.out.println("lsy3 : " + lsy3);
		
		Student lsy4 = new Student(4,"이상용4","402호","부산 강서구");
		System.out.println("해당 학생증 번호를 직접 접근해서 출력");
		System.out.println(lsy4.stuNo);
		System.out.println("해당 학생증 이름을 직접 접근해서 출력");
		System.out.println(lsy4.stuName);
		System.out.println("해당 학생증 반 직접 접근해서 출력");
		System.out.println(lsy4.stuClass);
		System.out.println("해당 학생증 주소 직접 접근해서 출력");
		System.out.println(lsy4.stuHome);
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
