
public class Car {
	
	private String make;
	private int year;

	
	public Car() {
		this.make = "トヨタ";
		this.year = 300;	
	}
	
    public Car(String make, int year) {
        this.make  = make;
        this.year = year;
    }
	
	public void showInfo() {
		System.out.printf(
				"メーカー: %s%n 年数 : %s年%n", make, year
				);
	}
	
	public static void main(String[] args) {
		Car defaultCar = new Car();
		System.out.println("デフォルトカー");
		defaultCar.showInfo();
		
		Car customCar = new Car("日産", 350);
		System.out.println("カスタムカー");
		customCar.showInfo();		
	}
	
	
}
