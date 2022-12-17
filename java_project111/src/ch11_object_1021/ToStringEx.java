package ch11_object_1021;

class Book{ // 암묵적으로 무엇을 상속을 받고 있죠? Object
	
	
	int bookNumber;
	String bookTitle;

	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		
		return "책제목 : " + bookTitle + "," + "책번호 : "  + bookNumber;
	}
	
}

public class ToStringEx {

	public static void main(String[] args) {

	Book book1 = new Book(200, "개미");
	
	System.out.println(book1);
	System.out.println(book1.toString());
	}
}

