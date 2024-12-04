package test01;

public class Test03시간계산기연습 {
	public static void main(String[] args) {
		
		int h1 = 2, m1 = 20;
		int h2 = 3, m2 = 55;
		
		int h3 = (h1 * 60) + m1;
		int h4 = (h2 * 60) + m2;
		
		int total = h3 + h4;
		
		int hour = total / 60;
		int minute = total % 60;
		
		System.out.println(hour);
		System.out.println(minute);
		
	}

}
