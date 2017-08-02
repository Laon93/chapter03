package chapter03;


//class에 final을 붙이면 변수처럼 class에 대한 정의가 여기서 끝이다 라는 뜻
//즉, 상속도 불가능! 확장도 불가능! 그냥 여기서 쓰는게 끝!!
//method에 final을 붙이면 override가 불가능하다!!
public class Goods {
	//private으로 하면 getter필요함
	//static은 static끼리! 그러니까 countOfGoods에 접근하려면 static!으로!!
	//사실은 같은 클래스내라 생략이 가능하지만, 다른 곳에서 
	//Goods.coutOfGoods; 처럼 접근을 하고싶은거니까 static 붙이는 것을 추천!
	private static int countOfGoods;
	
	//final을 붙이면 다른 곳에서 해당 변수의 값을 변경할 수 없다는 뜻
	//그렇기 때문에 변수랑 구분하기 위해서 대문자로 써주는 것이 관례!!
	public static final double DISCOUNT_RATE = 0.3;
	
	//테스트용으로 public
	//public static int countOfGoods;
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	//기본 생성자 --> 파라미터 없는 애
	public Goods()
	{
		//원래 아래처럼 쓰는 것이 정석이나, 같은 클래스내에서는 생략이 가능하다.
		//그렇기 때문에 둘중에 하나 선택해서 사용하면된다.
		//Goods.countOfGoods++;
		countOfGoods++;
	}
	
	public static int getCountOfGoods() {
		return countOfGoods;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	

}
