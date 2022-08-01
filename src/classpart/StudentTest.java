package classpart;

/*
 *  <클래스 생성>
 *  	클래스형     변수 이름     =     new   생성자
 *  ex) Student    studentLee  =     new   Student();
 *  			   참조 변수		    (키워드)
 */
public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.studentID = 100;
		studentLee.address = "전주시";
		
		Student studentKim = new Student(101, "하정헌");
		studentKim.address = "서울시";
		
		studentLee.showStudentInf();
		studentKim.showStudentInf();
		
		System.out.println(studentLee);
		System.out.println(studentKim);

	}

}
