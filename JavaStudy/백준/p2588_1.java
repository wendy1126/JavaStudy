package 백준;

import java.util.Scanner;

public class p2588_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int j = in.nextInt();
		
		System.out.println(i * (j%10));
		System.out.println(i * (j%100/10));
		System.out.println(i * (j/100));
		System.out.println(i * j);

	}

}
