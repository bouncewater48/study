package ObjectTest;
/*
public class Person {
	//필드
	String name;
	int age;

	//생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	//Object클래스 메소드 오버라이딩
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Person person = (Person)obj;
		return age == person.age && name.equals(person.name);
	}

*/
//	@Override
//	public boolean equals(Objpackage ObjectTest;

import java.util.Objects;

public class Person {
	// 필드
	String name;
	int age;

	// 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// Object클래스 메소드 오버라이딩
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + "]";
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Person person = (Person) obj;
		return age == person.age && name.equals(person.name);
	}

//	@Override
//	public boolean equals(Object obj) {
//		if(this == obj) {
//			return true;
//		}
//		
//		if(!(obj instanceof Person)) {
//			return false;
//		}
//		Person person = (Person)obj;
//		return name.equals(person.name) && this.age == person.age;
//	}

	@Override
	public int hashCode() {
//		return 31 * name.hashCode() + age;
		// 전통적인 31기반 해시계산
		return Objects.hash(name, age);
		//
	}
	{
//}ect obj) {
//		if(this == obj) {
//			return true;
//		}
//		
//		if(!(obj instanceof Person)) {
//			return false;
//		}
//		Person person = (Person)obj;
//		return name.equals(person.name) && this.age == person.age;
//	}
	
	
	}
}