package chap02;

public class PrimeNumber2 {
	// 1,000 ������ �Ҽ��� ����(ver2.)		// ver1���� �ξ� ȿ������ �Ҽ� ���� ���.
	// 1.���� ���� ��� �˰����� �ϳ��� �ƴϴ�.
	// 2. ���� �˰����� �޸𸮸� ���̿䱸�Ѵ�.
	
	public static void main(String[] args) {
		int counter = 0;				// �������� Ƚ��
		int ptr = 0;					// ã�� �Ҽ��� ����
		int[] prime = new int[500];		// �Ҽ��� �����ϴ� �迭
		
		prime[ptr++] = 2;				// 2�� �Ҽ����� �ʱⰪ (���������ڸ� �̿�)
		
		for(int n=3; n<=1000; n+=2) {	// ����� Ȧ����
			int i;
			for(i=1; i<ptr; i++) {		// �̹� ã�� �Ҽ��� ������ ��
				counter++;
				if(n%prime[i] == 0)		// ����������� �Ҽ��� �ƴ�
					break;				// �� �̻��� �ݺ��� ���ʿ�
			}
			if(ptr==i)					// ���������� ����������� ����
				prime[ptr++] = n ;		// �Ҽ���� �迭�� ����
			}
			
			for(int i=0; i<ptr; i++) 	// ã�� ptr���� �Ҽ��� ��Ÿ��
				System.out.println(prime[i]);
			
			System.out.println("�������� ������ Ƚ�� : " + counter);
	}
}
