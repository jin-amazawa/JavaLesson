
public class VarArgsSum {
	public static int sum(int... nums) {
		int total = 0;
		for(int n : nums) {
			total = total + n;
		}
		return total;
	}
	
	public static void main(String[] args) {
        
        System.out.println("sum(10, 20) = " + sum(10, 20));
        System.out.println("sum(1, 2, 3, 4, 5) = " + sum(1, 2, 3, 4, 5));
        System.out.println("sum() = " + sum());
        System.out.println("sum(7, 14, 21, 28, 35, 42) = " + sum(7, 14, 21, 28, 35, 42));
	}
		
}
