package chap01;

import java.util.Scanner;

public class JudgeSign {
	// �Է��� �������� ������� �������� 0���� �Ǵ��մϴ�.

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻÿ�.");
		int n = sc.nextInt();
		
		if(n>0) System.out.println("�Է��� ������ ����Դϴ�.");
		else if(n<0) System.out.println("�Է��� ������ �����Դϴ�.");
		else System.out.println("�Է��� ������ 0�Դϴ�.");
		
	}
}
