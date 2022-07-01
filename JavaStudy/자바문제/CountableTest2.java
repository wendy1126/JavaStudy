package ��������07;

abstract class Countable {
	protected String name;
	protected int num;

	Countable(String name, int num) {
		this.name = name;
		this.num = num;
	}

	abstract void count();
}

class Bird extends Countable {

	Bird(String name, int num) {
		super(name, num);
		// TODO Auto-generated constructor stub
	}

	// count()�� fly() �޼��带 ���� �ڵ�
	public void count() {
		System.out.println(name + "�� " + num + "���� �ִ�.");
	}

	public void fly() {
		System.out.println(num + "���� " + name + "�� ���ư���.");
	}
}

class Tree extends Countable {

	Tree(String name, int num) {
		super(name, num);
		// TODO Auto-generated constructor stub
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
