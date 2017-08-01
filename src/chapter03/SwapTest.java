package chapter03;

public class SwapTest {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		
		System.out.println(" i = " + i + " j = " + j);
		swap(i, j);
		System.out.println(" i = " + i + " j = " + j);

	}
	
	public static void swap(int a, int b)
	{
		int temp;
		
		temp = a;
		a = b;
		b = temp;
	}
	
/*	public static void swap2(int a, int b)
	{
		int temp = a.getI();
	}*/

}
