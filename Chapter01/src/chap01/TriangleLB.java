package chap01;

import java.util.Scanner;

public class TriangleLB {
	
	private static void triangleLB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	private static void triangleLU(int n) {
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	private static void triangleRU(int n) {
		for(int i=1; i<=n; i++) {					// i행 (n = 1, 2, ... , n)
			for(int j=1; j<=i; j++) {
				System.out.print(" ");				// i-1개의 " "를 나타냄
			}
			for (int j = 1; j <= n - i + 1; j++) {	// n-i+1개의 "*"를 나타냄
				System.out.print("*"); 				
			}
			System.out.println();					// 개행(줄변환)
		}
		System.out.println();
	}
	
	private static void triangleRB(int n) {
		for(int i=1; i<=n; i++) {			// i행 (i = 1, 2, … ,n)	
			for(int j=1; j<=n-i; j++) {		// n-i개의 " "를 나타냄
				System.out.print(" ");		
			}
			for(int j=1; j<=i; j++) {		// i개의 "*"를 나타냄
				System.out.print("*");		
			}
			System.out.println();			// 개행(줄변환)
		}
		System.out.println();
	}
	
	private static void pyramid(int n) {
		for(int i=0; i<n; i++) {
			for(int j=1; j<n-i; j++) {
				System.out.print(" ");		// n-i개의 " "를 나타냄.
			}
			for(int j=0; j<i*2+1; j++) {
				System.out.print("*");		// i*2+1개의 "*"를 나타냄.
			}
			System.out.println();			// 개행(줄변환)
		}
	}
	
	private static void numPyramid(int n) {
		for(int i=0; i<n; i++) {
			for(int j=1; j<n-i; j++) {
				System.out.print(" ");		// n-i개의 " "를 나타냄.
			}
			for(int j=0; j<i*2+1; j++) {
				System.out.print(i+1);		// i*2+1개의 i+1를 나타냄.
			}
			System.out.println();			// 개행(줄변환)
		}
	}
	
	// 왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		System.out.print("몇 단 삼각형입니까? : ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	
	
	// Q15. 직각이등변 삼각형을 출력하는 부분을 아래와 같은 형식의 메서드로 작성하시오.
	// static void triangLB(int n)
		triangleLB(n);
	
	// Q16. 왼쪽 위, 오른쪽 위, 오른쪽 아래가 직각인 이등변 삼각형을 출력하는 메서드를 작성하시오.
		triangleLU(n);
		triangleRU(n);
		triangleRB(n);
		
	// Q17. n단의 피라미드를 출력하는 메서드를 작성하세요.
		pyramid(n);
		
	// Q18. n단의 숫자 피라미드를 출력하는 메서드를 작성하세요.
		numPyramid(n);

	}
}
