package chap01;

import java.util.Scanner;

public class Digits {
	// �Է��� ���� 2�ڸ��� ����� �����ϴ� ���α׷�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("�� �ڸ��� ������ �Է��Ͻÿ�.");
		
		do {
			System.out.print("�Է� : ");
			n = sc.nextInt();
			
		} while(!(n>=10 && n<=99)); // ��𸣰� ��Ģ
		//while(n<10 || n>99); 
		
		System.out.println("���� n�� ���� " + n + "��(��) �Ǿ����ϴ�.");
	}

}
