package ch10_bookshelf_1021;

public interface Queue {
// 인터페이스 가 뭔가요? 메서드 명세표(목차)
	void enQueue(String title);
	String deQueue();
	int getSize();
}
