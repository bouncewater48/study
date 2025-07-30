package practice;

import java.util.Arrays;

//	Arrays.sort()를 이용한 배열의 오름차순
public class Pr6_8 {
	public static void main(String[] args) {
		
		int[] arr = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};		
//		정렬전 배열
		System.out.println("정렬 전 배열 : " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("오름차순 정렬 : " + Arrays.toString(arr));
	}
}
