package chap01;

import java.util.Scanner;

public class SumFor {
	
	private static void For(int n) {
		int sum = 0;
		for(int i=1; i<= n; i++) {
			sum += i;
			if(n==1)
				System.out.print(i + "=" + i);
			else if (i<n) System.out.print(i + " + " );
			else System.out.print(i+" = "+sum); 
		}
	}
	
	private static String Gauss(int n) {
		int sum = 0;
		sum = (1 + n) * (n/2);
		return "(1+"+ n +")*"+ n/2 + " = " + sum;
	}
	
	private static int sumof(int a, int b) {
		int sum = 0;
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		
		System.out.println("1���� " + n + "������ �� : " + sum);
		
		//Q7. n�� 7�̸� '1 + 2 + 3 + 4 + 5 + 6 + 7 = 28'�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		For(n);
		System.out.println();
		
		// Q8. 1���� 10������ ���� (1 + 10)*5�� ���� ������� ���� �� �ִ�.
		// ���콺�� �����̶�� ����� �̿��Ͽ� 1���� n������ ���� ���� ���ϴ� ���α׷��� �ۼ��϶�.
		System.out.println(Gauss(n));
		
		// Q9. ���� a,b�� �����Ͽ� �� ������ ��� ������ ���� ���Ͽ� ��ȯ�ϴ� �޼��带 �ۼ��϶�.
		// static int sumof(int a, int b)
		System.out.println("\n�� ���� a,b�� �Է��Ͻÿ�.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sumof(a,b);
		
	}

}
