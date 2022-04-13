package Java01;

import java.util.Scanner;

public class digit { //각 자리수 출력

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		
		int a = i % 10;
		int b = (i / 10) % 10;
		int c = (i /10) / 10;
		
		
		System.out.printf("each digit = %d, %d, %d" , c , b , a);
	}
}
