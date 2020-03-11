package p1;

public class MiniFacultyCourseBag {
	private MiniFacultyCourseInfo[] miniFacultyCourseInfo;
	private int nElems;

	public MiniFacultyCourseBag(int maxSize) {
		miniFacultyCourseInfo = new MiniFacultyCourseInfo[maxSize];
		nElems = 0;
	}

	public int getnElems() {
		return nElems;
	}

	public void setnElems(int nElems) {
		this.nElems = nElems;
	}
	
	public MiniFacultyCourseInfo[] getMiniFacultyCourseInfo() {
		return miniFacultyCourseInfo;
	}
	
	// remove by course number method
	public MiniFacultyCourseInfo removeByCourseNumber(String courseNumber) {
		int i;
		
		for (i = 0; i < nElems; i++) {
			if(miniFacultyCourseInfo[i].getCourseNumber().equals(courseNumber)) {
				break;
			}
		}
		
		if (i == nElems) {
			return null;
		} 
		
		else {
			MiniFacultyCourseInfo temp = miniFacultyCourseInfo[i];
			
			for (int j = i; j < nElems - 1; j++) {
				miniFacultyCourseInfo[i] = miniFacultyCourseInfo[j + 1];
			}
			
			nElems--;
			return temp;
		}
	}
	
	// remove by course title
	public MiniFacultyCourseInfo removeByCourseTitle(String courseTitle) {
		int i;
		
		for (i = 0; i < nElems; i++) {
			if(miniFacultyCourseInfo[i].getCourseTitle().equals(courseTitle)) {
				break;
			}
		}
		
		if (i == nElems) {
			return null;
		} 
		
		else {
			MiniFacultyCourseInfo temp = miniFacultyCourseInfo[i];
			
			for (int j = i; j < nElems - 1; j++) {
				miniFacultyCourseInfo[i] = miniFacultyCourseInfo[j + 1];
			}
			
			nElems--;
			return temp;
		}
	}
	
	// search by course number method
	public MiniFacultyCourseInfo searchByCourseNumber(String courseNumber) {
		for (int i = 0; i < nElems; i++) {
			if (miniFacultyCourseInfo[i].getCourseNumber().equals(courseNumber)) {
				return miniFacultyCourseInfo[i];
			}
		}
		
		return null;
	}
	
	// search by course title method
	public MiniFacultyCourseInfo searchByCourseTitle(String courseTitle) {
		for (int i = 0; i < nElems; i++) {
			if (miniFacultyCourseInfo[i].getCourseTitle().equals(courseTitle)) {
				return miniFacultyCourseInfo[i];
			}
		}
		
		return null;
	}

	// insert method
	public void insert(MiniFacultyCourseInfo info) {
		miniFacultyCourseInfo[nElems++] = info;
	}

	// display method
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(miniFacultyCourseInfo[i]);
		}
	}

}
