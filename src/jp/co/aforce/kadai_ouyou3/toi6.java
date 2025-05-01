package jp.co.aforce.kadai_ouyou3;

public class toi6 {
	public static void main(String[] args) {
		try {
			int[] nums = {1,2,3};
			System.out.println(nums[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の範囲外です");
		}
		
		System.out.println("処理は続いているよ☆");
		
	}
}
