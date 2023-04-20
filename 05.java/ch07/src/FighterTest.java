abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다");};
}


interface Fightable {
	void move(int x, int y);	//public abstract가 생략됨
	void attack(Fightable f);	//public abstract가 생략됨
}


class Fighter extends Unit2 implements Fightable { //인터페이스의 모든 메서드는 무조건 public abstract.
	
	public void move(int x, int y) {	//오버라이딩 규칙 : 조상보다 접근제어자 법위가 좁으면 안됨
		System.out.println("["+x+","+y+"]로 이동");
	};
	public void attack(Fightable f) {
		System.out.println(f+"를 공격합니다");
	};
	
	// 싸울 수 있는 상대를 불러온다.
	Fightable getFightable() {
		Fighter f = new Fighter();	//Fighter를 생성해서 반환
		return f;
	}
	
}



public class FighterTest {
	
	public static void main(String[] args) {
		Fighter f = new Fighter();
		Fightable f2 = f.getFightable();
		
		
		
		
	}

}
