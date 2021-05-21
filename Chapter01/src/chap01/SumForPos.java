package chap01;

import java.util.Scanner;

public class SumForPos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do { // n이 0보다 클 때까지 반복
			System.out.print("n의 값 : ");
			n = sc.nextInt();
		} while(n<=0);
		
		int sum=0;
		
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println("1부터 " + n + "까지의 합 : " + sum);
		
		// 사전판단 반복(while, for)과 사후판단 반복(do-while)
		// Q10. 두 변수 a, b에 정수를 입력하고 b-a를 출력하는 프로그램을 작성하라.
		System.out.println("두 변수 a, b를 입력하시오.");
		int a, b;
		
		System.out.print("a의 값 : ");
		a = sc.nextInt();
		do {
			System.out.print("b의 값 : ");
			b = sc.nextInt();
			System.out.println("a보다는 큰 값을 입력하세요!");
		} while(b<=a);
		System.out.println("b의 값 : " + b);
		int sub = b-a;
		System.out.println("b-a는 " + sub +"입니다.");
		
		
		// Q11. 양의 정수를 입력하고 자릿수를 출력하는 프로그램 작성.
		// ex) 135를 입력하면 '그 수는 3자리입니다.'라고 출력하고, 1314를 입력하면 '그 수는 4자리입니다.'라고 출력
		System.out.print("\n양의 정수 n: ");
		int bn = sc.nextInt();
		int cnt = 0;
		for(int i=1; i<=bn; i*=10) {
			cnt++;
			if(bn/i==1) System.out.println("그 수는 " + cnt + "자리입니다.");
		}
		
		
		
	}
	
}
