package chap02;

import java.util.Scanner;

public class DayOfYear {

	private static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	// ���
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}	// ����
	};
	
	// ���� year���� �����ΰ� (���� : 1 / ��� : 0)
	private static int isLeap(int year) {
		return (year%4==0 && year%100 !=0 || year%400==0) ? 1: 0;
	}
	
	// ���� y�� m�� d���� �� �� ��� �� ���� ����
	private static int dayOfYear(int y, int m, int d) {
		/*
		int days = d;		// �� ��
		
		for(int i=1; i<m; i++)
			days += mdays[isLeap(y)][i-1];
		return days;
		*/
		
		// Q8 �޼ҵ�
		int cnt = 1;
		while(cnt<m) {
			d += mdays[isLeap(y)][m-1];
			cnt++;
		}
		return d;
	}
	
	private static int leftDayOfYear(int y, int m, int d) {
		int days = d;
		for(int i=1; i<m; i++) 
			days += mdays[isLeap(y)][i-1];
			
		if(isLeap(y)==1) return 366-days;
		else return 365-days;
		
	}

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int retry;	// retry �ٽ��ѹ�?
		
		System.out.println("�� �� ��� �ϼ��� ���մϴ�.");
		
		do {
			System.out.print("�� : "); int year  = sc.nextInt();	// ��
			System.out.print("�� : "); int month = sc.nextInt();	// ��
			System.out.print("�� : "); int day  = sc.nextInt();	// ��
			
			System.out.printf("�� �� %d��°�Դϴ�.\n", dayOfYear(year, month, day));
			
			System.out.print("�ѹ� �� �ұ��? (1.��/ 0.�ƴϿ�.) : ");
			retry = sc.nextInt();
			
		} while(retry==1);
		System.out.println();
		
		
		// Q8. �޼��� dayOfYear�� ���� i�� days���� �����ϼ���. while���� ����Ͻÿ�.
		
		
		// Q9. y�� m�� d���� �� �� ���� �� ��(12�� 31���̸� 0, 12�� 30���̸� 1)�� ���ϴ� �Ʒ� �޼��带 �ۼ��ϼ���.
		// static int leftDayOfYear(int y, int m, int d)
		System.out.println("�� �� ���� �ϼ��� ���մϴ�.");
		
		do {
			System.out.print("�� : "); int year  = sc.nextInt();	// ��
			System.out.print("�� : "); int month = sc.nextInt();	// ��
			System.out.print("�� : "); int day  = sc.nextInt();	// ��
			
			System.out.printf("�� �� %d��° ���ҽ��ϴ�.\n", leftDayOfYear(year, month, day));
			
			System.out.print("�ѹ� �� �ұ��? (1.��/ 0.�ƴϿ�.) : ");
			retry = sc.nextInt();
			
		} while(retry==1);
	}

}
