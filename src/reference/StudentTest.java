package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentJames = new Student(100, "James");
		studentJames.setKorean(100);
		studentJames.setmath(100);
		
		Student studentTomas = new Student(101, "Tomas");
		studentTomas.setKorean(80);
		studentTomas.setmath(60);
		
		studentJames.showStudentInf();
		studentTomas.showStudentInf();
	}

}
