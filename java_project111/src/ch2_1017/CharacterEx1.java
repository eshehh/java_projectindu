package ch2_1017;

public class CharacterEx1 {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);
		//ch1 변수를 형변환, 명시적 형변환. 
		// 캐스팅 연산자를 갑자기 사용하고 있음. 당황하지 마세요.
		//7장 까지는 가볍게 들어보시고, 복습하면 됩니다. 
		System.out.println((int)ch1);
		System.out.println("=====================");
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println(ch2);
		System.out.println("=====================");
		int i1 = 67;
		System.out.println(i1);
		System.out.println((char)i1);
		System.out.println("=====================");
		char ch3 = '한';
		char ch4 = '\uD55C';
		
		System.out.println(ch3);
		System.out.println(ch4);

	}

}
