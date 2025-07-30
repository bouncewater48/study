package practice;
// 배열의 초기값
public class Pr6_3 {
	public static void main(String[] args) {
		
//		[]위치는 배열변수앞이든 뒤이든 똑같은 값만 나옴! 
//		int intArray[] = new int[5]; //[I@6e2c634b
//		int[] intArray = new int[5]; //[I@6e2c634b
//		System.out.println(intArray);
		
		int[] intArray = new int[5];
		String[] strArray = new String[5];
		int[] varArray = {1, 2, 3, 4, 5};
		
		System.out.println("intArray[0] = " + intArray[0]); //intArray[0] = 0
		System.out.println("intArray[1] = " + intArray[1]); //intArray[1] = 0
		
		System.out.println("strArray[0] = " + strArray[0]); //strArray[0] = null
		System.out.println("strArray[2] = " + strArray[1]); //strArray[2] = null
		
		System.out.println("varArray[0] = " + varArray[0]); //varArray[0] = 1
		System.out.println("varArray[1] = " + varArray[1]); //varArray[1] = 2
		System.out.println("varArray[2] = " + varArray[2]); //varArray[2] = 3
		System.out.println("varArray[3] = " + varArray[3]); //varArray[3] = 4
	}
}
