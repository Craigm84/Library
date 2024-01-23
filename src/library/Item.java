package library;

public abstract class Item implements Comparable<Item> {

	public abstract String size();

	private static int count = 0;

	private int id;
	private String title;
	private String author;
	private int pages;
	private boolean available;

	public Item() {
		super();
		setId(++count);
	}

	public Item(String title, String author, int pages, boolean available) {
		super();
		setId(++count);
		setTitle(title);
		setAuthor(author);
		setPages(pages);
		setAvailable(available);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", Title=" + title + ", Author=" + author + ", Pages=" + pages + ", Available="
				+ available + "]";
	}

	@Override
	public int compareTo(Item o) {
		return id - o.id;
	}

}
