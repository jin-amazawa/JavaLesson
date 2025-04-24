import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountryCapital {
	private static final int HashMap = 0;

	public static void main(String[] args) {
		Map<String, String> country_capital = new HashMap<>();
		
		country_capital.put("日本", "東京");
		country_capital.put("アメリカ合衆国", "ワシントンD.C.");
		country_capital.put("フランス", "パリ");
		country_capital.put("中国", "北京");
		
		System.out.println("[すべての国名と首都]");
		
		Set<String> countries = country_capital.keySet();
		
		for(String country : countries) {
			String capital = country_capital.get(country);
			System.out.printf("%s - %s%n", country, capital);
		}
		
		System.out.println("");
		
		System.out.println("【[日]を含む国と首都】");
		for(String country : countries) {
			if(country.contains("日")) {
				String capital = country_capital.get(country);
				System.out.printf("%s - %s%n", country, capital);
			}
		}
	}
}
