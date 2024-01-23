package library;

public class Magazine extends Item {

	private boolean hasPictures;

	public Magazine(String Title, String Author, int Pages, boolean hasPictures, boolean available) {
		super(Title, Author, Pages, available);
		sethasPictures(hasPictures);
	}

	public Magazine() {
		super();
	}

	public boolean gethasPictures() {
		return hasPictures;
	}

	public void sethasPictures(boolean hasPictures) {
		this.hasPictures = hasPictures;
	}

	@Override
	public String toString() {
		return "[ Magazine = id = " + getId() + ", Title = " + getTitle() + ", Author = " + getAuthor() + ", Pages = "
				+ getPages() + ", Pictures = " + hasPictures + ", Available = " + getAvailable() + ", Size = " + size()
				+ "]";
	}

	@Override
	public String size() {
		return "A4";
	}

}
