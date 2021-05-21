package chap01;

import java.util.Scanner;

public class SumFor {
	
	private static void For(int n) {
		int sum = 0;
		for(int i=1; i<= n; i++) {
			sum += i;
			if(n==1)
				System.out.print(i + "=" + i);
			else if (i<n) System.out.print(i + " + " );
			else System.out.print(i+" = "+sum); 
		}
	}
	
	private static String Gauss(int n) {
		int sum = 0;
		sum = (1 + n) * (n/2);
		return "(1+"+ n +")*"+ n/2 + " = " + sum;
	}
	
	private static int sumof(int a, int b) {
		int sum = 0;
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + n + "까지의 합 : " + sum);
		
		//Q7. n이 7이면 '1 + 2 + 3 + 4 + 5 + 6 + 7 = 28'로 출력하는 프로그램을 작성하시오.
		For(n);
		System.out.println();
		
		// Q8. 1부터 10까지의 합은 (1 + 10)*5와 같은 방법으로 구할 수 있다.
		// 가우스의 덧셈이라는 방법을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램을 작성하라.
		System.out.println(Gauss(n));
		
		// Q9. 정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드를 작성하라.
		// static int sumof(int a, int b)
		System.out.println("\n두 정수 a,b를 입력하시오.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sumof(a,b);
		
	}

}
