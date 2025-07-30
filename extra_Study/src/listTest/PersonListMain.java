package listTest;

import java.util.ArrayList;
import java.util.List;

public class PersonListMain {
	public static void main(String[] args) {
		
		//Person타입의 객체를 담아줄 리스트 생성
		List<Person> people = new ArrayList<>();
		
		System.out.println(people);
		//Person클래스 객체
		Person p1 = new Person("짱구", 5);
		System.out.println(p1);
		
		people.add(p1);
		System.out.println(people);
		people.add(new Person("짱구", 5));
		System.out.println(people);
		people.add(new Person("철수", 5));
		System.out.println(people);
		
		System.out.println("현재 people의 목록 출력");
		for(Person p : people) {
			System.out.println(p);
		}
		
	}
}