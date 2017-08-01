package chapter03;
import mypackage.Goods2;

public class specialGoods extends Goods2 {
	
	void showInfo() {
		//protected는 자식에서 접근 가능 --> package 상관 없음
		name = "nikon";
		
		//default는 같은 패키지 내에서만 접근 가능 
		
		//private를 하면 자기 자신만 사용이 가능
		//동일 패키지 내에서라도 절대 사용 불가
		
		//public 자식이 아니더라도, 같은 패키지가 아니더라도 사용이 가능하다.
		
		
		
	}

}
