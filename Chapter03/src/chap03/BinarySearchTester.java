package chap03;

import java.util.Arrays;
import java.util.Scanner;

// Arrays.binarySearch�� ���� �˻�
public class BinarySearchTester {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� ��: ");
		int num = sc.nextInt();
		int[] x = new int[num];			// ��ڼ��� num�� �迭
		
		System.out.println("������������ �Է��ϼ���.");
		
		System.out.print("x[0] : ");	// �迭�� ù ��Ҹ� ���� �Է�
		x[0] = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x["+i+"] : ");
				x[i]=sc.nextInt();
			} while(x[i] < x[i-1]);		// �ٷ� ���� ��Һ��� ������ �ٽ� �Է�.
		}
		
		System.out.print("�˻��� �� : ");	// Ű ���� �Է� ����
		int key = sc.nextInt();
		
		int idx = Arrays.binarySearch(x, key);	// �迭 x���� Ű ���� key�� ��Ҹ� �˻�
		
		if(idx < 0)
			//System.out.println("�� ���� ��Ұ� �����ϴ�.");
			// Q6 Ǯ��.
			System.out.println("�˻��� ���п����ϴ�.\n�� ���� ��Ұ� �����ϴ�.\n��������Ʈ�� x["+(-idx-1)+"]�Դϴ�.");
		else
			System.out.println(key+"��(��) x["+idx+"]�� �ֽ��ϴ�.");
		
		
		// Q6. �˻��� �����ϸ� ���� ����Ʈ�� ���� ����ϴ� ���α׷��� �ۼ��϶�.
	}
	
}
