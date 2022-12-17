package ch10_bookshelf_1021;

import java.util.ArrayList;

public class Shelf {

	// 상속을 받은 클래스에서 보인다
	
	protected ArrayList<String> shelf;
	
	public Shelf(){
		// 기본 생성자
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount(){
		return shelf.size();
	}
}
