package ch15_stream.inputstream_1025;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		//FileInputStream 의 부모 InputStream
		//InputStream는 implements Closeable
		// Closeable 는 상속을 extends AutoCloseable 
		// 그래서, try with resource 구문에서 매개변수에 , 해당 클래스가 
		// AutoCloseable 구현했는지.?
		//FileInputStream(클래스) -> InputStream (클래스)-> Closeable (인터페이스) -> AutoCloseable (인터페이스)
		try(FileInputStream fis = new FileInputStream("input.txt")){ 
			int i;
			while ( (i = fis.read()) != -1){ //-1 해당 읽은 파일 내용이 없으면 반환. -1이 아니다, 그러면 내용이 있다는 이야기. 파일 내용이 있는동안 계속 읽어서, 출력 하겠다는 의미
				System.out.println((char)i);
			}
			System.out.println("end");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
