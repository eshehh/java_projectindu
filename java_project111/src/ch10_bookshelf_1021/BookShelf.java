package ch10_bookshelf_1021;

public class BookShelf extends Shelf implements Queue{

	
	@Override
	public void enQueue(String title) {
		shelf.add(title);
		
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
