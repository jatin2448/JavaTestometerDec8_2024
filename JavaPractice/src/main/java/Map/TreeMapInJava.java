package Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> hmap = new TreeMap<>();
		
		hmap.put("Password", "pass123");
		hmap.put("SiteURL", "https://testometer.com");
		hmap.put("name", "user123");
		
		System.out.println(hmap);

	}

}
