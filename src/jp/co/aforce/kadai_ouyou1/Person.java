package jp.co.aforce.kadai_ouyou1;

public class Person {
	private String name;
	private int age;
	private String addres;

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

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}
	
	
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("大谷");
		System.out.println(person.name);
	}
	

}
