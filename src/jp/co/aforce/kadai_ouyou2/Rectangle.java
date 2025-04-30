package jp.co.aforce.kadai_ouyou2;

public class Rectangle extends Shape {
	
	public int tate = 4;
	public int yoko = 5;
	
	void calculateArea() {
		int menseki = tate * yoko;
		System.out.println(menseki);
	}
	
	void calculatePerimeter() {
		int syuuyi = tate * 2 + yoko * 2;
		System.out.println(syuuyi);
	}
}
