package study1;
//p142 구구단 출력
public class S1_4 {
	public static void main(String[] args) {
		
//		행 선언
		for(int i = 1; i < 10; i++) {
//			열 선언
			for(int j = 2; j < 10; j++) {
				System.out.print(j + " x " + i + " = " + (i * j) + "\t");
//				System.out.print(i + " x " + j + " = " + (i * j) + "\t");
//				뒷 숫자가 1씩 증가하는게 세로, 앞 숫자가 1씩 증가하는게 가로로 출력되려면 행과 열이 서로 바뀌어야함
			}
			System.out.println();
		}
	}
}
