package ch12_collection_1024.hashset;

import ch12_collection_1024.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember();
		
		Member memberHong = new Member(1003, "ȫ�浿");  //1003 ���̵� �ߺ� 
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
	}
}
