package library;

public class Journal extends Item {

	private String EntryRef;

	public Journal(String Title, String Author, int Pages, String EntryRef, boolean available) {
		super(Title, Author, Pages, available);
		setEntryRef(EntryRef);
	}

	public Journal() {
		super();
	}

	public String getEntryRef() {
		return EntryRef;
	}

	public void setEntryRef(String entryRef) {
		EntryRef = entryRef;
	}

	@Override
	public String toString() {
		return "[ Journal = id = " + getId() + ", Title = " + getTitle() + ", Author = " + getAuthor() + ", Pages = "
				+ getPages() + ", EntryRef = " + EntryRef + ", Available = " + getAvailable() + ", Size = " + size()
				+ "]";
	}

	@Override
	public String size() {
		return "A6";
	}

}
