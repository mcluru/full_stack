
public class IntefaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.method(new C());	//A�� B�� ���(����)
		
	}

}

class A {
	public void method(I i) {	//�������̽� I�� ������ �͸� ���Ͷ�
		i.method();
	}
}

// BŬ������ ����� ������ �и�
// BŬ������ ����
interface I {
	public void method();
}

// BŬ������ ����
class B implements I {
	public void method() {
		System.out.println("BŬ������ �޼���");
	}
}

class C implements I {
	public void method() {
		System.out.println("CŬ������ �޼���");
	}
}