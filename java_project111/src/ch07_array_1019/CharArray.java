package ch07_array_1019;

public class CharArray {

	public static void main(String[] args) {

		// 배열 선언
		char[] alpahabets = new char[26];
		char ch = 'A';
		
		
		// 배열 값 설정
		for(int i=0 ; i<5; i++, ch++){
			alpahabets[i] = ch;
		}
		// 배열 값 가져오기
		for(int i=0; i<5; i++){
			System.out.println(alpahabets[i] + "," + (int)alpahabets[i]);
		}
	}
}