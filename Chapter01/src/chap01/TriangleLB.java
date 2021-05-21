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
		for(int i=1; i<=n; i++) {					// i�� (n = 1, 2, ... , n)
			for(int j=1; j<=i; j++) {
				System.out.print(" ");				// i-1���� " "�� ��Ÿ��
			}
			for (int j = 1; j <= n - i + 1; j++) {	// n-i+1���� "*"�� ��Ÿ��
				System.out.print("*"); 				
			}
			System.out.println();					// ����(�ٺ�ȯ)
		}
		System.out.println();
	}
	
	private static void triangleRB(int n) {
		for(int i=1; i<=n; i++) {			// i�� (i = 1, 2, �� ,n)	
			for(int j=1; j<=n-i; j++) {		// n-i���� " "�� ��Ÿ��
				System.out.print(" ");		
			}
			for(int j=1; j<=i; j++) {		// i���� "*"�� ��Ÿ��
				System.out.print("*");		
			}
			System.out.println();			// ����(�ٺ�ȯ)
		}
		System.out.println();
	}
	
	private static void pyramid(int n) {
		for(int i=0; i<n; i++) {
			for(int j=1; j<n-i; j++) {
				System.out.print(" ");		// n-i���� " "�� ��Ÿ��.
			}
			for(int j=0; j<i*2+1; j++) {
				System.out.print("*");		// i*2+1���� "*"�� ��Ÿ��.
			}
			System.out.println();			// ����(�ٺ�ȯ)
		}
	}
	
	private static void numPyramid(int n) {
		for(int i=0; i<n; i++) {
			for(int j=1; j<n-i; j++) {
				System.out.print(" ");		// n-i���� " "�� ��Ÿ��.
			}
			for(int j=0; j<i*2+1; j++) {
				System.out.print(i+1);		// i*2+1���� i+1�� ��Ÿ��.
			}
			System.out.println();			// ����(�ٺ�ȯ)
		}
	}
	
	// ���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");
		System.out.print("�� �� �ﰢ���Դϱ�? : ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	
	
	// Q15. �����̵ �ﰢ���� ����ϴ� �κ��� �Ʒ��� ���� ������ �޼���� �ۼ��Ͻÿ�.
	// static void triangLB(int n)
		triangleLB(n);
	
	// Q16. ���� ��, ������ ��, ������ �Ʒ��� ������ �̵ �ﰢ���� ����ϴ� �޼��带 �ۼ��Ͻÿ�.
		triangleLU(n);
		triangleRU(n);
		triangleRB(n);
		
	// Q17. n���� �Ƕ�̵带 ����ϴ� �޼��带 �ۼ��ϼ���.
		pyramid(n);
		
	// Q18. n���� ���� �Ƕ�̵带 ����ϴ� �޼��带 �ۼ��ϼ���.
		numPyramid(n);

	}
}
