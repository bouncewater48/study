package practice;
// 배열 값에서 짝수의 합 구하기
public class Pr6_4 {
	public static void main(String[] args) {
		
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random()*30)+1;
		}
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				sum1 += numbers[i];
			}else if(numbers[i] % 2 != 0){
				sum2 += numbers[i];
			}
		}
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " ");
		}
		System.out.println();
		System.out.println("짝수들의 합 : " + sum1);
		System.out.println("홀수들의 합 : " + sum2);
//		출력되는 랜덤값 자체는 홀수, 짝수가 다 있으나 결과에서 출력되는 합산은 짝수, 홀수들만의 합이 맞다!!
	}
}
