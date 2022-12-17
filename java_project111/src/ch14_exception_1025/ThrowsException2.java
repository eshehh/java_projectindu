package ch14_exception_1025;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException2 {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName); //FileNotFoundException �߻�
		Class c = Class.forName(className);  //ClassNotFoundException �߻�
		return c;
	}

	public static void main(String[] args) {

		ThrowsException2 test = new ThrowsException2();

		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
