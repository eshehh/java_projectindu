package ch14_exception_1025;

public class ArrayExceptionHandling {

	public static void main(String[] args) {

		int[] arr = new int[5];
		
		try{ //예외가 발생할 수 있는 부분 
			for(int i = 0; i<=5; i++){
				arr[i] = i;
				System.out.println(arr[i]);
			} // 처리할 예외 타입 e : 상위 개념으로 설정 하면 : 처리하는 예외가 많아지고.
			// 특정 예외로 하위 개념으로 설정하면, 예외 처리하는 범위가 줄어
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			e.printStackTrace();
			System.out.println("예외 처리 부분");
		}
		System.out.println("프로그램 종료");
	}
}
