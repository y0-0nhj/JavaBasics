package chap04;

import java.util.Scanner;

public class IntAryQueue {
	private int max;	// ť �뷮
	private int num;	// ���� ������ ��
	private int[] que;	// ť ��ü
	
	// ���� �� ���� : ť�� �������.
	public class EmptyIntAryQueueException extends RuntimeException {
		public EmptyIntAryQueueException() {}
	}
	
	// ���� �� ���� : ť�� ���� ��.
	public class OverflowIntAryQueueException extends RuntimeException {
		public OverflowIntAryQueueException() {}
	}
	
	// ������
	public IntAryQueue(int capacity) {
		num=0;
		max=capacity;
		try {
			que= new int[max];
		}catch(OutOfMemoryError e) {
			max=0;
		}
	}
	
	// ��ť
	public int inque(int x) throws OverflowIntAryQueueException {
		if(num>=max)	// ť�� ���� ��.
			throw new OverflowIntAryQueueException();
		return que[num++]= x;
		
	}
	
	// ��ť
	public int deque() throws EmptyIntAryQueueException {
		if(num<=0)	// ť�� ����
			throw new EmptyIntAryQueueException();
		for(int i=0; i<num; i++) {
			que[i]=que[i+1];
		}
		return que[--num];
	}
	
	// ����
	public void dump() {
		if(num<=0)
			System.out.println("������ ����ֽ��ϴ�.");
		for(int i=0; i<num; i++) {
			System.out.print(que[i]+" ");
		}
		System.out.println();
	}
	
	public int size() {
		return num;
	}
	
	public int capacity() {
		return max;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ť �뷮 : ");
		int cap = sc.nextInt();
		IntAryQueue que = new IntAryQueue(cap);
		
		while(true) {
			System.out.println("���� ������ �� : "+que.size()+" / "+que.capacity());
			System.out.print("(1)��ť (2)��ť (3)���� (0)���� : ");
			int menu = sc.nextInt();
			if(menu==0) break;
			int x = 0;
			switch (menu) {
			
			case 1:		// ��ť
				System.out.print("������ �� : ");
				x = sc.nextInt();
				try {
					que.inque(x);
				}catch(OverflowIntAryQueueException e) {
					System.out.println("ť�� ����á���ϴ�.");
				}
				break;
	
			case 2:		// ��ť
				try {	
					x = que.deque();
					System.out.println("��ť�� �Ϸ��߽��ϴ�.");
				} catch(EmptyIntAryQueueException e) {
					System.out.println("ť�� �������� �ʽ��ϴ�.");
				}
				break;
				
			case 3:
				que.dump();
				break;
			}
		
		}
		
	}
	
}
