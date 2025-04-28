package jp.co.aforce.pratice;

public class PracticeTest2 {
	
	public static final double TAX = 0.10;
	
	public static void main(String[] args) {
		System.out.println(TAX);
		
		int x = 480;
		double price = x * TAX;
		
		System.out.println(price);
		
		String name = "Amazawa";
		System.out.println(name);
		
		String this_stuff = "この商品の値段は";
		String stuff1 = "円です";
		
		System.out.println(this_stuff + price + stuff1); 
	}
}
