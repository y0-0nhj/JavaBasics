package chap04;

import java.util.Scanner;

// Q1. IntStack�� ��� �޼��带 ����ϴ� ���α׷��� �ۼ��϶�.
public class IntStackTester_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println("���� ������ �� : "+s.size()+" / "+s.capacity());
			System.out.print("(1)Ǫ�� (2)�� (3)��ũ (4)���� (5)Ŭ���� (6)�˻� (0)���� : ");
			
			int menu = sc.nextInt();
			if(menu==0) break;
			
			int x = 0;
			switch(menu) {
			case 1 : 	// Ǫ��
				System.out.print("������ : ");
				x = sc.nextInt();
				
				try {
					s.push(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;
				
			case 2 : 	// ��
				try {
					x = s.pop();
				System.out.println("���� �����ʹ� "+x+"�Դϴ�.");
				} catch(IntStack.EmptyIntStackException e) {
					System.out.println("������ �����ϴ�.");
				}
				break;
				
			case 3 : 
				try {	// ��ũ
					x = s.peek();
				System.out.println("��ũ �����ʹ� "+x+"�Դϴ�.");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("������ �����ϴ�.");
				}
				break;
				
			case 4 :	// ����
				s.dump();
				break;
				
			case 5 : 	// Ŭ����
				s.clear();
				break;
				
			case 6 :	// �˻�
				System.out.print("������ : ");
				x = sc.nextInt();
				int idx = s.indexOf(x);
				if(idx==-1) System.out.println("�ε����� �������� �ʽ��ϴ�.");
				else System.out.println("�˻��� ������ "+ x +"�� �ε����� " + idx +"�Դϴ�.");
				break;
			}
			
			
		}
		
	}
	
}
