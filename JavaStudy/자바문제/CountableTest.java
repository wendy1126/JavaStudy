package 도전과제07;

interface Countable {
	void count();

}

class Bird implements Countable {
	String name;
	int num;

	public Bird(String name, int num) {
		// name을 초기화하는 코드
		this.name = name;
		this.num = num;

	}

	// count()와 fly() 메서드를 위한 코드
	public void count() {
		System.out.println(name + "가 " + num + "마리 있다.");
	}

	public void fly() {
		System.out.println(num + "마리 " + name + "가 날아간다.");
	}
}

class Tree implements Countable {
	String name;
	int num;

	public Tree(String name, int num) {
		this.name = name;
		this.num = num;
	}

	@Override
	public void count() {
		System.out.println(name + "가 " + num + "그루 있다.");
	}

	public void ripen() {
		System.out.println(num + "그루 " + name + "에 열매가 잘 익었다.");
	}

}

public class CountableTest {
	public static void main(String[] args) {
		Countable[] m = { new Bird("뻐꾸기", 5), new Bird("독수리", 2), new Tree("사과나무", 10), new Tree("밤나무", 7) };

		for (Countable e : m)
			e.count();

		for (int i = 0; i < m.length; i++) {
			// 타입에 따라 fly() 또는 ripen() 메서드를 호출하는 코드
			if (m[i] instanceof Bird) {
				((Bird) m[i]).fly();
			} else {
				((Tree) m[i]).ripen();
			}

		}
	}
}
