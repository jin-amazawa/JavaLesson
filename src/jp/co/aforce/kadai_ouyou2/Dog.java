package jp.co.aforce.kadai_ouyou2;

public class Dog extends Animal {
	
	@Override
	void makeSound() {
		System.out.println("ワンワン");
	}
	
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.makeSound();
	}
}
