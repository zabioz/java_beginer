package doit_8;

public class Array3 {
	public static void main(String[] args) {
		char [ ] alphabats = new char[50];
		char ch = 'A';
		
		for (int i = 0; i < alphabats.length; i++, ch++) {
			alphabats[i] = ch;
		}
		
		for(int i = 0; i < alphabats.length; i++) {
			System.out.println(alphabats[i] +" , "+ (int)alphabats[i]);
		}
	}
}
