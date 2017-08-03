package person;

public class PersonTest {

	public static void main(String[] args) {

		Person person = new Student("둘리");  
		person.setName("둘리");
		
		//DownCasting
		//Explicity Casting
		Student s1 = (Student)person;
		s1.set();
		
		//person.set()을 먼저한 후 Student로 형변환을 하겠다는 뜻이므로 에러가 발생
		//(Student)person.set();
		//그렇기 때문에 형변환을 하고난 후에 set()함수를 쓰고 싶다면
		((Student)person).set();
		
		//UpCasting
		//Implicity Casting
		Person p2 = s1;
		p2.setName("AAA");
		
	}

}
