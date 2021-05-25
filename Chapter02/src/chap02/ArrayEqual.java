package chap02;

import java.util.Scanner;

public class ArrayEqual {
// 두 배열이 같은가를 판단

	private static boolean equals(int[] a, int[] b) {
		if(a.length != b.length)
			return false;
		
		for(int i=0; i<a.length; i++) {
			if(a[i] != b[i]) return false;
		}
		
		return true;
	}
	
	private static void copy(int[] a, int[] b) {
		int n = a.length;
		n = b.length;
		for(int i=0; i<n; i++) {
			a[i] = b[i];
		}
	}
	
	private static void rcopy(int[] a, int[] b) {
		int n = a.length;
		n = b.length;
		int t=0;
		for(int i=0; i<n; i++) {
			a[i] = b[i];
		}
		for(int i=0; i<n/2; i++) {
			t=a[i];
			a[i] = a[a.length-i-1];
			a[a.length-i-1] = t;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 a의 요솟수 : "); 		// 배열 a의 요솟수
		int na = sc.nextInt();
		
		int[] a = new int[na];					// 요솟수가 na인 배열
		
		for(int i=0; i<na; i++) {
			System.out.print("a[i] : ");		
			a[i] = sc.nextInt();
		}
		
		System.out.print("배열 b의 요솟수 : ");		// 배열 b의 요솟수
		int nb = sc.nextInt();
		
		int[] b = new int[nb];					// 요솟수가 nb인 배열
		
		for(int i=0; i<b.length; i++) {
			System.out.print("b[i] : ");
			b[i] = sc.nextInt();
		}
		
		System.out.println("배열 a와 b는 " +
				(equals(a,b) ? "같습니다."
							: "같지 않습니다."));
		
		
		// Q4.배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하라.
		System.out.println("--- copy 메소드 실행 ---");
		copy(a,b);
		System.out.print("a[i] = ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("b[i] = ");
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		// Q5. 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 rcopy를 작성하라.
		System.out.println("--- rcopy 메소드 실행 ---");
		rcopy(a,b);
		System.out.print("a[i] = ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("b[i] = ");
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i] + " ");
			
		}
	}
}
