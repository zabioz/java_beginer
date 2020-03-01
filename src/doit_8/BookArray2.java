package doit_8;

public class BookArray2 {
	public static void main(String[] args) { 
		Book[] library = new Book[5];
		
		library[0] = new Book("asd","One");
		library[1] = new Book("qwe","Two");
		library[2] = new Book("zxc","Three");
		library[3] = new Book("rty","Fore");
		library[4] = new Book("fgh","Five");
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}
}
