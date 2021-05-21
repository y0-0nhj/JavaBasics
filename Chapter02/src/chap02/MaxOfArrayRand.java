package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
	// �迭�� �ִ��� ���Ͽ� ��ȯ�մϴ�.
	private static int maxOf(int[] a) {
		int max = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) max = a[i];
		}
		return max;
	}
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		System.out.print("��� ��: ");
		int num = sc.nextInt();			// �迭�� ��ڼ��� �Է� ����.
		
		int[] height = new int[num];	// ��ڼ��� num�� �迭�� ����
		
		System.out.println("Ű ���� �Ʒ��� �����ϴ�.");
		for(int i=0; i<height.length; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] : " + height[i]);
			
		}
		System.out.println("����� �� ���� ū Ű�� " + maxOf(height) + "�Դϴ�.");
	
		// Q1. Ű�Ӹ� �ƴ϶� ��� ���� ������ �����ϵ��� ���α׷��� �ۼ��϶�.
		System.out.println("\n---- ��� ���� ������ ���� ----");
		Random n = new Random();
		int num2 = 1 + n.nextInt(30);		// 1���� 30������ ��� ���� ��Ÿ���� ����
		System.out.println("��� ��: " + num2);
		int[] height2 = new int[num2];		// ��ڼ��� num2�� �迭�� ����
		
		System.out.println("Ű ���� �Ʒ��� �����ϴ�.");
		for(int i=0; i<height2.length; i++) {
			height2[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] : " + height2[i]);
			
		}
		System.out.println("����� �� ���� ū Ű�� " + maxOf(height2) + "�Դϴ�.");

	}
	
}
