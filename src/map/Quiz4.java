package map;

import java.util.Collection;
import java.util.HashMap;

public class Quiz4 {

	public static void main(String[] args) {
		
		HashMap<Integer, Student> map = new HashMap<>();		
		
		map.put(1001, new Student(1001, "둘리", 90, 80, 70));
		map.put(1002, new Student(1002, "도우너", 55, 65, 75));
		map.put(1003, new Student(1003, "또치", 80, 50, 50));
		
		Collection<Student> values = map.values();
		
		for (Student student : values) {
				
		int total = student.koreanScore + student.mathScore + student.englishScore;
		
		float avg = (student.koreanScore + student.mathScore + student.englishScore) / 3;
		
		System.out.println(student.name +"의 총점 : " + total + " 평균 : " + avg);
		}
		
		int kor = 0;
		int math = 0;
		int eng = 0;
		
		for (Student student : values ) {
			kor = kor + student.koreanScore;
			math= math + student.mathScore;
			eng = eng + student.englishScore;
		}
		System.out.println("국어의 총점은 : " + kor + " 평균은 : " + kor/3f);
		System.out.println("수학의 총점은 : " +  math + " 평균은 : " + math/3f);
		System.out.println("영어의 총점은 : " + eng + " 평균은 : " + eng/3f);
	}

}

class Student {
	
	int studentId;	// 학번
	String name;	// 이름
	int koreanScore;		// 국어 점수
	int mathScore;		// 수학 점수
	int englishScore;		// 영어 점수
	
	public Student(int studentId, String name, int koreanScore, int mathScore, int englishScore) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", koreanScore=" + koreanScore + ", mathScore="
				+ mathScore + ", englishScore=" + englishScore + "]";
	}
	
	
}