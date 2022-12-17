package ch15_stream.decorator_1025;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {

		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("output2.txt");
				FileOutputStream fos = new FileOutputStream("copy2.txt")){
		
			millisecond = System.currentTimeMillis();
			
			int i;
			while( ( i = fis.read()) != -1){
				fos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("측정 " + millisecond + " milliseconds 소요.");
	}
}
