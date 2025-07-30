package Test;
// 다중 반복문을 이용해 높이가 4인 삼각형 모양 *로 출력
public class Test06_5 {
	public static void main(String[] args) {
		
//		높이 선언
		int high = 4;
//		행 선언
		for(int i = 0; i < high; i++ ) {
//			열 선언; 공백 갯수
			for(int j = 1; j < high - i; j++) {
				System.out.print(" ");
			}
//			별 갯수 선언
			for(int k = 0; k < i + 1; k++) {
				System.out.print(" *");				
			}
			System.out.println();
		}
	}
}
