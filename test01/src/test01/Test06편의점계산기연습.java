package test01; //행사의 반복되는 부분을 찾은후 무료,유료인경우 구한 후 가격(연습더 필요)

public class Test06편의점계산기연습 {
	public static void main(String[] args) {
		//샌드위치가 2000원입니다.
		//현재 2+1 행사중이기 때문에 3개를 구매하면 1개가 무료 처리됩니다.
		//삼각김밥 판매금액을 계산하는 무인 키오스크 구현
		
		//샌드위치 유료 무료
		//1		1		0
		//2		2		0
		//3		2		1
		//4		3		1
		//5		4		1
		//6		4		2
		//7		5		2
		//8		6		2		
		//9		6		3
		
		int sw = 2000;//가격
		int count = 5;//갯수
		int event = 2+1;//행사
		
		int free = count / event;//무료
		int pay = count - free;//유료
		
		System.out.println(free);
		System.out.println(pay);
		
		int total = pay * sw;
		
		System.out.println(total);
		
	}

}
