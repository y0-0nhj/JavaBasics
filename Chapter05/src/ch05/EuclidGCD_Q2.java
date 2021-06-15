package ch05;

import java.util.Scanner;

// ��Ŭ���� ȣ�������� �ִ����� ���ϱ�
public class EuclidGCD_Q2 {
	// ���� x, y�� �ִ������� ���Ͽ� ��ȯ�մϴ�.
	static int gcd(int x, int y) {
		int num;
		while(y!=0) {
			num = y;
			y = x%y;
			x = num;	// swap��� Ȱ���� x �ڸ��ٲ�.
		}return x;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ������� ���մϴ�.");
		System.out.print("���� x : "); int x = sc.nextInt();
		System.out.print("���� y : "); int y = sc.nextInt();
		
		System.out.println("�ִ� ������� " + gcd(x,y) +"�Դϴ�.");
	}
}
