package doit_5;

public class Continue {
	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for (num = 1; num <= 100; num++) {
			if(num % 1 == 0)
				continue;
			total += num;
		}
		System.out.println( total);
	}
}
