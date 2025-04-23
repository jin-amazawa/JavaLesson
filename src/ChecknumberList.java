import java.util.ArrayList;
import java.util.List;

public class ChecknumberList {
	public static void main(String[] args) {
		int number = 6;
		List<String> Checknumber = new ArrayList<String>();
		
		if(number >= 10) {
			Checknumber.add("large");
		}else {
			Checknumber.add("small");
		}
		System.out.println(Checknumber);
	}
}
