package mypackage;

public class Goods2 {
	public String name;   	// 모든 접근이 가능하다(접근 제한이 없다)
	protected int price;  	// 같은 패키지 + *자식 클래스에서 접근이 가능
	int countStock;		  	// 같은 패키지(디폴트)	
	private int countSold;	// 클래스 내부에서만 가능 
	
	public void m() {
		countSold = 50;
	}	
}
