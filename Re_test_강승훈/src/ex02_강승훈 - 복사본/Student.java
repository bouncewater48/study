package ex02_강승훈;
//2. 학생 이름과 점수를 저장하는 프로그램
//[요구사항]
//- 학생 3명의 이름과 점수를 저장
//- 모든 학생의 평균 점수를 계산하여 출력
//- 특정 학생 이름으로 점수를 조회
public class Student {
	
	
	String name;
	int score;
//	int avg = this.score/3;

			
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	Student a = new Student("철수", 80);
	Student b = new Student("짱구", 66);
	Student c = new Student("짱아", 79);
		
	int avg = a.score + b.score + c.score / 3;
	
}
