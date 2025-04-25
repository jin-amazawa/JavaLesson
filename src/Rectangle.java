
public class Rectangle {
	
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(double width) {
		this(width,width);
	}
	
	public void showDimensions() {
		System.out.printf("幅：%.2f, 高さ：%.2f", width, height);
	}
	
	public double getArea(){
		return width * height;
	}
	
	
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(4.0, 6.5);
        System.out.println("長方形:");
        rect1.showDimensions();
        System.out.println("  面積 = " + rect1.getArea());

        Rectangle square = new Rectangle(5.0);
        System.out.println("\n正方形:");
        square.showDimensions();
        System.out.println("  面積 = " + square.getArea());
    }
	
	
}
