package ch15_stream.inputstream_1025;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest6 {

	public static void main(String[] args) throws IOException {
				
		try (FileOutputStream fos = new FileOutputStream("resource.txt");
				FileInputStream fis = new FileInputStream("resource.txt")){   //try �����ȿ��� ����� ��� �ڵ� close() ȣ��
			
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}