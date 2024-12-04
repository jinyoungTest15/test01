package test01;

public class Test02영화요금계산기연습 {
	public static void main(String[] args) {
		
		int adultPrice = 12000;
		int teenPrice = 9000;
		int kidPrice = 7000;
		
		int adultCount = 3;
		int teenCount = 2;
		int kidCount = 3;
		
		int adultTotal = adultPrice * adultCount;
		int teenTotal = teenPrice * teenCount;
		int kidTotal = kidPrice * kidCount;
		
		int total = adultTotal + teenTotal + kidTotal;
		
		System.out.println(total);
		
	}
}
