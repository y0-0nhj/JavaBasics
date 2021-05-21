package chap02;

import java.util.Scanner;

public class MaxOfArray {
	// �迭 ����� �ִ��� ��Ÿ���ϴ�(���� �Է� ����).
	
	private static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) max = a[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		// �迭 a�� �ִ��� ���Ͽ� ��ȯ�մϴ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("Ű�� �ִ��� ���Ͻÿ�.");
		System.out.print("��� ��: ");
		int num = sc.nextInt();			// �迭�� ��ڼ��� �Է� ����.
		
		int[] height = new int[num];	// ��ڼ��� num�� �迭�� ����
		
		for(int i=0; i<height.length; i++) {
			System.out.print("height[" + i + "] : ");
			height[i] = sc.nextInt();
		}
		System.out.println("����� �� ���� ū Ű�� " + maxOf(height) + "�Դϴ�.");
	}

}
