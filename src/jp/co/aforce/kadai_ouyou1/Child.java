package jp.co.aforce.kadai_ouyou1;

public class Child extends Parent {
	public static void main(String[] args) {
		Parent my_parents = new Child(); 
		 my_parents.call("私の両親");
	}
}
