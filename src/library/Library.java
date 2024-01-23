package library;

import java.util.ArrayList;

public class Library {
	private ArrayList<Item> items = new ArrayList<>();

	public void add(Item item) {
		items.add(item);
	}

	public boolean remove(Item item) {
		return items.remove(item);
	}

	public boolean remove(int id) {
		for (Item i : items) {
			if (id == i.getId()) {
				return this.items.remove(i);
			}
		}
		return false;
	}

	public void checkIn(Item item) {
		item.setAvailable(true);
	}

	public void checkOut(Item item) {
		item.setAvailable(false);
	}

	private ArrayList<Person> pers = new ArrayList<>();

	public void addP(Person person) {
		pers.add(person);
	}

	public void removeP(Person person) {
		pers.remove(person);
	}

	public boolean update(int id, String update) {
		for (Person p : pers) {
			if (id == p.getCustomerID()) {
				p.setFirstName(update);
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Items = " + items + "\n" + "Person = " + pers + "]";
	}

}
