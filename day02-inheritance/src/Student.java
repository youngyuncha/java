
public class Student extends Person{


	@Override
	public String toString() {
		return super.toString()+ " hakgwa=" + hakgwa ;
	}

	
	private String hakgwa;

	public Student(String name, int age, String hakgwa) {
		super(name, age);
		this.hakgwa = hakgwa;
	}

}
