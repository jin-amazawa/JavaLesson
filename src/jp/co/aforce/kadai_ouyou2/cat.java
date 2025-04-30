package jp.co.aforce.kadai_ouyou2;

public class cat extends Animal{
	
	@Override
	void makeSound() {
		System.out.println("にゃんにゃん");
	}
	
	public static void main(String[] args) {
		Animal cat = new cat();
		cat.makeSound();
	}
	
}
