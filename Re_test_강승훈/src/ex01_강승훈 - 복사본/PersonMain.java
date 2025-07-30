package ex01_강승훈;

import java.util.HashSet;
import java.util.Set;

//1. 다음 Person 클래스와 Main 클래스를 완성하기
//두 명의 Person 객체가 이름(name)과 나이(age)가 같으면 같은 사람으로 간주되어야 한다.
//equals()와 hashCode()를 오버라이딩해서 Set에서 중복이 제거되도록 해야한다.
public class PersonMain {
	public static void main(String[] args) {
//	        Set<Person> set = new HashSet<>();
//	        set.add(new Person("짱구,5"));
//	        set.add(new Person("짱구,5"));
		
//	        System.out.println("Set 크기 : " + set.size());  // 결과는 1이 나와야 함

		Set<Person> set = new HashSet<>();

//		Person p1 = new Person("홍길동", 30);
//		Person p2 = new Person("홍길동", 30);
		set.add(new Person("홍길동,30", 30));
		set.add(new Person("홍길동,30", 30));
//		set.add(new Person("홍길동", 12));
//		set.add(new Person("홍길동", 12));
		
		
		
		System.out.println("Set 크기 : " + set.size());
		
		
	}
}
