package chap01;

import java.util.Scanner;

public class Judge123A {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1) System.out.println("�� ���� 1�Դϴ�.");
		else if(n==2) System.out.println("�� ���� 2�Դϴ�.");
		else if(n==3) System.out.println("�� ���� 3�Դϴ�.");
		else ;	// ���鹮(������ �ƹ��͵� ���� �ʴ� ����)
	}
}
