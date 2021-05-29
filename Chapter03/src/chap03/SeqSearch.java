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
	
	// Q3 Ǯ��
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int cnt=0;
		for(int i=0; i<n; i++) {
			if(a[i]==key) {
				idx[cnt] = i;
				cnt++;
			}
		}
		
		System.out.print("idx[] = ");
		System.out.print("{"+idx[0]);
		for(int i=1; i<cnt; i++) 
			System.out.print(", "+idx[i]);
		System.out.print("}");

		return cnt;
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
		System.out.println();
		
		// Q3. ��ڼ��� n�� �迭 a���� key�� ��ġ�ϴ� ��� ����� �ε����� �迭 idx�� �� �պ��� ������� �����ϰ�,
		// ��ġ�� ��ڼ��� ��ȯ�ϴ� �޼��带 �ۼ��϶�.
		// ���� ��� ��ڼ��� 8�� �迭 a�� ��Ұ� {1, 9, 2, 9, 4, 6, 7, 9}�̰�
		// key�� 9�� �迭 idx�� {1, 3, 7}�� �����ϰ� 3�� ��ȯ�մϴ�.
		int[] idx2 = new int[num];
		System.out.println("\n�迭 idx�� ���� : "+searchIdx(x, num, key, idx2));
	
		
	}
	
}
