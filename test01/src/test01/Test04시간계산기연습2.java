package test01;

public class Test04시간계산기연습2 {
		public static void main(String[] args) {
			
			int h1 = 2, m1 = 20;
			int h2 = 3, m2 = 55;
			
			int h = (h1 + h2) + (m1 + m2) / 60;
			int m = (m1 + m2) % 60;
			
			System.out.println(h);
			System.out.println(m);
			
		}

}
