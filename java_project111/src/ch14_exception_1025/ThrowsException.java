package ch14_exception_1025;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	// class 예약이 클래스를 의미하는 것.
	// Class : 실제 클래스, 해당 loadClass의 리턴 값의 형
	public Class loadClass(String fileName, String className) throws  ClassNotFoundException, FileNotFoundException{
		FileInputStream fis = new FileInputStream(fileName); //FileNotFoundException �߻�
		Class c = Class.forName(className);  //ClassNotFoundException �߻�
		return c;
	}

	public static void main(String[] args) {

		ThrowsException test = new ThrowsException();
		
		try {
			test.loadClass("a2.txt", "java.lang.String");
		
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}