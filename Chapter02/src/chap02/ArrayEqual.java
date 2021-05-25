package chap02;

import java.util.Scanner;

public class ArrayEqual {
// �� �迭�� �������� �Ǵ�

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
		
		System.out.print("�迭 a�� ��ڼ� : "); 		// �迭 a�� ��ڼ�
		int na = sc.nextInt();
		
		int[] a = new int[na];					// ��ڼ��� na�� �迭
		
		for(int i=0; i<na; i++) {
			System.out.print("a[i] : ");		
			a[i] = sc.nextInt();
		}
		
		System.out.print("�迭 b�� ��ڼ� : ");		// �迭 b�� ��ڼ�
		int nb = sc.nextInt();
		
		int[] b = new int[nb];					// ��ڼ��� nb�� �迭
		
		for(int i=0; i<b.length; i++) {
			System.out.print("b[i] : ");
			b[i] = sc.nextInt();
		}
		
		System.out.println("�迭 a�� b�� " +
				(equals(a,b) ? "�����ϴ�."
							: "���� �ʽ��ϴ�."));
		
		
		// Q4.�迭 b�� ��� ��Ҹ� �迭 a�� �����ϴ� �޼��� copy�� �ۼ��϶�.
		System.out.println("--- copy �޼ҵ� ���� ---");
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
		
		// Q5. �迭 b�� ��� ��Ҹ� �迭 a�� �������� �����ϴ� �޼��� rcopy�� �ۼ��϶�.
		System.out.println("--- rcopy �޼ҵ� ���� ---");
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
