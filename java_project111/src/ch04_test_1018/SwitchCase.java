package ch04_test_1018;

public class SwitchCase {
	public static void main(String[] args) {

		int ranking = 4;
		String medal = "Sliver";
		char medalColor;
		
		switch(medal){
		
			case "Gold": medalColor = 'G';
			ranking = 1;
						 break;
				
			case "Sliver": medalColor = 'S';
			ranking = 2;
						   break;
			
			case "Bronze": medalColor = 'B';
			ranking = 3;
						   break;
			default:
				medalColor = 'A';
		}
		
		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + " 입니다.");
	}
}
