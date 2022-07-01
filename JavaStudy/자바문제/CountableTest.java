package ��������07;

interface Countable {
	void count();

}

class Bird implements Countable {
	String name;

	public Bird(String name) {
		// name�� �ʱ�ȭ�ϴ� �ڵ�
		this.name = name;

	}

	// count()�� fly() �޼��带 ���� �ڵ�
	public void count() {
		System.out.println(name + "�� 2���� �ִ�.");
	}

	public void fly() {
		System.out.println("2���� " + name + "�� ���ư���.");
	}
}

class Tree implements Countable {
	String name;

	public Tree(String name) {
		this.name = name;
	}

	@Override
	public void count() {
		System.out.println(name + "�� 5�׷� �ִ�.");
	}

	public void ripen() {
		System.out.println(name + "�� ���Ű� �� �;���.");
	}

}

public class CountableTest {
	public static void main(String[] args) {
		Countable[] m = { new Bird("���ٱ�"), new Bird("������"), new Bird("����"), new Tree("�������"), new Tree("�㳪��") };

		for (Countable e : m)
			e.count();

		for (int i = 0; i < m.length; i++) {
			// Ÿ�Կ� ���� fly() �Ǵ� ripen() �޼��带 ȣ���ϴ� �ڵ�
			if (m[i] instanceof Bird) {
				((Bird) m[i]).fly();
			} else {
				((Tree) m[i]).ripen();
			}

		}
	}
}
