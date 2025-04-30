package jp.co.aforce.kadai_ouyou2;

public class Main {
	public static void main(String[] args) {
		Vehicle car = new Car();
		car.move();
		
		Animal dog = new Dog();
		dog.makeSound();
		dog.sleep();
		
		Person student = new Student("amazawa");
		student.introduce();
		
		Shape zukei = new Rectangle();
		zukei.calculateArea();
		zukei.calculatePerimeter();
		
		Computer computer = new Computer();
		computer.powerOn();
		computer.useDevice();
		
		Microwave denngenn = new Microwave();
		denngenn.turnOn();
		denngenn.turnOff();
		
		Movable car1 = new Car1();
		car1.move();
		Movable becycle = new Becycle();
		becycle.move();
		
		Animal1 dog1 = new Dog1();
		dog1.makeSound();
		
		Bird bird = new Bird();
		bird.makeSound();
		bird.fly();
		
		Circle mennseki = new Circle(5);
		mennseki.calculateArea();
		
		Printer printer = new LasePrinter();
		printer.print();
		printer.showStatus();
		
	}
	
	
}
