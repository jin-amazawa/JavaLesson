package jp.co.aforce.kadai_ouyou2;

public class Bird implements Animal1, Flyable{
	
	@Override
	public void makeSound(){
		System.out.println("ぴよぴよ");
	}
	
	@Override
	public void fly() {
		System.out.println("羽ばたいて飛んでいます");
	}
}
