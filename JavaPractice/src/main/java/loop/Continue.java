package loop;

public class Continue {

	public static void main(String[] args) {
		
		for (int k = 0; k < 10; k++) {
			//System.out.println(k);
			
			if (k==4) {
				continue;
			}
			System.out.println(k);
		}
	}
}
