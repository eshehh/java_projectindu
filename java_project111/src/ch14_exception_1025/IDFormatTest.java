package ch14_exception_1025;

public class IDFormatTest {

	private String userID;
	
	public String getUserID(){
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException{
		
		if(userID == null){
			//임의로 예외를 발생시킴. 
			throw new IDFormatException("아이디는 null 일 수 없습니다");
		}
		else if( userID.length() < 8 || userID.length() > 20){
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요");
		}
		
		this.userID = userID;
	}
	
	public static void main(String[] args) {

		IDFormatTest test = new IDFormatTest();
		String userID = null;
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) { // 사용자가 정의한 
			// 예외 클래스 형으로 실행을 하고 있습니다. 
			// 맨땅에 다 구현 한게 아니라, 부모 클래스의 도움을 받아서
			// 구현 중 입니다.
			System.out.println(e.getMessage());
		}
		
		userID = "1234567";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
