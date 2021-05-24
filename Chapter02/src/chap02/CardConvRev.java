package chap02;

import java.util.Scanner;

// �Է� ���� 10������ 2���� ~ 36������ ��� ��ȯ�Ͽ� ��Ÿ��
public class CardConvRev {

	private static int cardConvR(int x, int r, char[] d) {
		// ������ x�� r������ ��ȯ�Ͽ� �迭 d�� �Ʒ��ڸ����� �־�ΰ� �ڸ����� ��ȯ�մϴ�.
		int digits = 0;						 	// ��ȯ ���� �ڸ� ��
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r); 	// r�� ���� �������� ����
			x /= r;
		} while(x != 0);
		return digits;
	}
	
	private static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r); 	// r�� ���� �������� ����
			x /= r;
		} while(x != 0);
		
		for(int i=0; i<digits/2; i++) {
			char temp = d[i];
			d[i] = d[digits-i-1];
			d[digits-i-1] = temp;
		}
		return digits;
		
	}
	
	private static int cardConvProcess(int x, int r, char[] d) {
		// ������ x�� r������ ��ȯ�Ͽ� �迭 d�� �Ʒ��ڸ����� �־�ΰ� �ڸ����� ��ȯ�մϴ�.
		int digits = 0;						 	// ��ȯ ���� �ڸ� ��
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.printf(r + "|%3d\n",x);
		System.out.print("+-----\n");
		
		do {
			d[digits++] = dchar.charAt(x % r); 	// r�� ���� �������� ����
			if(x/r == 0)
				System.out.printf(" %3d ... %d\n", x/r, x%r);
			else {
				System.out.printf(r + "|%3d ... %d\n", x/r, x%r);
				System.out.print("+-----\n");
			}
			x /= r;
		} while(x != 0);
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;						// ��ȯ�ϴ� ����
		int cd;						// ���
		int dno;					// ��ȯ ���� �ڸ���
		int retry;					// retry
		char[] cno = new char[32];	// ��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ������ �迭
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ���� : ");
				no = sc.nextInt();
			} while(no < 0);
			
			do {
				System.out.print("� ������ ��ȯ�ұ�� ? (2~36) : ");
				cd = sc.nextInt();
			} while(cd<2 || cd>36);
			
			dno = cardConvR(no, cd, cno);		// no�� cd������ ��ȯ.
			
			System.out.print(cd + "�����δ� ");
			for(int i = dno - 1; i>=0; i--)		// ���ڸ����� ���ʷ� ��Ÿ��.
				System.out.print(cno[i]);
			System.out.println("�Դϴ�.");
			
			System.out.print("�ѹ� �� �ұ��? (1.��/0.�ƴϿ�) : ");
			retry = sc.nextInt();
		} while (retry == 1);
		System.out.println();
		
		
		// Q6. �迭�� ���ʿ� �Ʒ��ڸ��� �ƴ϶� ���ڸ��� �־�δ� �޼��带 �ۼ��϶�.
		// static int cardConv(int x, int r, char[] d)
		System.out.println("�迭�� ���ʿ� ���ڸ��� �־�δ� �޼��带 �̿��Ͽ� 10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ���� : ");
				no = sc.nextInt();
			} while(no < 0);
			
			do {
				System.out.print("� ������ ��ȯ�ұ�� ? (2~36) : ");
				cd = sc.nextInt();
			} while(cd<2 || cd>36);
			
			dno = cardConv(no, cd, cno);		// no�� cd������ ��ȯ.
			
			System.out.print(cd + "�����δ� ");
			for(int i = dno - 1; i>=0; i--)		// �Ʒ��ڸ����� ���ʷ� ��Ÿ��.
				System.out.print(cno[i]);
			System.out.println("�Դϴ�.");
			
			System.out.print("�ѹ� �� �ұ��? (1.��/0.�ƴϿ�) : ");
			retry = sc.nextInt();
		} while (retry == 1);
		System.out.println();
		
		
		// Q7. �����ȯ ������ �ڼ��� ��Ÿ���� ���α׷��� �ۼ��϶�.
		System.out.println("10������ ��� ��ȯ�մϴ�.");
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ���� : ");
				no = sc.nextInt();
			} while(no < 0);
			
			do {
				System.out.print("� ������ ��ȯ�ұ�� ? (2~36) : ");
				cd = sc.nextInt();
			} while(cd<2 || cd>36);
			
			dno = cardConvProcess(no, cd, cno);		// no�� cd������ ��ȯ.
			
			System.out.print(cd + "�����δ� ");
			for(int i = dno - 1; i>=0; i--)		// ���ڸ����� ���ʷ� ��Ÿ��.
				System.out.print(cno[i]);
			System.out.println("�Դϴ�.");
	}
}
