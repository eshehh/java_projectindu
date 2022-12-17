package ch15_stream.outputstream_1025;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) {
		 
		try(FileOutputStream fos = new FileOutputStream("output3.txt"))
		{
		
			byte[] bs = new byte[26];
			byte data = 65;     //'A' �� �ƽ�Ű ��
			for(int i = 0; i < bs.length; i++){  // A-Z ���� �迭�� �ֱ�
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10);   // �迭�� 2 ��° ��ġ���� 10 �� ����Ʈ ����ϱ�
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}
}
