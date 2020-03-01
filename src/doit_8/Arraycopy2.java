package doit_8;

public class Arraycopy2 {
	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] library2 = new Book[3];
		
		library[0] = new Book("asd","One");
		library[1] = new Book("qwe","Two");
		library[2] = new Book("zxc","Three");
		library[3] = new Book("rty","Fore");
		library[4] = new Book("fgh","Five");
		System.arraycopy(library, 2, library2, 0, 2);
		
		for(int i = 0; i < library2.length; i++) {
			library2[i].showBookInfo();
		}
		
		System.out.println("library");
		library[2].setBookName("ª¢ª¤ª¦ª¨ªª");
		library[2].setAuthor("ª¤ªÁ");
		
		System.out.println("library2");
		for(int i = 0; i < library2.length; i++) {
			library2[i].showBookInfo();
		}
	}
}
