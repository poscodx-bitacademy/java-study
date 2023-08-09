package chapter03;

import mypackage.Goods2;

public class DiscountGoods2 extends Goods2 {
	private float discountRate = 0.5f;
	
	public int getDiscountPrice() {
		// protected는 자식에서 접근 할 수 있다.
		int discountPrice = (int)(discountRate * price);
		return discountPrice;
	}
}
