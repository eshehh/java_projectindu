package ch12_collection_1024.arraylist;

import java.util.ArrayList;  // 사용할 클래스 import
import java.util.Iterator;

import ch12_collection_1024.Member;    

public class MemberArrayList {

	private ArrayList<Member> arrayList;  // ArrayList 선언 

	public MemberArrayList(){
		arrayList = new ArrayList<Member>();  //멤버로 선언한 ArrayList 생성
	}
	
	public void addMember(Member member){  //ArrayList 에 멤버 추가
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId){  // 멤버 아이디를 매개변수로, 삭제 여부를 반환
		
		for(int i =0; i<arrayList.size(); i++){ // 해당 아이디를 가진 멤버를 ArrayList에서 찾음
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId){            // 멤버아이디가 매개변수와 일치하면 
				arrayList.remove(i);           // 해당 멤버를 삭제
				return true;                   // true 반환
			}
		}
		
		// Iterator 인터페이스인데, 반복 실행을 위해서 사용을 합니다.
		// 컬렉션, 여러개의 데이터를 담는 그릇인데,
		// 컬렉션에 있는 데이터를 Iterator(반복자)에 담아서, 반복 작업을 합니다.
		// 마치 반복문이랑 작업이 똑같다.
		
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId){            // 멤버아이디가 매개변수와 일치하면 
				arrayList.remove(member);           // 해당 멤버를 삭제
				return true;                   // true 반환
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다");  //for 가 끝날때 까지 return 이 안된경우
		return false;                   
	}
	
	public void showAllMember(){
		for(Member member : arrayList){
			// Object 형의 toString 이 호출 되는 것이 아니고,
			// Member 형에서 재정의된 toString이 호출이 됩니다. 
			// Member  에서 꼭 확인 부탁드립니다.
			System.out.println(member);
		}
		System.out.println();
	}
}
