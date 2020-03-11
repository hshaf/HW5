package p1;

public class MiniStudentCourseBag {
	private MiniStudentInfo[] miniStudentInfo;
	private int nElems;

	public MiniStudentCourseBag(int maxSize) {
		miniStudentInfo = new MiniStudentInfo[maxSize];
		nElems = 0;
	}

	public int getnElems() {
		return nElems;
	}

	public void setnElems(int nElems) {
		this.nElems = nElems;
	}
	
	public MiniStudentInfo[] getMiniStudentInfo() {
		return miniStudentInfo;
	}
	
	// remove by course number
	public MiniStudentInfo removeByCourseNumber(String courseNumber) {
		int i;
		
		for (i = 0; i < nElems; i++) {
			if(miniStudentInfo[i].getCourseNumber().equals(courseNumber)) {
				break;
			}
		}
		
		if (i == nElems) {
			return null;
		} 
		
		else {
			MiniStudentInfo temp = miniStudentInfo[i];
			
			for (int j = i; j < nElems - 1; j++) {
				miniStudentInfo[i] = miniStudentInfo[j + 1];
			}
			
			nElems--;
			return temp;
		}
	}
	
	// search by course number
	public MiniStudentInfo searchByCourseNumber(String courseNumber) {
		for (int i = 0; i < nElems; i++) {
			if (miniStudentInfo[i].getCourseNumber().equals(courseNumber)) {
				return miniStudentInfo[i];
			}
		}
		
		return null;
	}

	// calculate GPA method
	public double calculateGpa(MiniStudentInfo[] array) {
		double points = 0;
		int creditHours = 0;
		
		for (int i = 0; i < nElems; i++) {
			points += array[i].getNumberOfCredits() * convert(array[i].getLetterGrade());
			creditHours += array[i].getNumberOfCredits();
		}
		
		return points / creditHours;
	}
	
	// convert letter grade to grade point method
	public double convert(String letterGrade) {
		double point = 0;
		
		switch (letterGrade) {
		case "A":
			point = 4.0;
			break;
		case "B_PLUS":
			point = 3.5;
			break;
		case "B":
			point = 3.0;
			break;
		case "C_PLUS":
			point = 2.5;
			break;
		case "C":
			point = 2.0;
			break;
		case "D_PLUS":
			point = 1.5;
			break;
		case "D":
			point = 1.0;
			break;
		case "F":
			point = 0.0;
			break;
		}
		
		return point;
	}

	// insert method
	public void insert(MiniStudentInfo info) {
		miniStudentInfo[nElems++] = info;
	}

	// display method
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(miniStudentInfo[i]);
		}
	}

}
