package chap03;

import java.util.Scanner;

// ���� �˻�
public class SeqSearch {
	// ��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���� �˻��մϴ�.
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while(true) {
			if(i==n)
				return -1;	// �˻� ����(-1�� ��ȯ)
			if(a[i]==key)
				return i;	// �˻� ����(�ε����� ��ȯ)
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = sc.nextInt();
		int[] x = new int[num];				// ��ڼ��� num�� �迭 x
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("�˻��� �� : ");		// Ű �� �Է�
		int key = sc.nextInt();
		
		int idx = seqSearch(x, num, key);	// �迭 x���� Ű ����  key�� ��Ҹ� �˻�
		
		if(idx==-1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(key+"��(��) x["+idx+"]�� �ֽ��ϴ�.");
	}
}