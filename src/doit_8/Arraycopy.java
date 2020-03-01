package doit_8;

public class Arraycopy {
	public static void main(String[] args) {
		int[] list1 = {10,20,30,40,50};
		int[] list2 = {1,2,3,4,5};
	
	
	System.arraycopy(list1, 1, list2, 3, 2);
		for(int i = 0; i < list2.length; i++) {
			System.out.println(list2[i]);
		}
	}
}
