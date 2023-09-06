package bookSorter;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<Book> book = new TreeSet<>();
		book.add(new Book("Harry Potter", 255, "J.K.Rowling" , "01.02.2002"));
		book.add(new Book("Otomatik Portakal", 192, "Anthony Burgess", "01.02.1962"));
		book.add(new Book("Olu Ozanlar Dernegi", 255, "N.H.Kleinbaum", "01.05.2000"));
		book.add(new Book("Satranc", 96, "Stefan Zweig", "01.02.2005"));
		book.add(new Book("Saatleri Ayarlama Enstitusu", 650, "Ahmet Hamdi Tanpinar", "01.02.1961"));
		
		for (Book books : book) {
			System.out.println(books.getBookName());
		}
		
		System.out.println("##############");
		
		TreeSet<Book> book1 = new TreeSet<>(new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return o1.getPageNumber() - o2.getPageNumber();
			}
		});
		book1.add(new Book("Harry Potter", 255, "J.K.Rowling" , "01.02.2002"));
		book1.add(new Book("Otomatik Portakal", 192, "Anthony Burgess", "01.02.1962"));
		book1.add(new Book("Olu Ozanlar Dernegi", 327, "N.H.Kleinbaum", "01.05.2000"));
		book1.add(new Book("Satranc", 96, "Stefan Zweig", "01.02.2005"));
		book1.add(new Book("Saatleri Ayarlama Enstitüsü", 650, "Ahmet Hamdi Tanpinar", "01.02.1961"));
		
		for (Book books1 : book1) {
			System.out.println(books1.getPageNumber());
		}
		

	}

}
