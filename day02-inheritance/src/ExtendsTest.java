
public class ExtendsTest {

	public static void main(String[] args) {
		Person p = new Person("ȫ�浿", 30);//�̸� , ���� 
		System.out.println(p.toString());
		Student st1 = new Student("��浿", 20, "�İ�");
		System.out.println( st1.toString() );
		//person�� ��ӹ޴� Emp Ŭ���� �ۼ�
		Emp e = new Emp("�ڴ븮", 35, "����1��");
		System.out.println( e.toString() );
		// name = ��浿, age=20, dept = ����1
		Person p2 = st1;
		System.out.println("p1.hashcode="+p2.hashCode());
		System.out.println("p1.hashcode="+st1.hashCode());
		System.out.println("p2="+p2.toString());
		if( p2 instanceof Student) {
			System.out.println("p2�� �л��Դϴ�.");
		}
		if(p2 instanceof Emp) {
			System.out.println("p2�� �����Դϴ�.");
			Emp st3 = (Emp)p2;
		}
		Person[] pa = new Person[2];
		pa[0] = st1;
		pa[1] = e;
		System.out.println(" ** ��ü��� ** ");
		System.out.println(pa[0]);
		System.out.println(pa[1]);
	}

}
