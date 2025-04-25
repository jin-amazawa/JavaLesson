
public class Sum {
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	
	public static void main(String[] args) {
		int result1 = sum(23,43);
		System.out.println("sum(23,43)=" + result1);
		
        int result3 = sum(5, 15, 25);
        System.out.println("sum(5,15,25)=" + result3);
	}
	
	
}
