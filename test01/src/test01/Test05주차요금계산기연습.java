package test01;

public class Test05주차요금계산기연습 {
	public static void main(String[] args) {
		//주차장 이용요금이 1시간당 2500원일 때, 다음 차량의 주차시간과 이용요금을 구하여 출력하세요
		//(단, 정각부터 59분까지는 요금이 같습니다)
		//입차시각 : 11시 25분
		//출차시각 : 17시 50분
		
		int h1 = 11, m1 = 25;//입차시각
		int h2 = 17, m2 = 50;//출차시각
		
		int h3 = h2 - h1;
		int m3 = m2 - m1;
		
		int price = h3 * 60 + m3;//이용시간
		
		int charge = price / 60 * 2500;//요금
		
		System.out.println(price);
		System.out.println(charge);
		
		
		
	}

}
