package p1;

public class CourseBag {
	private Course[] courseArray;
	private int nElems;

	public CourseBag(int maxSize) {
		courseArray = new Course[maxSize];
		nElems = 0;
	}
	
	// remove by course number
	public Course removeByCourseNumber(String courseNumber) {
		int i;
		
		for (i = 0; i < nElems; i++) {
			if(courseArray[i].getCourseNumber().equals(courseNumber)) {
				break;
			}
		}
		
		if (i == nElems) {
			return null;
		} 
		
		else {
			Course temp = courseArray[i];
			
			for (int j = i; j < nElems - 1; j++) {
				courseArray[i] = courseArray[j + 1];
			}
			
			nElems--;
			return temp;
		}
	}
	
	// remove by course title
	public Course removeByCourseTitle(String courseTitle) {
		int i;
		
		for (i = 0; i < nElems; i++) {
			if(courseArray[i].getCourseTitle().equals(courseTitle)) {
				break;
			}
		}
		
		if (i == nElems) {
			return null;
		} 
		
		else {
			Course temp = courseArray[i];
			
			for (int j = i; j < nElems - 1; j++) {
				courseArray[i] = courseArray[j + 1];
			}
			
			nElems--;
			return temp;
		}
	}
	
	// search by course number method
	public Course searchByCourseNumber(String courseNumber) {
		for (int i = 0; i < nElems; i++) {
			if (courseArray[i].getCourseNumber().equals(courseNumber)) {
				return courseArray[i];
			}
		}
		
		return null;
	}
	
	// search by course title
	public Course searchByCourseTitle(String courseTitle) {
		for (int i = 0; i < nElems; i++) {
			if (courseArray[i].getCourseTitle().equals(courseTitle)) {
				return courseArray[i];
			}
		}
		
		return null;
	}
	
	// search by course description
	public Course searchByCourseDescription(String courseDescription) {
		for (int i = 0; i < nElems; i++) {
			if (courseArray[i].getCourseDescription().equals(courseDescription)) {
				return courseArray[i];
			}
		}
		
		return null;
	}

	public int getnElems() {
		return nElems;
	}

	public void setnElems(int nElems) {
		this.nElems = nElems;
	}

	// insert method
	public void insert(Course course) {
		courseArray[nElems++] = course;
	}

	// display method
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(courseArray[i]);
		}
	}
}
