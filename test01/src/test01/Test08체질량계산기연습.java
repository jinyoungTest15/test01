package test01;

public class Test08체질량계산기연습 {
	public static void main(String[] args) {
		//체질량지수(BMI)는 다음과 같이 계산합니다.
		// BMI= 체중(kg) / 키(m*m)
		// 키가 `177`cm, 체중이 `87`kg인 사람의 **BMI 지수**를 구하여 출력하세요
		
		int height = 177;
		int weight = 87;
		
		float heightM = 177 / 100f;
		System.out.println(heightM);
		
		float bmi = weight / (heightM * heightM);
		System.out.println(bmi);
	}
}
