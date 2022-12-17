package ch12_collection_1024.arraylist;

import ch12_collection_1024.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		// 해당 자기 이름으로, Member 형 선언해서, 
		// 추가도 해보고, 출력, 삭제등 해보기. 
		// 가능하다면 메서드도 하나 만들어서 호출해보기. 

		MemberArrayList memberArrayList = new MemberArrayList();
		//해당 Member 타입으로 생성자 초기화하고, 
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		Member memberHong = new Member(1004, "홍길동");
		Member lsy = new Member(1005, "이상용");
		Member bsh = new Member(1006, "배선한");
		
		// 해당 Member 를 memberArrayList 에 담고. 
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		memberArrayList.addMember(lsy);
		memberArrayList.addMember(bsh);
		
		// memberArrayList 메서드들 확인. 
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(bsh.getMemberId());
		memberArrayList.showAllMember();
	}
}
