import java.util.HashSet;
import java.util.Set;

public class HashSetSample {
	public static void main(String[] args) {
		Set<Integer> numList = new HashSet<Integer>();
		
		numList.add(2);
		numList.add(1);
		numList.add(1);
		numList.add(3);
		
		System.out.println(numList);
	}
}
