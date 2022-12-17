package ch13_lambda_1025;

public class StringConCatImpl implements StringConcat{

	@Override
	public void makeString(String s1, String s2) {
		System.out.println( "일반 메서드를 호출 : "+ s1 + "," + s2 );
	}
}
