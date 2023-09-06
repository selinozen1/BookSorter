package bookSorter;

public class Book implements Comparable<Book> {
	private String bookName;
	private int pageNumber;
	private String authorName;
	private String publicationDate;
	
	public Book(String bookName, int pageNumber, String authorName, String publicationDate) {
		this.bookName = bookName;
		this.pageNumber = pageNumber;
		this.authorName = authorName;
		this.publicationDate = publicationDate;
	}

	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getAuthorName() {
		return this.authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublicationDate() {
		return this.publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	@Override
	public int compareTo(Book o) {
		return this.getBookName().compareTo(o.getBookName());
	}
	
	
	
	
	

}
