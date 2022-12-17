package ch12_collection_1024.linkedlist;

import ch12_collection_1024.Member;

public class MemberLinkedListTest {

	public static void main(String[] args) {

		MemberLinkecList memberArrayList = new MemberLinkecList();
		
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		
		memberArrayList.showAllMember();
	}

}
