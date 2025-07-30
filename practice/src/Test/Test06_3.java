package Test;
// 1 ~ 100 정수 중 짝수만 더하기
public class Test06_3 {
	public static void main(String[] args) {
		
//	int num = (int)(Math.random()*100)+1;	
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum += i;
			}else {
			}
			System.out.println(sum);
//			sum값이 2번 출력되는데 뭐지??
		}
	}
}
