package p1;

public class ClassroomBag {
	private Classroom[] classroomArray;
	private int nElems;
	
	public ClassroomBag(int maxSize) {
		classroomArray = new Classroom[maxSize];
		nElems = 0;
	}

	public int getnElems() {
		return nElems;
	}

	public void setnElems(int nElems) {
		this.nElems = nElems;
	}
	
	// remove by room number method
	public Classroom removeByRoomNumber(String roomNumber) {
		int i;
		
		for (i = 0; i < nElems; i++) {
			if(classroomArray[i].getRoomNumber().equals(roomNumber)) {
				break;
			}
		}
		
		if (i == nElems) {
			return null;
		} 
		
		else {
			Classroom temp = classroomArray[i];
			
			for (int j = i; j < nElems - 1; j++) {
				classroomArray[i] = classroomArray[j + 1];
			}
			
			nElems--;
			return temp;
		}
	}
	
	// search by room number method
	public Classroom searchByRoomNumber(String roomNumber) {
		for (int i = 0; i < nElems; i++) {
			if (classroomArray[i].getRoomNumber().equals(roomNumber)) {
				return classroomArray[i];
			}
		}
		
		return null;
	}
	
	// insert method
	public void insert(Classroom classroom) {
		classroomArray[nElems++] = classroom;
	}
	
	// display method
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(classroomArray[i]);
		}
	}
}
