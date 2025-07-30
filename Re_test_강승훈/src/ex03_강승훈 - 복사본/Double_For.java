package ex03_강승훈;
//3. 아래와 같은 별 피라미드를 출력하는 프로그램 
//이중 반복문(for)문 사용 
//  *
// ***
//*****
public class Double_For {
	public static void main(String[] args) {
		
// 여기에 코드 작성 
//		int row = 3;
		for(int i = 0; i < 3; i++) {
			for(int j = i; j < 3; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (i*2) + 1 ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}
