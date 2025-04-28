package jp.co.aforce.field;

public class Main {
	public static void main(String[] args) {
		Player p1 = new Player();
		Player p2 = new Player();
		
		System.out.println("初期状態");
		System.out.println("p1.hp =" + p1.hp);
		System.out.println("p2.hp =" + p2.hp);
		
		p1.hp -= 30;
		
		System.out.println("/nダメージ後");
		System.out.println("p1.hp =" + p1.hp);
		System.out.println("p2.hp =" + p2.hp);
		
	}
}
