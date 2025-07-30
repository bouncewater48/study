package study1;
// p130 5-1 예제
// for문 1 ~ 10까지의 합 출력
public class S1_1 {
	public static void main(String[] args) {
//		합 출력할 변수
		int sum = 0;
//		1 ~ 10		
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
//		System.out.println();
		System.out.println(sum);
		
	}
}
