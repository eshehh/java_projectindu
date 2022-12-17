package ch15_decorator_1026;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {

		// 보조 스트림 : InputStreamReader
		// 기반 스트림 : new FileInputStream("reader.txt") -> 실제로 해당 파일을 바이트 단위로 읽기.
		// 기반 스트림을 보조 스트림의 매개변수로 사용하는 방법 -> 디자인 패터에서 데코레이터 패턴이라고 합니다. 
		// 실제로 자바 IO에서 데코레이터 패턴이 엄청 많이 사용하고 있습니다. 
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
			int i;
			while( (i = isr.read()) != -1){  //보조 스트림으로 읽음.
				System.out.print((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
