package ch07_array_1019;

public class Book {

	private String bookName;
	private String author;
	private int price;
	
	public Book(){}
	
	
	
	public Book(String bookName, String author, int price) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public Book(String bookName, String author){
		this.bookName = bookName;
		this.author = author;
	}
	
	
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void showBookInfo(){
		System.out.println(bookName + "," + author + ","+ price);
	}
}
