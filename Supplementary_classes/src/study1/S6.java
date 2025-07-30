package study1;
import java.util.Scanner;
// p140
// 숫자 맞추기 게임(break문)
// 숫자는 1 ~ 50 사이 랜덤값 선언, random 메소드 사용
// 입력횟수는 임의로 지정
public class S6 {
	public static void main(String[] args) {
//		입력메소드 선언
		Scanner sc = new Scanner(System.in);
		
//		1 ~ 50사이의 랜덤값 선언, random 메소드 선언
//		맨 앞에 (int)를 안붙히면 실수형이라 소숫점까지 출력, 정수형으로 강제형변환
//		Math.random 함수로 Math 클래스에서 랜덤 메소드를 import
//		50까지로 선언하면 0부터 시작이라 0 ~ 49이므로 마지막에 +1로 시작점을 1로 변경
		int num = (int)(Math.random()*50)+1;
		
//		맞출 숫자를 확인하고 틀리다면 false 출력
		boolean Matchnumber = false;
		
//		조건확인이 필요하므로 조건식 사용
//		  입력 가능횟수 = 10회 선언
			for(int i = 0; i < 10; i++) {
//				정답 확인용
				System.out.println("정답 : " + num);
//				사용자가 입력하는 값 입력
				System.out.println("정답 숫자를 입력 : ");
//				guess는 정수를 입력받음
				int guess = sc.nextInt();
//				입력값이 정답과 같다면 true를 출력
				if(guess == num) {
					System.out.println((i + 1)  + "번째에 맞추셨습니다!");
					Matchnumber = true;
//					true라면 break로 멈춤
					break;
//					입력값보다 정답이 작다면
				}else if(guess < num){
					System.out.println("입력하신 숫자가 작습니다");
//					입력값보다 정답이 크다면
			}else if(guess > num) {
				System.out.println("입력하신 숫자가 큽니다");
			}	
		} {
			
		}
//		입력횟수가 시도횟수를 넘어갔을 경우
			if(!Matchnumber) {
				System.out.println("정답을 맞추지 못했습니다");
			}
	}
}
