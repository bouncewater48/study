package study1;

import java.util.Random;
import java.util.Scanner;

// p 143
public class S7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// 1.반복문은  _____한 동작을 여러번 반복하여 실행하는 구문입니다.
//	          동일
	
// 2. 반복문의 종류를 모두 나열해보세요
//	for문, 다중for문, while문, do-while문
	
// 3. 1부터 100까지의 정수중에서 짝수만을 더하는 출력 코드를 for문을 사용하여 작성
//	총합 변수 선언
	int sum = 0;
//	
	for(int i1 = 1; i1 <= 100; i1++) {
		if(i1 % 2 != 0) {
			continue;
		}
		sum += i1;
	}System.out.println(sum);

	System.out.print("==============================\n");
	
// 두 개의 주사위가 같은 값이 나올 때까지 while문을 사용해 반복하고, 반복 횟수와 주사위 눈의 번호를 출력해보세요
	int dice1 = 0;
	int dice2 = 0;
	int count = 0;
	Random random = new Random();
	
	while(true) {
		dice1 = (int)(Math.random()*6)+1;
		dice2 = (int)(Math.random()*6)+1;
		System.out.println("주사위 1의 눈 : " + dice1 + "\n주사위 2의 눈 : " + dice2 + "\n반복횟수 : " + count++);
		if(dice1 == dice2) {
			break;
		}
	}

	System.out.print("==============================");
// 5번: 다중 반복문을 사용해 다음과 같은 모양의 *를 출력하는 코드를 작성해보세요
//	     *
//      * *
//     * * *
//    * * * *
     int row = 6;
     for(int i = 0; i < row; i++) {
    	 for(int j = 0; j < row - i; j++) {
    		 System.out.print(" ");
    	 }
    	 for(int j = 0; j < i - 1;j++) {
    		 System.out.print(" *");
    	 }
    	 System.out.println();
     }
     
     System.out.print("==============================");
     
// 6번 : 다중 반복문을 사용해 다음과 같은 모양의 *를 출력하는 코드를 작성해보세요     
//	     *
//     * * *
//   * * * * *
// * * * * * * *
     
     int row2 = 5;
     for(int i2 = 0; i2 < row2; i2++) {
    	 for(int j2 = 0; j2 < row2 - i2; j2++) {
    		 System.out.print("  ");
    	 }
    	 for(int j2 = 0; j2 < (2 * i2 - 1); j2++) {
    		 System.out.print(" *");
    	 }
    	 System.out.println();
     }
	}
}