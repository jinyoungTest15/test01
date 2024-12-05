package test01;

public class Test07성적계산기 {
	public static void main(String[] args) {
		//어떤 학생의 중간고사 성적이 다음과 같을 때 이 학생의 총 점수와 과목별 평균을 구하여 출력하세요.
		//국어 - 75점
		//영어 - 90점
		//수학 - 65점

		int k = 75;
		int e = 90;
		int m = 65;
		
		int total = k + e + m;
		System.out.println(total);
		
		float score = total / 3;
		System.out.println(score);
		
	}
}
