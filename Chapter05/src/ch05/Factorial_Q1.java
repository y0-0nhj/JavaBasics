package ch05;

import java.util.Scanner;

public class Factorial_Q1 {
	// Q1. 재귀메서드 호출을 사용하지 않고 factorial 메서드를 작성하라.
	// 양의 정수 n의 팩토리얼을 반환합니다.
	
	// Q1 풀이
	static int factorial(int n) {
		int sum=1;
		for(int i=n; i>0; i--) {
			sum*=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();
		
		System.out.println(x+"의 팩토리얼은 "+factorial(x)+"입니다.");
		
	}

}
