package p1;

public class Student extends Person {
	private String major;
	private double gpa;
	private MiniStudentCourseBag miniStudentCourseBag;

	public Student(Name name, String major, MiniStudentCourseBag miniStudentCourseBag) {
		super(name);
		this.major = major;
		this.miniStudentCourseBag = miniStudentCourseBag;
		this.gpa = miniStudentCourseBag.calculateGpa(miniStudentCourseBag.getMiniStudentInfo());
	}

	public MiniStudentCourseBag getMiniStudentCourseBag() {
		return miniStudentCourseBag;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getGpa() {
		return gpa;
	}

}