package jp.co.aforce.kadai_ouyou2;

public interface Printer {
	void print();
	
	default void showStatus() {
		System.out.println("なんでこのメソッドにしたのだろう");
	}
}
