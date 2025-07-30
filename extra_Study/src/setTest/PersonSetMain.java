package setTest;

import java.util.HashSet;
import java.util.Set;

public class PersonSetMain {
	public static void main(String[] args) {
		Set<Person> people = new HashSet<>();
		
		Person p1 = new Person("홍길동", 15);
		System.out.println(p1);
		Person p2 = new Person("신짱구", 15);
		System.out.println(p2);
		
		
		people.add(p1);
		people.add(p2);
		System.out.println(people);
		people.add(new Person("홍길동", 15));
		System.out.println(people);
		
		for(Person p : people) {
			System.out.println(p.hashCode());
		}
		
//		System.out.println(p1.hashCode());
//		System.out.println(p2.hashCode());
	}
}