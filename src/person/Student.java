package person;

public class Student extends Person {

	public void set() {
		// public field
		name = "둘리";

		// protected field
		height = 150;

		// default --> 동일 패키지가 아니면 안될 것.
		age = 35;

		// private field --> error
		// e = 40;
	}

	public Student() {
		System.out.println("Student 클래스 생성자가 호출");
	}
}
