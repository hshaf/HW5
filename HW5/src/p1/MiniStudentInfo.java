package p1;

public class MiniStudentInfo {
	private String courseNumber;
	private int numberOfCredits;
	private String letterGrade;
	private String courseStatus;

	public MiniStudentInfo(String courseNumber, int numberOfCredits, String letterGrade, String courseStatus) {
		this.courseNumber = courseNumber;
		this.numberOfCredits = numberOfCredits;
		this.letterGrade = letterGrade;
		this.courseStatus = courseStatus;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public int getNumberOfCredits() {
		return numberOfCredits;
	}

	public void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}

	public String getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}

	public String getCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}

	@Override
	public String toString() {
		return "MiniStudentInfo [courseNumber=" + courseNumber + ", numberOfCredits=" + numberOfCredits
				+ ", letterGrade=" + letterGrade + ", courseStatus=" + courseStatus + "]";
	}

}