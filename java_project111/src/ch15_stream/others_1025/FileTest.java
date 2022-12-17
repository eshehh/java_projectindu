package ch15_stream.others_1025;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {

//		C:\JAVA_workspace2\exercise : 절대경로
		// . 점은 현재위치, ./ : 현재 폴더를 기준으로 하위.
		// .. 부모 폴더 : 상대경로
//		File file = new File("C:\\Temp\\newFile.txt");
		File file = new File("C:\\JAVA_workspace2\\exercise\\newFile.txt");
		file.createNewFile();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		//file.delete();
		
		
		
		
		
		
		
		
		
		
	}
}
