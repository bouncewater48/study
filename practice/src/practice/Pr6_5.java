package practice;
// 배열에서 단어만 추출하여 출력하기
public class Pr6_5 {
	public static void main(String[] args) {
		
		char[] cards = {'1', 'L', 'O', '2', 'V', '3', 'E'};
		String myWord = "";
		
		for(int i = 0; i < cards.length; i++) {
			int word = cards[i];
			if((word >= 65 && word <= 90) || (word >= 97 && word <= 122)){
				myWord += (char)word;
			}
		}
		System.out.println("단어 : " + myWord);		
	}
}
