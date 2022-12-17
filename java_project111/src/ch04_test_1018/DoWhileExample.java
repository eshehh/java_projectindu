package ch04_test_1018;

import java.io.IOException;

public class DoWhileExample {

	public static void main(String[] args)  {

		int num = 1; 
		int sum = 0;
		
		do{
			System.out.println("해당 조건문이 참이면 do 실행문이 계속 수행됩니다.");
			sum += num;
			num++;	
			
		}while( num <= 10  );
		
		System.out.println("1부터 10까지의 합은" + sum + "입니다");
	}
}
