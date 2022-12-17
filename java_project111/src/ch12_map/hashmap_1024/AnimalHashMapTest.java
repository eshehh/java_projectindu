package ch12_map.hashmap_1024;

import ch12_collection_1024.Animal;

public class AnimalHashMapTest {

	public static void main(String[] args) {

		// 추가.
		// 멤버 클래스를 참고해서, Animal 만들기.
		// 멤버 클래스에 있는 인터페이스 및 메서드를 참고해서
		// 출력시 내림 차순으로 출력하게끔.
		// Animal 클래스 객체 4개 임의 만들기. 예) 고양이, 강아지, 호랑이, 원숭이 등..
		// 컬렉션은 MemverHashMap(클래스) 이용하기
		
		AnimalHashMap animalHashMap = new AnimalHashMap();
		
		
		Animal animal1 = new Animal(1001,"고양이");
		Animal animal2 = new Animal(1002, "강아지");
		Animal animal3 = new Animal(1003, "호랑이");
		Animal animal4 = new Animal(1004, "원숭이");
		
		animalHashMap.addAnimal(animal1);
		animalHashMap.addAnimal(animal2);
		animalHashMap.addAnimal(animal3);
		animalHashMap.addAnimal(animal4);
		
		animalHashMap.showAllAnimal();
		
		animalHashMap.removeAnimal(1004);
		animalHashMap.showAllAnimal();
	}
}
