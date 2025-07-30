package study1;
//p139 1 ~ 100 사이 짝수 구하기
public class S5 {
	public static void main(String[] args) {
		
//		변수 선언
		int sum = 0;
//		for반복문 선언, i는 1 ~ 100 사이이고 1씩 증가
		for(int i = 1; i <= 100; i++) {
//			i를 2로 나눴을때 몫이 0이 아니라면(=짝수가 아니라면)
			if(i % 2 != 0) {
//				다시 for문으로 return
				continue;
			}
//			i가 2로 나눴을때 몫이 1이라면, 그만큼을 더한다
			sum += i;
		}
		System.out.println("짝수의 합 : " + sum);
	}
}
