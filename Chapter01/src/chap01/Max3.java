package chap01;

import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3개의 정숫값을 입력하시오.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println("최댓값은 " + max + "입니다.");
		
		
		

	}

}
