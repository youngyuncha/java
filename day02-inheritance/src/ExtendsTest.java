
public class ExtendsTest {

	public static void main(String[] args) {
		Person p = new Person("홍길동", 30);//이름 , 나이 
		System.out.println(p.toString());
		Student st1 = new Student("김길동", 20, "컴공");
		System.out.println( st1.toString() );
		//person을 상속받는 Emp 클래스 작성
		Emp e = new Emp("박대리", 35, "영업1팀");
		System.out.println( e.toString() );
		// name = 김길동, age=20, dept = 영업1
		Person p2 = st1;
		System.out.println("p1.hashcode="+p2.hashCode());
		System.out.println("p1.hashcode="+st1.hashCode());
		System.out.println("p2="+p2.toString());
		if( p2 instanceof Student) {
			System.out.println("p2는 학생입니다.");
		}
		if(p2 instanceof Emp) {
			System.out.println("p2는 직원입니다.");
			Emp st3 = (Emp)p2;
		}
		Person[] pa = new Person[2];
		pa[0] = st1;
		pa[1] = e;
		System.out.println(" ** 전체출력 ** ");
		System.out.println(pa[0]);
		System.out.println(pa[1]);
	}

}
