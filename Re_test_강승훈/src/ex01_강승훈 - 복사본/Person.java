package ex01_강승훈;
//1. 다음 Person 클래스와 Main 클래스를 완성하기
//두 명의 Person 객체가 이름(name)과 나이(age)가 같으면 같은 사람으로 간주되어야 한다.
//equals()와 hashCode()를 오버라이딩해서 Set에서 중복이 제거되도록 해야한다.

import java.util.Objects;

public class Person {
	
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.name == obj) return true;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
//	Arraylist al = new Arraylist();
	
//	Person person1 = new Person("NULL",0);
//	Person person2 = new Person("A",21);
}
