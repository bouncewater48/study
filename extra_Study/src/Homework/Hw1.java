package Homework;

import java.util.Map;
import java.util.Set;

import Homework.DuplicateException;
import Homework.InvalidDataException;
import setTest.Person;

//Q1. 사번(String)을 키로, Person 객체를 값으로 저장
//이미 존재하는 사번이면 DuplicateKeyException발생
//이름이 null이거나 나이가 0살이하이면 InvalidPersonException 발생
//예외 발생시 어떤 예외가 발생했는지 메시지 출력과 등록된 전체 목록 같이 출력

public class Hw1 {
	public static void main(String[] args) {
	}
		public static void registerPerson(String name, int age, Set<Person> set)
				throws InvalidDataException, DuplicateException
			{
				if(name == null || name.trim().isEmpty()) {
					throw new InvalidDataException("이름은 공백일 수 없습니다");
				}
				if(age <= 0) {
					throw new InvalidDataException("나이는 1살이상이어야합니다");
				}
				
			}
		
		

}