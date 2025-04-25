
public class Person1 {
	
	String name;
	int age;
	
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("名前は" + name + "です。年齢は" + age + "歳です。");
	}
	
	public static void main(String[] args) {
		Person1 person1 = new Person1("Jin", 32);
		String name1 = person1.name;
		int age1 = person1.age;
		
		System.out.println(name1);
		System.out.println(age1);
	}
	
	
}
