package chap01;

import java.util.Scanner;

public class Multi99Table {
// ���߷����� ����ϴ� �˰����� ���� ����ǥ�� ����ϴ� ���α׷�
	static void squere(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("------------����ǥ------------");
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%3d", i*j);
			}
			System.out.println();
		}
		System.out.println();
		
		//Q12. ���м��� �ִ� ����ǥ�� ����ϴ� ���α׷��� �ۼ��϶�.
		System.out.println("-------------����ǥ-------------\n");
		for(int i=0; i<=9; i++) {
			if(i==0) System.out.print("   |");
			else System.out.printf("%3d", i);
		}
		System.out.println();
		for(int i=0; i<=9; i++) {
			if(i==1) System.out.print("+----");
			else System.out.print("---");
		}
		System.out.println();
		
		for(int i=1; i<=9; i++) {
			System.out.print(" " + i + " |");
			for(int j=1; j<=9; j++) {
				
				System.out.printf("%3d", i*j);
			}
			System.out.println();
		}
		System.out.println();
		
		// Q13. ���м��� �ִ� ����ǥ�� ����ϴ� ���α׷��� �ۼ��϶�.
		System.out.println("-------------����ǥ--------------\n");
		for(int i=0; i<=9; i++) {
			if(i==0) System.out.print("   |");
			else System.out.printf("%3d", i);
		}
		System.out.println();
		for(int i=0; i<=9; i++) {
			if(i==1) System.out.print("+----");
			else System.out.print("---");
		}
		System.out.println();
		
		for(int i=1; i<=9; i++) {
			System.out.print(" " + i + " |");
			for(int j=1; j<=9; j++) {
				
				System.out.printf("%3d", i+j);
			}
			System.out.println();
		}
		
		System.out.println();
		// Q14. �Է��� ���� �� ������ �ϴ� ���簢���� *��ȣ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("�簢���� ����մϴ�.");
		System.out.print("�� �� : ");
		int n = sc.nextInt();
		squere(n);
	}
	
	

}
