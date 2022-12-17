package ch15_decorator_1026;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {

		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("output3.txt");
				FileOutputStream fos = new FileOutputStream("copy4.txt")){
		
			millisecond = System.currentTimeMillis();
			
			int i;
			while( ( i = fis.read()) != -1){
				fos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일복사하는데 " + millisecond + " milliseconds 밀리세컨드소요됨.");
	}
}
