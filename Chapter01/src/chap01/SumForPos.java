package chap01;

import java.util.Scanner;

public class SumForPos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		
		do { // n�� 0���� Ŭ ������ �ݺ�
			System.out.print("n�� �� : ");
			n = sc.nextInt();
		} while(n<=0);
		
		int sum=0;
		
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println("1���� " + n + "������ �� : " + sum);
		
		// �����Ǵ� �ݺ�(while, for)�� �����Ǵ� �ݺ�(do-while)
		// Q10. �� ���� a, b�� ������ �Է��ϰ� b-a�� ����ϴ� ���α׷��� �ۼ��϶�.
		System.out.println("�� ���� a, b�� �Է��Ͻÿ�.");
		int a, b;
		
		System.out.print("a�� �� : ");
		a = sc.nextInt();
		do {
			System.out.print("b�� �� : ");
			b = sc.nextInt();
			System.out.println("a���ٴ� ū ���� �Է��ϼ���!");
		} while(b<=a);
		System.out.println("b�� �� : " + b);
		int sub = b-a;
		System.out.println("b-a�� " + sub +"�Դϴ�.");
		
		
		// Q11. ���� ������ �Է��ϰ� �ڸ����� ����ϴ� ���α׷� �ۼ�.
		// ex) 135�� �Է��ϸ� '�� ���� 3�ڸ��Դϴ�.'��� ����ϰ�, 1314�� �Է��ϸ� '�� ���� 4�ڸ��Դϴ�.'��� ���
		System.out.print("\n���� ���� n: ");
		int bn = sc.nextInt();
		int cnt = 0;
		for(int i=1; i<=bn; i*=10) {
			cnt++;
			if(bn/i==1) System.out.println("�� ���� " + cnt + "�ڸ��Դϴ�.");
		}
		
		
		
	}
	
}
