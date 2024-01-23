package library;

public class Book extends Item {

	private String Genre;

	public Book(String Title, String Author, int Pages, String Genre, boolean available) {
		super(Title, Author, Pages, available);
		setGenre(Genre);
	}

	public Book() {
		super();
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String hasGenre) {
		this.Genre = hasGenre;
	}

	@Override
	public String toString() {
		return "[ Book = id = " + getId() + ", Title = " + getTitle() + ", Author = " + getAuthor() + ", Pages = "
				+ getPages() + ", Genre = " + Genre + ", Available = " + getAvailable() + ", Size = " + size() + "]";
	}

	@Override
	public String size() {
		return "A5";
	}

}
