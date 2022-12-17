package ch03_test_1018;

public class OperationEx2 {
	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore1 = gameScore++;
		System.out.println("lastScore1 : " + lastScore1);
		System.out.println("gameScore : " + gameScore);
		
		int lastScore2 = gameScore--;
		System.out.println("lastScore2 : " + lastScore2);
		System.out.println("gameScore : " + gameScore);
		
		int myAge = 27;
		boolean value = (myAge > 25);
		System.out.println("value : " +value);
		
		long n = 100;
	}
}
