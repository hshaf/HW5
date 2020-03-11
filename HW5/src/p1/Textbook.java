package p1;

public class Textbook {
	private String bookTitle;
	private String isbn;
	private String author;
	private double price;

	public Textbook(String bookTitle, String isbn, String author, double price) {
		this.bookTitle = bookTitle;
		this.isbn = isbn;
		this.author = author;
		this.price = price;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Textbook [bookTitle=" + bookTitle + ", isbn=" + isbn + ", author=" + author + ", price=" + price + "]";
	}

}
