package chapter03;

import mypackage.Goods2;

public class GoodsApp {

	public static void main(String[] args) {

		/*
		 * Goods camera = new Goods(); camera.name = "nikon"; camera.price = 400000;
		 * camera.countStock = 30; camera.countSold = 50;
		 * 
		 * System.out.println("camera name : " + camera.name);
		 * System.out.println("camera price : " + camera.price);
		 * System.out.println("camera countStock : " + camera.countStock);
		 * System.out.println("camera countSold : " + camera.countSold);
		 */

		/*
		 * Goods camera = new Goods(); camera.setName("nikon"); camera.setPrice(400000);
		 */

		Goods g = new Goods();
		System.out.println(Goods.getCountOfGoods());

		g = new Goods();
		System.out.println(Goods.getCountOfGoods());

		g = new Goods();
		System.out.println(Goods.getCountOfGoods());

	}

}
