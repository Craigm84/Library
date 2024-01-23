package library;

public class Person implements Comparable<Person> {

	private static int count = 0;

	private String firstName;
	private String lastName;
	private int customerID;

	public Person(String firstName, String lastName) {
		setCustomerID(++count);
		setFirstName(firstName);
		setLastName(lastName);
	}

	public Person() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	@Override
	public String toString() {
		return "[ id = " + customerID + ", First Name = " + firstName + ", Last Name = " + lastName + "]";
	}

	@Override

	public int compareTo(Person o) {
		return customerID - o.getCustomerID();
	}
}
