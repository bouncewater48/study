package memo;

public class memo {

	/*
	 * 07/11 보충수업 내용 & 과제
- Object클래스
- 예외처리
- 컬렉션 프레임워크

1. Object 클래스
최상위 부모클래스

toString()	객체 정보를 문자열로 반환
		(오버라이딩 하지 않으면 참조값이 나오는 이유)
equals(Object obj)	객체 동등 비교(주소 ->내용 비교로 오버라이딩)
hashCode()		객체의 해시값 반환(Map, Set 에서 특히 중요!!)

Person p1 = new Person("짱구", 5);
syso(p1);	//패키지명.클래스명@16진수로 변환된(해쉬코드)
syso(p1.toString());	//Person [userName = 짱구, userAge = 5]	
syso(p1);

	2. 컬렉션 프레임워크
1) List 순서o, 중복 o
ArrayList, LinkedList

List<T> list = new ArrayList<>();

- 메소드
추가 add(E e)
add(int idx, E e)
값 반환 get(int idx)
수정 set(int idx, E e)
삭제 remove(Object o)
remove(int idx)
포함여부확인 contains(Object o)
요소 개수반환 size()
처음 나타나는 위치 인덱스 반환 indexOf(Object o)
전체 삭제 clear()
비어있는지 확인 isEmpty()

2) Set 순서x, 중복x
HashSet, TreeSet

추가 add(E e) 중복 무시
삭제 remove(Object o)
포함여부확인 contains(Object o)
크기 반환 size()
전체 삭제 clear()
비어있는지 확인 isEmpty()
반복자 반환 iterator()

3) Map 키-값 쌍 저장
Key -> Value 형태로 데이터 저장
키는 중복 불가, 값은 중복 가능
HashMap, TreeMap, LinkedHashMap 등

- Map 메소드
키-값 추가 또는 수정 put(K key, V value)
키로 값 조회 get(Object key)
키로 항목 삭제 remove(Object key)
키존재여부확인 containsKey(Object key)
값존재여부확인 containsValue(Object value)
모든 키 반환 keySet()
모든 값 반환 values()
키-값 쌍 전체 반환 entrySet()
전체삭제 clear()
비어있는지 확인 isEmpty()

3. 예외처리(Exception Handling)
프로그램 실행 중 발생할 수 있는 예외를 안정적으로 처리하기 위한 기능
예외가 발생했을때 프로그램이 강제종료되지 않고 정상적으로 종료될 수 있도록 하는 것

- 예외 처리 흐름
try{
예외 발생 가능성 있는 코드
} catch (예외클래스명 참조변수){
getMessage(); // 예외에 설정된 메세지만 반환
toString(); // 예외클래스명: 메시지
printStackTrace(); //예외가 발생한 위치를 출력(디버깅용으로 가장 많이 사용함)
}

Q1. 사번(String)을 키로, Person 객체를 값으로 저장
이미 존재하는 사번이면 DuplicateKeyException발생
이름이 null이거나 나이가 0살이하이면 InvalidPersonException 발생
예외 발생시 어떤 예외가 발생했는지 메시지 출력과 등록된 전체 목록 같이 출력

Q2. ArrayList<String>에 요소 10개를 추가하고 전체 요소를 순서대로 출력하기

Q3. 이름을 key, 점수를 value로 갖는 Map<String, Integer>를 만들고, 점수가 60점 미만인 학생만 필터링하여 출력하는 코드를 작성하기

Q4. 나이가 0 이하일 경우 예외를 발생시키는 checkAge(int age) 메서드를 작성하고, throws와 try-catch를 사용하여 처리하는 코드를 완성하기

Q5. Person 클래스를 상속하는 Employee 클래스를 만들고,
equals()에서 instanceof를 이용하여 두 객체가 이름과 나이가 같으면 같은 객체로 판단할 것,
Set<Person>에 Employee와 Person 객체를 넣어 비교 테스트 확인하기

Q6. 이름 중복 여부는 허용하되, 나이까지 같으면 중복으로 간주하는 정책으로 Person 객체를 HashMap<String, Set<Person>>에 저장하기
단, 예외 발생 없이 잘 동작하도록 설계할 것

Q7. 등록된 Person 객체들을 점수별로 그룹화하여 Map<Integer, List<Person>> 구조로 구성하고
점수는 외부에서 입력받되, 숫자가 아닐 경우 예외를 발생시켜 처리한다.
단, 출력은 점수 기준 오름차순 정렬로 할 것
	 */
	
	<href="https://us06web.zoom.us/rec/share/RvTisH6i570cHIKKXPFesZL3fUB5fq-5NfV5cNzKocyMeqi563X3OYEifWGQxX-q.LkaaFYa_VUrsPFKQ"target="_blank">구글</a> 
//		암호: L72Z0*rc
//	하이퍼링크는 ctrl + 좌클릭으로 열기!
	
	
}
