package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> hmap = new LinkedHashMap<>();
		hmap.put("Username", "user123");
		hmap.put("Password", "pass123");
		hmap.put("SiteURL", "https://testometer.com");
		
		System.out.println(hmap);
		
	}

}
