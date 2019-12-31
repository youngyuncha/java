
public class Emp extends Person {

	
	
	
	private String dept;

	@Override
	public String toString() {
		return super.toString()+"dept="+dept;
	}

	public Emp(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

}









