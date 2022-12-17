package ch15_stream.outputstream_1025;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("output2.txt")){
			fos.write(65);  //A
			fos.write(66);  //B
			fos.write(67);  //C
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력완료.");
	}
}
