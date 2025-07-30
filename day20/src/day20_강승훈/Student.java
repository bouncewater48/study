package day20_강승훈;

import java.util.ArrayList;
import java.util.List;
//1. 학생 성적 관리 프로그램(ArrayList 이용)
//사용자 입력을 받아 이름과 점수를 저장
//클래스명 : Student (toString 오버라이딩, equals 오버라이딩)
//   모든 필드 : private 접근제한자 사용
//   이름
//   수학점수
//   영어점수
//   국어점수
//
//   생성자 : 이름과 나이만 받는 생성자, 기본생성자 x, getter setter 없어도 ㄱㅊ
//   메소드 : 정수의 합을 구하고 반환하는 메소드(total)
//      평균점수 구하는 메소드(pringAvg)
//      학생의 점수를 저장하여 반환하는 메소드(addScore)

public class Student {

	private String name;
	private int Math;
	private int Eng;
	private int Kor;
	
	public Student(String name, int age) {
//		super();
		this.name = name;
//		this.age = age;
	}

	
//    public void addScore(int math, int eng, int kor) {
//        this.Math = math;
//        this.Eng = eng;
//        this.Kor = kor;
//    }
    
    public int total() {
    	return Math + Eng + Kor;
    }

    public void printAvg() {
    	double avg = total() / 3.0;
    	System.out.println(name + "의 평균 점수: " + avg);
    }

    @Override
    public String toString() {
        return "이름: " + name + ", 수학: " + Math + ", 영어: " + Eng + ", 국어: " + Kor + ", 총점: " + total();
    }
    
    ArrayList<Integer> Student = new ArrayList<>();
    
    List<Student>list = new ArrayList<>();
    
    list.add("짱구",50,80,40)
    
    
}
