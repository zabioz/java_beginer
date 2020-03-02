package doit_8;

import java.util.ArrayList;

public class ArrayList {
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		
		library.add(new Book("asd","fgh"));
		
		for(int = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		for(Book book : library) {
			book.showBookInfo();
		}
	}
}
