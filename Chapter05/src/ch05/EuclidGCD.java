package ch05;

import java.util.Scanner;

// ��Ŭ���� ȣ�������� �ִ����� ���ϱ�
public class EuclidGCD {
	// ���� x, y�� �ִ������� ���Ͽ� ��ȯ�մϴ�.
	static int gcd(int x, int y) {
		if(y==0)
			return x;
		else
			return gcd(y, x%y);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ������� ���մϴ�.");
		System.out.print("���� x : "); int x = sc.nextInt();
		System.out.print("���� y : "); int y = sc.nextInt();
		
		System.out.println("�ִ� ������� " + gcd(x,y) +"�Դϴ�.");
	}
}
