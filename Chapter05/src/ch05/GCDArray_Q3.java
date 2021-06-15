package ch05;

import java.util.Scanner;

// Q3. �迭 a�� ��� ����� �ִ������� ���ϴ� ���� �޼��带 �ۼ��϶�.
public class GCDArray_Q3 {
	static int GCDArray(int[] a, int n) {
		int x = a[0];
		for(int i=0;i<n-1;i++) {
			int y = a[i+1];
			int num;
			while(y!=0) {
				num = y;
				y = x%y;
				x = num;	// swap��� Ȱ���� x �ڸ��ٲ�.
			}
		}
		return x;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ���� : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<a.length;i++) {
			System.out.print("��� : ");
			a[i] = sc.nextInt();
		}
		System.out.println("�迭�� ��� ����� �ִ� ������� "+ GCDArray(a, n) +"�Դϴ�.");
		
	}

}
