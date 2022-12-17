package ch12_map.hashmap_1024;

import java.util.HashMap;
import java.util.Iterator;

import ch12_collection_1024.Member;

public class MemberHashMap {
	
	
	// 포함 관계로 선언 , 다른 클래스 형을 첨부 하는 방법은 매우 많이 사용함.
	private HashMap<Integer, Member> hashMap;
	
	// 기본 생성자를 호출 하면서, 다른 클래스형의 컬렉션을 선언한 참조형 변수에 할당하는 작업
	public MemberHashMap()
	{
		hashMap = new HashMap<Integer, Member>();
	}
	// 해당 맵이라는 컬렉션에 추가하고,
	public void addMember(Member member){
		
		hashMap.put(member.getMemberId(), member);
		
	}
	// 해
	public boolean removeMember(int memberId){
		
		if(hashMap.containsKey(memberId)){
			hashMap.remove(memberId);
			return true;
		}
		
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember(){
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()){
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}	
		System.out.println();
	}
}
