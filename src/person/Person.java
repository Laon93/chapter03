package person;

public class Person {

	public String name;
	protected int height;
	int age;
	private int e;
	
	public Person() {
		System.out.println("Person 클래스 생성자가 호출");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
