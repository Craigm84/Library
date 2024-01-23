package library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {

		Book book = new Book("Java", "Jordan Harrison", 100, "Education", true);
		Book book2 = new Book("React", "Piers Barber", 150, "Education", true);
		Journal journal = new Journal("Motor Racing", "Andrew Clark", 5, "MRAC", true);
		Journal journal2 = new Journal("Football", "David Beckham", 10, "MRAC", true);
		Magazine magazine = new Magazine("Match of the Day", "Gary Lineker", 50, true, true);
		Magazine magazine2 = new Magazine("Fishing", "Bob Mortimer", 40, true, true);
		Person person1 = new Person("Craig", "Morris");
		Person person2 = new Person("Paige", "Godwin");
		Person person3 = new Person("Andrew", "Clark");

		Item book3 = new Book("Harry Potter", "J.K.Rowling", 500, "Fiction", true);

		Library myLibrary = new Library();
		myLibrary.add(book);
		myLibrary.add(journal);
		myLibrary.add(magazine);
		myLibrary.add(book2);
		myLibrary.add(journal2);
		myLibrary.add(magazine2);
		myLibrary.add(book3);

		myLibrary.addP(person1);
		myLibrary.addP(person2);
		myLibrary.update(2, "Piers");

		System.out.println(myLibrary);

		List<Person> pList = new ArrayList<>(0);
		pList.add(person1);
		pList.add(person2);
		pList.add(person3);
		Collections.sort(pList);
		System.out.println(pList);
		pList.remove(1);
		pList.remove(person3);
		System.out.println(pList);

		List<Item> iList = new ArrayList<>(0);
		iList.add(book);
		iList.add(journal2);
		iList.add(journal);
		iList.add(magazine);
		iList.add(book3);
		iList.add(magazine2);
		iList.add(book2);
		Collections.sort(iList);
		System.out.println(iList);
	}

}