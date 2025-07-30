package Test;
// while문을 이용하여 두 주사위가 같은 값이 나올때까지 반복, 반복횟수 & 주사위 눈 번호 출력
public class Test06_4 {
	public static void main(String[] args) {
		
//		주사위 2개 선언		
		int dice1,dice2;		
		int count = 0;
		
	while(true) {
		dice1 = (int)(Math.random()*6)+1;
		dice2 = (int)(Math.random()*6)+1;
		System.out.println("주사위 1의 값 : " + dice1 + "\n주사위 2의 값 : "
		+ dice2 + "\n반복한 횟수 : " + (++count));
		if(dice1 == dice2) {
		break;
		}		
	}	
	}
}
