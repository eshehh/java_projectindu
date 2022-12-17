package pattern7_Adapter_Ex2.iterenum;

import java.util.*;

public class IteratorEnumeration implements Enumeration<Object> {
	Iterator<?> iterator;
 
	public IteratorEnumeration(Iterator<?> iterator) {
		this.iterator = iterator;
	}
 
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}
 
	public Object nextElement() {
		return iterator.next();
	}
}
