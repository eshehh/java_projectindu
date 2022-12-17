package ch07_array_1019;

public class BookArray2 {

	public static void main(String[] args) {
		// 추가 사항 , Book 클래스에 매개변수가 3개인 생성자를 만들기.
		// 해당 매개변수 요소는 책이름, 작가, 가격 추가하기.
		// library2 참조형 변수 배열 만들기 , 크기는 3개만 만들기.
		// 출력은 기존 showBookInfo() 를 활용함
		
		
		// Book  클래스 형을 배열을 선언했음. 갯수가 5개짜리.
		// 해당 구성 요소가, Book 형의 객체라는 것 알아야 함.
		Book[] library = new Book[5];
		Student[] students = new Student[5];
		Book[] library2 = new Book[3];
		library2[0] = new Book("태백산맥", "조정래", 10000);
		library2[1] = new Book("데미안", "헤르만 헤세", 20000);
		library2[2] = new Book("어떻게 살 것인가", "유시민", 15000);
		
		students[0] = new Student("이상용1",20000);
		students[1] = new Student("이상용2",20000);
		students[2] = new Student("이상용3",20000);
		students[3] = new Student("이상용4",20000);
		students[4] = new Student("이상용5",20000);
		
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생텍쥐페리");
		
		for(int i=0; i<students.length; i++){
			students[i].showInfo();
		}
		
		for(int i=0; i<library2.length; i++){
			library2[i].showBookInfo();
		}
		
		for(int i=0; i<library.length; i++){
			System.out.println(library[i]);
			
		
	}
	}
}
