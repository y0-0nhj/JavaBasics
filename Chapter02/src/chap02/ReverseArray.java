package chap02;

import java.util.Scanner;

public class ReverseArray {
	// �迭 ��ҿ� ���� �о� �鿩 �������� ����.
	
	private static void swap(int[] a, int idx1, int idx2) {
		// �迭 ��� a[idx1]�� a[idx2]�� ���� �ٲ�
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// �迭 a�� ��Ҹ� �������� ����
	static void reverse(int[] a) {
		for(int i=0; i<a.length/2; i++) 
			swap(a, i, a.length-i-1);
	}
	
	static void reverseProcess(int[] a) {
		for(int i=0; i<a.length/2; i++) {
			int idx1 = i;
			int idx2 = a.length-i-1;
			System.out.println("a["+ idx1 +"]��(��) a["+ idx2 +"]�� ��ȯ�մϴ�.");
			swap(a, idx1, idx2);
			for(int j=0; j<a.length; j++) {
				System.out.print(a[j]+" ");
				}
			System.out.println();
		}
		System.out.println("���� ������ ���ƽ��ϴ�.");
	}
	
	private static int sumOf(int[] a) {
		int i=0;
		int sum =0;
		while(i<a.length) {
			sum+=a[i];
			i++;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = sc.nextInt();			// ��ڼ�
		
		int[] x = new int[num];			// ��ڼ��� num�� �迭
		
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		reverse(x);						// �迭�� ��Ҹ� �������� ����
		
		System.out.println("��Ҹ� �������� �����߽��ϴ�.");
		for(int i=0; i<num; i++) {
			System.out.println("x[" + i + "] : "+x[i]);
		}
		System.out.println();
		
		
		// Q2. �迭 ��Ҹ� �������� �����ϴ� ������ �ϳ��ϳ� ��Ÿ���� ���α׷��� �ۼ��϶�.
		System.out.print("��ڼ� : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		reverseProcess(a);
		
		// Q3. �迭 a�� ��� ����� �հ踦 ���Ͽ� ��ȯ�ϴ� �޼��带 �ۼ��϶�.
		System.out.println(sumOf(a));
		
		
		
	}
	
	
	
}
