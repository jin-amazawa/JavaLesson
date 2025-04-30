package jp.co.aforce.kadai_ouyou2;

public class Circle implements MathConstants {
	
	private static int radius;
	
	public Circle(int radius) {
		Circle.radius = radius;
	}
	
	void calculateArea() {
		double radius = Circle.radius;
		double menseki = PI * radius * radius;
		System.out.println(menseki);
	}
}
