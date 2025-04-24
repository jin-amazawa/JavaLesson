import java.util.ArrayList;

public class for_kadai1 {
	public static void main(String[] args) {
		ArrayList<Integer> scores = new ArrayList<>();
		
		scores.add(85);
		scores.add(92);
		scores.add(78);
		scores.add(65);
		scores.add(98);
		scores.add(70);
		
		int number = 0;
		for(Integer score : scores) {
			if(score >= 70) {
				number = number + 1;
			}
		}
		
		System.out.println("70点以上の得点の数は" + number + "個です。");
		
	}
}
