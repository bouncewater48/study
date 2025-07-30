package study1;
// p131 for문 1 ~ 100 숫자 중 짝수의 합 구하기
public class S1_2 {
	public static void main(String[] args) {
//		변수 선언
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("짝수의 합 : " + sum);
	}
}
