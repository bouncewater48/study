package practice;

import java.util.Scanner;

// 숫자맞추기 게임
public class Pr5_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		1~50 랜덤변수 선언
		int magicNumber = (int)(Math.random()* 50) + 1;
//		boolean값 isMatched 선언, false
		boolean isMatched = false;
		
//		0 ~ 10까지의 값을 for문 선언
		for(int i = 0; i < 10; i++) {
			
			System.out.println("숫자를 입력해주세요 : ");
			
//			입력변수 guess 선언
			int guess = sc.nextInt();
			
			if(guess == magicNumber) {
				System.out.println((i + 1) + "번째 시도에 맞췄습니다!");
				
				isMatched = true;
				
				break;
			} else if (guess > magicNumber) {
				System.out.println("정답보다 큰 숫자입니다.\n다시 입력해주세요.\n");
			} else if (guess < magicNumber) {
				System.out.println("정답보다 작은 숫자입니다.\n다시 입력해주세요\n");
			}
		}
		
		if(!isMatched) {
			System.out.println("잘못 입력하셨습니다!");
		}
	}
}
