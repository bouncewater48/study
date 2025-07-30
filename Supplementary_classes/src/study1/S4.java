package study1;
// p137 1부터 10까지의 합 출력
public class S4 {
	public static void main(String[] args) {
//		변수 선언
		int i = 0;
		int sum = 0;
		
//		조건을 안보고 처음은 반드시 반복문으로 반환하겠다
		do {
			sum += i;
			i++;
		}while(i <= 10);
		System.out.println("총합 : " + sum);
		
		
	}
}
