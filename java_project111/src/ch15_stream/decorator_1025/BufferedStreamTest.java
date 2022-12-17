package ch15_stream.decorator_1025;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 자동 임포트를 컴파일러에서 권해줌. 
// 단축키 ctrl + shift + o (영문자 o) 

public class BufferedStreamTest {

	public static void main(String[] args) {

		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("output3.txt"); // 1 입력 순서 기반 스트림을 먼저 읽고,
				FileOutputStream fos = new FileOutputStream("copy_buffer.txt");
				BufferedInputStream bis = new BufferedInputStream(fis); // 2 보조 스트림에 1의 기반 스트림을 담기.(매개변수로 사용.)
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
		
			millisecond = System.currentTimeMillis();
			
			int i;
			while( ( i = bis.read()) != -1){
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일복사하는데 " + millisecond + " milliseconds 밀리세컨드소요됨.");
	}
}
