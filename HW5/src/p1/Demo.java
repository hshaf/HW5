package p1;

public class Demo {

	public static void main(String[] args) {
		Name n1 = new Name("mark", "lowry");
		Name n2 = new Name("kenny", "smith");
		
		Name n3 = new Name("jessica", "donaldson");
		Name n4 = new Name("sam", "parker");
		
		MiniStudentCourseBag t1 = new MiniStudentCourseBag(10);
		MiniStudentCourseBag t2 = new MiniStudentCourseBag(10);
		
		MiniFacultyCourseBag t3 = new MiniFacultyCourseBag(10);
		MiniFacultyCourseBag t4 = new MiniFacultyCourseBag(10);
		
		Person s1 = new Student(n1, "english", t1);
		Person s2 = new Student(n2, "math", t2);
		
		Person f1 = new Faculty(n3, "professor", 1, "1241424", t3);
		Person f2 = new Faculty(n4, "adj professor", 112, "124", t4);
		
		PersonBag bag = new PersonBag(5);
		bag.insert(s1);
		bag.insert(s2);
		bag.insert(f1);
		bag.insert(f2);
		
		bag.removeByName(n2);
		
		bag.display();
	}

}
