package Java_01;

import java.util.Scanner;

public class 별찍기 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("피라미드를 찍을 Character를 입력하세요 : ");
		char c = in.next().charAt(0);
		System.out.println("피라미드 층수를 입력하세요 : ");
		int n = in.nextInt();
		System.out.printf("피라미드의 벽돌은 %c %c\n", c, c+1);
		
		for(int i=0; i<n; i++) {
			System.out.print(">");
		for(int j=0; j<=i; j++) {
			if (j%2==0)
				System.out.print(c);
			else 
				System.out.printf("%c",c+1);
			}
		System.out.println();
		
		}
	}

}
