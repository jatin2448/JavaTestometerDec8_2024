package nonPrimitiveDataType;

public class StringInJava {
	
	public static void main(String[] args) {
		
		String str = "hi123123";
				
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.contains("23"));
		System.out.println(str.indexOf("2"));
		
		System.out.println(str.replaceAll("123", "456"));
		
	}

}
