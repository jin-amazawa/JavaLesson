package jp.co.aforce.kadai_ouyou2;

public class Student extends Person {
	
	public Student(String name) {
		super(name);
	}

	@Override
	void introduce() {
		System.out.println("私の名前は" + getName() + "です");
	}
	
}
