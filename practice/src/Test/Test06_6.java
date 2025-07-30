package Test;
// 다중반복문을 사용하여 *이 2개씩 늘어나는 삼각형 출력
public class Test06_6 {
	public static void main(String[] args) {
		
		int high = 5;
		
		for(int i = 0; i < high; i++) {
			for(int j = 0; j < high - i; j++) {
				System.out.print("   ");
			}
			for(int k = 0; k < (2 * i -1); k++) {
			System.out.print(" * ");	
			}
			System.out.println();
		}	
	}
}
