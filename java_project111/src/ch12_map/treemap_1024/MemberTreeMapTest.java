package ch12_map.treemap_1024;

import ch12_collection_1024.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap memberHashMap = new MemberTreeMap();
		
		Member memberPark = new Member(1003, "이상용3");
		Member memberLee = new Member(1001, "이상용1");
		Member memberHong = new Member(1004, "이상용4");
		Member memberSon = new Member(1002, "이상용2");
		
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberSon);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}
}
