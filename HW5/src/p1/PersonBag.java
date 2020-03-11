package p1;

public class PersonBag {
	private Person[] personArray;
	private int nElems;

	public PersonBag(int maxSize) {
		personArray = new Person[maxSize];
		nElems = 0;
	}

	public int getnElems() {
		return nElems;
	}

	public void setnElems(int nElems) {
		this.nElems = nElems;
	}
	
	// remove by name method
	public Person removeByName(Name name) {
		int i;
		
		for (i = 0; i < nElems; i++) {
			if(personArray[i].getName().equals(name)) {
				break;
			}
		}
		
		if (i == nElems) {
			return null;
		} 
		
		else {
			Person temp = personArray[i];
			
			for (int j = i; j < nElems - 1; j++) {
				personArray[i] = personArray[j + 1];
			}
			
			nElems--;
			return temp;
		}
	}
	
	// remove by id method
	public Person removeById(String id) {
		int i;
		
		for (i = 0; i < nElems; i++) {
			if(personArray[i].getId().equals(id)) {
				break;
			}
		}
		
		if (i == nElems) {
			return null;
		} 
		
		else {
			Person temp = personArray[i];
			
			for (int j = i; j < nElems - 1; j++) {
				personArray[i] = personArray[j + 1];
			}
			
			nElems--;
			return temp;
		}
	}
	
	// search by name method
	public Person searchByName(Name name) {
		for (int i = 0; i < nElems; i++) {
			if (personArray[i].getName().equals(name)) {
				return personArray[i];
			}
		}
		
		return null;
	}
	
	// search by id method
	public Person searchById(String id) {
		for (int i = 0; i < nElems; i++) {
			if (personArray[i].getId().equals(id)) {
				return personArray[i];
			}
		}
		
		return null;
	}

	// insert method
	public void insert(Person person) {
		personArray[nElems++] = person;
	}

	// display method
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(personArray[i]);
		}
	}

}
