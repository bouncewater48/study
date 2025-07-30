package teampl;

public class LoginManager {
//	LoginManager 클래스 설계 < 내가 할 구간
//	(Map에 사용자 저장/조회)
//	사용자 로그인 기능 구현
	
//  id, pw 구현
//	Map string, string
//	키 존재값 확인
//	sysout("ID : " + map.containKey(
/*
 * package map;
import java.util.*;
public class TestHashMapEx1 {

	public static void main(String[] args) {
		Map<String, String> loginMap = new HashMap<>();
		
		loginMap.put("sslee", "1234");
		loginMap.put("ksyou", "1111");
		loginMap.put("kdhong", "4321");
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("ID를 입력하세요 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호를 입력하세요 : ");
			String pw = sc.nextLine();
				
			if(!loginMap.containsKey(id)) {
				System.out.println("입력하신 ID가 존재하지 않습니다.");
			}else{
				if(loginMap.get(id).equals(pw)) {
					System.out.println("아이디와 비밀번호가 일치합니다.");
					return;
				}
				else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}
		}
		
		
	}

}
//	loginMap.put("pw",password명)
	
 */
	
	
//	사용자 기본정보 상속
//	loginMap.put(id명,pw명)
//	loginMap.put(id명,pw명)
//	loginMap.put(id명,pw명)
//	id 확인
//	while(true){
//	입력 선언
//	Scanner sc = new Scanner(System.in);
//	sysout("id : " + loginMap.containsKey("id"));
//	String id = sc.nextLine();
//	pw 확인
//	sysout("pw : " + loginMap.containsValue("pw"));
//	String pw = sc.nextLine();
//	출력문
//	
//	if(!loginMap.containsKey(id)) {
//		System.out.println("Id를 잘못 입력하셨습니다");
//	}else{
//		if(loginMap.get(id).equals(pw)) {
//			System.out.println("로그인 성공");
//			return;
//		}
//		else {
//			System.out.println("pw를 잘못 입력하셨습니다");
//		}
//	}
	
	
	
//	if{ 
//	loginMap.get("id") == true
//	continue;
//	}else{
//	sysout("아이디가 정확하지 않습니다")
//	}break;
//	if{
//	loginMap.get("pw") == true
//	continue;
//	}else{
//	sysout("비밀번호가 정확하지 않습니다")
//	}break;
//	sysout("로그인에 성공했습니다");
//	
//	
//	
//	
/*
	package user;

	// 유저 추상클래스 생성
	public abstract class User {
		
		// 추상 클래스 안에 필드값 선언
		private String name; // 유저이름
		private String userid; // 유저id
		private String password; // 유저pw
		private String phoneNumber; // 유저 폰넘버
		private int userNum; // 유저 넘버
		
		
		// getter 메소드 선언
		public String getName() {
			return name;
		}
		public String getUserid() {
			return userid;
		}
		public String getPassword() {
			return password;
		}
		public String getPhone_number() {
			return phoneNumber;
		}
		public int getUserNum() {
			return userNum;
		}
		
		//생성자
		public User(String name, String userid, String password, String phoneNumber, int userNum) {
			this.name = name;
			this.userid = userid;
			this.password = password;
			this.phoneNumber = phoneNumber;
			this.userNum = userNum;
		}	
		
		// 로그인 추상메서드
		public abstract boolean login(String inputId, String inputPw);

		// 매개변수 유무, return 타입
		
		// 도서 검색 추상메서드
		public abstract boolean bookSerch(String serch);
		
		// 도서 대출 추상메서드
		public abstract void borrowBooks (String bookTitle);

		// 도서 반납 추상메서드
		public abstract void bookReturn (String bookTitle);
		
	}
*/
	
	/*
package user;

import java.util.Map;
//java.util.Map 클래스 가져오기
import member.Member;
//member.Member 클래스 가져오기
public class LoginManager
{
	// 필드
	Map<String, Member> userInfo = new HashMap<>();// ID, Member
	
	//ps = Member 상속해서 user로 넣을것
	//id = 임의값 넣으면 될듯?
	
	
	// 생성자 필드 초기화
	LoginManager _____ = new(LoginManager)
	member.Member ______ = new member.Member 
	
	
	// 메소드
	// 로그인 메소드
	public boolean login(String id, String ps) 
	{
//	id가 존재하지 않을 경우
		if(!userInfo.containsKey(id)) 
		{
			System.out.println("아이디가 없습니다.");
			return false;
		}
		
		else 
		{
			// 여기에 Member 필드에 패스워드 값 추가되면 그다음에 작성
//			if(userInfo.get(id).getPs().equals(ps)) 
//			{
//				System.out.println("로그인 성공하였습니다.");
//				return true;
//			}
			
//			else 
//			{
//			
//			
//				sysout("패스워드가 틀립니다.\n다시 입력해주세요.");
//				return false;
//			}

			return true;
//			
		}
	}
	
	
	// getUser
	public Member getUser(String userId) 
	{
		return userInfo.get(userId);
	}
}
*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
	
}
