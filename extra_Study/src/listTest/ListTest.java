package listTest;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		
		//리스트 생성
		List<String> fruits = new ArrayList<>();
		
		//요소추가 add(e)
		fruits.add("사과");
		fruits.add("체리");
		fruits.add("망고");
		fruits.add("망고");
		System.out.println(fruits.toString());
		
		//중간에 요소 추가 add(idx, e)
		fruits.add(1, "파인애플");
		System.out.println(fruits);

		//포함여부확인 contains
		System.out.println("체리가 포함되어있는가? " + fruits.contains("체리"));
		
		//요소 수정 set / 삭제 remove
		fruits.set(0, "수박");
		System.out.println(fruits);
		
		fruits.remove(1);
		System.out.println(fruits);
		
		//리스트 전체 삭제 clear
		fruits.clear();
		System.out.println(fruits);
	}
}