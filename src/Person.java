
public class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("名前は" + name + "です。年齢は" + age + "歳です。");
	}
	
	
	@Override
	public String toString() {
		return "名前：" + name + ",年齢：" + age;
	}
	
	
	public static void main(String[] args) {
		
		Person person = new Person("イチロー", 52);
		System.out.println(person.toString());
		
		
//		Person person = new Person("tarou", 24);
//		System.out.println("名前" + person.getName());
		
	}
}
