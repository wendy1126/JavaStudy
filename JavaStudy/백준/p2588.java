package 백준;

import java.util.Scanner;

public class p2588 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		String j = in.next(); //두번째 숫자를 문자열로 받아서 charAt()으로 각 자리수를 참조
		
		
		System.out.println(i * (j.charAt(2)-'0')); //인덱스는 0부터 시작이므로 세번째 자리수는 2가 됨
		System.out.println(i * (j.charAt(1)-'0')); //-'0' 을 적는 이유는 문자로 저장된 숫자를 숫자 그대로의 값을 쓰기 위함 
		System.out.println(i * (j.charAt(0)-'0'));
		System.out.println(i*Integer.parseInt(j)); //String으로 받은 j값을 int형으로 변환

	}

}
