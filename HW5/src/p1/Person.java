package p1;

public abstract class Person {
	private Name name;
	private String id;
	private static int idCounter = 1;

	public Person(Name name) {
		this.name = name;
		id = String.format("%08d", idCounter++);
	}

	public String getId() {
		return id;
	}

	public static int getIdCounter() {
		return idCounter;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}

}