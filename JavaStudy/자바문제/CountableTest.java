package ��������07;

interface Countable {
	void count();

}

class Bird implements Countable {
	String name;
	int num;

	public Bird(String name, int num) {
		// name�� �ʱ�ȭ�ϴ� �ڵ�
		this.name = name;
		this.num = num;

	}

	// count()�� fly() �޼��带 ���� �ڵ�
	public void count() {
		System.out.println(name + "�� " + num + "���� �ִ�.");
	}

	public void fly() {
		System.out.println(num + "���� " + name + "�� ���ư���.");
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
		System.out.println(name + "�� " + num + "�׷� �ִ�.");
	}

	public void ripen() {
		System.out.println(num + "�׷� " + name + "�� ���Ű� �� �;���.");
	}

}

public class CountableTest {
	public static void main(String[] args) {
		Countable[] m = { new Bird("���ٱ�", 5), new Bird("������", 2), new Tree("�������", 10), new Tree("�㳪��", 7) };

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
