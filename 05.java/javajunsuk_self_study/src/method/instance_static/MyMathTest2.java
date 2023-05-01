package method.instance_static;

public class MyMathTest2 {

	public static void main(String[] args) {
		
		System.out.println(MyMath2.add(3, 4));
		MyMath2 mm = new MyMath2();
//		mm.a = 3;
//		mm.b = 4;
		System.out.println(mm.add1(5,4));
		
	}

}
