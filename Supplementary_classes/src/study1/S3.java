package study1;
// p136 1부터 10까지의 합 출력
public class S3 {
	public static void main(String[] args) {
//		변수 선언
		int i = 1;
		int sum = 0;
				
//		i가 10 이하가 될때까지
		while(i <= 10) {
//			i를 매번 더한다
			sum += i;
//			i는 매번 증가한다
			i++;
		}
//		System.out.println(i);
		System.out.println("1부터 10까지의 합 : " + sum);
		
	}
}
