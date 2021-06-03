package chap04;

// int�� ť
public class IntQueue {
	private int max; 	//ť�� �뷮
	private int front;	// ù��° ��� Ŀ��
	private int rear;	// ������ ��� Ŀ��
	private int num;	// ���� ������ ��
	private int[] que;	// ť ��ü
	
	// ���� �� ���� : ť�� �������.
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	// ���� �� ���� : ť�� ���� ��.
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	// ������
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];			// ť ��ü�� �迭 ����
		}catch(OutOfMemoryError e) {	// ������ �� ����
			max = 0;
		}
	}
}
