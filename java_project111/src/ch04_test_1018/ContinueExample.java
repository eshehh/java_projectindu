package ch04_test_1018;

public class ContinueExample {
	public static void main(String[] args) {

		int total =0;
		int num;
		
		for(num =0; num<=10; num++){
			
			if( num%2 == 0) 
				continue;
			total += num;
			
		}
		
		System.out.println("1부터 10까지의 홀수의 합은 :" + total + "입니다.");
	}
}
