package listTest;

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
	//toString오버라이딩
	@Override
	public String toString() {
		return name + " ( " + age + "살 ) ";
	}
	//hashCode오버라이딩
	@Override
	public int hashCode() {
		return name.hashCode() + age * 31;
	}
	//equals오버라이딩
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Person)) {
			return false;
		}
		Person person = (Person)obj;
		return this.name.equals(person.name) && this.age == person.age;
		
	}
	
	
	
}