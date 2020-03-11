package p1;

public class Faculty extends Person {
	private String title;
	private double salary;
	private String officePhone;
	private MiniFacultyCourseBag miniFacultyCourseBag;

	public Faculty(Name name, String title, double salary, String officePhone, MiniFacultyCourseBag miniFacultyCourseBag) {
		super(name);
		this.title = title;
		this.salary = salary;
		this.officePhone = officePhone;
		this.miniFacultyCourseBag = miniFacultyCourseBag;
	}

	public MiniFacultyCourseBag getMiniFacultyCourseBag() {
		return miniFacultyCourseBag;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getOfficePhone() {
		return officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

}
