package study1;
import java.util.Scanner;
// p140
//숫자 맞추기 게임(break문)
//숫자는 1 ~ 50 사이 랜덤값 선언, random 메소드 사용
//입력횟수는 임의로 지정
public class S6_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int correctnumber = (int)(Math.random()*50) + 1;
		boolean iscorrect = false;
		
		for(int i = 0; i < 15; i++) {
			System.out.println("숫자 입력 : ");
			int guess = sc.nextInt();
			if(guess == correctnumber) {
			System.out.println((i + 1) + "번째에 맞추셨습니다");
		}else if(guess > correctnumber){
			System.out.println("정답보다 큰 숫자입니다");
		}else if(guess < correctnumber){
			System.out.println("정답보다 작은 숫자입니다");
			break;
		}
		}
		if(!iscorrect) {
			System.out.println("정답을 맞추지 못하셨습니다");
//		}else if(guess > i) {
//			System.out.println("입력횟수 초과입니다.");
		}
	}
}
