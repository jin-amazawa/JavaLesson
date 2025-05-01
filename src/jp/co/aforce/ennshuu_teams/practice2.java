package jp.co.aforce.ennshuu_teams;

public class practice2 {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		practice2 a = new practice2();
		a.setName("アマザワ");
		
		String b = a.getName();
		System.out.println(b);
		
		a.setAge(32);
		int c = a.getAge();
		System.out.println("８年後の年齢は" + c + "歳です");
		
	}
}
