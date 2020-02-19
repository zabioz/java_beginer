package doit_5;

public class For {
	public static void main(String[] args) { 
		int num;
		int sum;
		for(num = 1, sum = 0; num <= 10; num++) {
			sum += num;
			System.out.println(num);
		}
		System.out.println(sum);
	}
}
