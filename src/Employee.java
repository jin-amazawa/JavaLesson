
public class Employee {
	private int id;
	private String name;
	private double salary;

	
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public boolean equals(Object o) {
		Employee other = (Employee) o;
		return this.id == other.id;
	}

	
	
	
	public void raiseSalary(double percent) {
		salary = salary + salary * percent / 100;
	}

	public void showInfo() {
		System.out.printf("ID:%d, 名前:%s, 給与:%.2f%n", id, name, salary);
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee(1001, "山田 太郎", 350000);
		Employee emp2 = new Employee(1002, "佐藤 花子", 320000);
		Employee emp3 = new Employee(1001, "鈴木 次郎", 300000);
		
		
		System.out.println(emp1.name + "と" + emp2.name + "のIDの比較→" + emp1.equals(emp2)); // false
		
		
		System.out.println(emp1.name + "と" + emp3.name + "のIDの比較→" + emp1.equals(emp3)); // true
		
		
		
		
//		       Employee emp = new Employee();
//		        
//		        emp.id     = 101;
//		        emp.name   = "山田 花子";
//		        emp.salary = 300000.0;
//		
//		        emp.raiseSalary(10);
//		        emp.showInfo();
	}

}
