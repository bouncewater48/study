package study1;
// p134 별모양 탑 출력하기
// 
public class S2 {
	public static void main(String[] args) {
		
		int high = 5;
		
//		행
		for(int i = 0; i < high; i++) {
//			열
			for(int j = 0; j < high - i; j++) {
				System.out.print(" ");
//				* 모양이 늘어나는 갯수
				}for(int j = 0; j < (2 * i + 1); j++) {
					System.out.print("*");
				}
		System.out.println();
		}
	
		System.out.println("=======================");
		
		for(int i = high; i >= 1; i--) {
			for(int j = 1; j <= high - i; j++) {
				System.out.print(" ");
			}for(int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
