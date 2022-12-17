package ch06_singleton_1019;

public class CompanyTest {

	public static void main(String[] args) {
		Company company1; // 인스턴스 멤버 변수 선언만
		Company company2;
		
		// 인스턴스 멤버 변수 선언 및 할당 같이
		Company company3 = Company.getInstance();
		
		// 선언 후, 나중에 할당한 경우
		company1 = Company.getInstance();
		company2 = Company.getInstance();
		
		System.out.println("company1의 주소값= " + company1);
		System.out.println("company2의 주소값= " + company2);
		System.out.println("company3의 주소값= " + company3);
		
		
//		Company myCompany1 = Company.getInstance();
//		Company myCompany2 = Company.getInstance();
//		System.out.println("myCompany1 의 참조값 주소 : " + myCompany1);
//		System.out.println("myCompany2 의 참조값 주소 : " + myCompany2);
//		System.out.println( myCompany1 == myCompany2 );
//		myCompany1.address = "부산";
//		myCompany1.name = "이상용";
//		myCompany1.age = 39;
//		System.out.println(" myCompany1 address : " + myCompany1.address);
//		System.out.println(" myCompany1 name : " + myCompany1.name);
//		System.out.println(" myCompany1 age : " + myCompany1.age);
//		System.out.println("=========================");
//		System.out.println(" myCompany2 address : " + myCompany2.address);
//		System.out.println(" myCompany2 name : " + myCompany2.name);
//		System.out.println(" myCompany2 age : " + myCompany2.age);
//		System.out.println("=========================");
	}
}
