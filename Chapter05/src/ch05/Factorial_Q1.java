package ch05;

import java.util.Scanner;

public class Factorial_Q1 {
	// Q1. ��͸޼��� ȣ���� ������� �ʰ� factorial �޼��带 �ۼ��϶�.
	// ���� ���� n�� ���丮���� ��ȯ�մϴ�.
	
	// Q1 Ǯ��
	static int factorial(int n) {
		int sum=1;
		for(int i=n; i>0; i--) {
			sum*=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int x = sc.nextInt();
		
		System.out.println(x+"�� ���丮���� "+factorial(x)+"�Դϴ�.");
		
	}

}
