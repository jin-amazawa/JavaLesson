package jp.co.aforce.kadai_ouyou2;

abstract class Animal {
	abstract void makeSound();
	
	void sleep() {
		System.out.println("この動物は眠っている");
	}
}
