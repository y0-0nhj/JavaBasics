package chap03;

import java.util.Scanner;

public class SeqSearchSen {
// ���� �˻�(���ʹ�)
	
	// ��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���ʹ����� ���� �˻�.
	static int seqSearchSen(int[] a, int n, int key) {
	
		/* �⺻ ����
		   int i=0;
			
			a[n]=key;			// ���ʸ� �߰�
			
			while(true) {
				if(a[i]==key)	// �˻� ����
					break;
				i++;
			}
			return i==n? -1:i;
		 */
		
		// Q2 Ǯ��
		System.out.print("  |");
	    for (int i = 0; i < n; i++)
	      System.out.printf("%2d", i);
	    System.out.println();
	    System.out.print("--+");
	    for (int i = 0; i < n; i++)
	      System.out.print("--");
	    System.out.println();

	    for (int i = 0; i < n; i++) { 
	      System.out.print("  | ");
	      for (int j = 0; j < i; j++)
	        System.out.print("  ");
	      System.out.println("*");
	      System.out.printf("%2d|", i);
	      for (int j = 0; j < n; j++)
	        System.out.printf("%2d", a[j]);
	      System.out.println();
	      if (a[i] == key)
	        return i;
	    }
	    return -1;
	  }
		
	
		static int seqSearchFor(int[] a, int n, int key) {
			a[n]=key;
			for(int i=0; i<n; i++) 
				if(a[i]==key)
					return i;
				return -1;
		}
			
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = sc.nextInt();
		int[] x = new int[num+1];				// ��ڼ� num+1
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("�˻��� �� : ");		// Ű �� �Է�
		int key = sc.nextInt();
		
		int idx = seqSearchSen(x, num, key);	// �迭 x���� Ű ����  key�� ��Ҹ� �˻�
		
		if(idx==-1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(key+"��(��) x["+idx+"]�� �ֽ��ϴ�.");
	
		
		// Q1. �ǽ� 3-3�� seqSearchSen �޼��带 while���� �ƴ϶� for���� ����Ͽ� ������ ���α׷��� �ۼ��϶�.
		// static int seqSearchFor(int[] a, int n, int key)
		int idx2 = seqSearchFor(x, num, key);
		if(idx2==-1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(key+"��(��) x["+idx2+"]�� �ֽ��ϴ�.");

		
		// Q2. ���� �˻��� ��ĳ�� ������ ���ϰ� ����ϴ� ���α׷��� �ۼ��϶�.
		
		
	}

}
