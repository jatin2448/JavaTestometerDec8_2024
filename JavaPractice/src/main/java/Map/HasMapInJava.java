package Map;

import java.util.HashMap;
import java.util.Map;

public class HasMapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * username:
		 * password:
		 * url:
		 */
		
		Map<String, String> hmap = new HashMap<String, String>();
		hmap.put("Username", "user123");
		hmap.put("Password", "pass123");
		hmap.put("SiteURL", "https://testometer.com");
		
		System.out.println(hmap);
		
		for (Map.Entry<String, String> entrySet : hmap.entrySet()) {
			/*
			 * String key = entrySet.getKey(); valType val = entrySet.getValue();
			 */
			
			System.out.println(entrySet.getKey());
			System.out.println(entrySet.getValue());
			
		}
		System.out.println(hmap.get("Username"));
		
		hmap.remove("Password");
		
		System.out.println(hmap);
		
	}

}
