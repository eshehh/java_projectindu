package ch14_exception_1025;

public class AutoCloseObj implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("리소가 close() 됨");
	}
}
