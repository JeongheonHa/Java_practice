package classpart;

/*
 * 객체 : 객체 지향 프로그램의 대상, 생성된 인스턴스
 * 클래스 : 객체를 프로그래밍하기 위해 코드로 만든 상태
 * 인스턴스 : 클래스가 메모리에 생성된 상태 
 * 멤버 변수 : 클래스의 속성, 특성
 * 매서드 : 멤버 변수를 이용하여 클래스의 기능을 구현
 * 참조 변수 : 메모리에 생성된 인스턴스를 가리키는 변수
 * 참조 값 : 생성된 인스턴스의 메모리 주소 
 */
public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	/* default 생성자 */
	public Student() {}	// precompile 단계에서 자동으로 생성, 생성자가 1개라도 있을 경우 default 생성자 추가 x
						// 내가 추가해도 됨.
	
	/* 매개변수를 받는 생성자 */
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}
	// 생성자 overloading : 여러 생성자의 이름이 같은 경우
    
	public void showStudentInf() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}


}
