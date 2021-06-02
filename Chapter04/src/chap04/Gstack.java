package chap04;

import chap04.IntStack.EmptyIntStackException;

// Q2. ������ ��ü�� �����͸� ���� �� �ִ� ���פĸ� ���� Ŭ���� Gstack<E>�� �ۼ��϶�.
public class Gstack<E> {
	private int max;	// ���� �뷮
	private int ptr;	// ���� ������
	private E[] stk;	// ���� ��
	
	public static class EmptyGstackException extends RuntimeException {
		public EmptyGstackException() {}
	}
	
	public static class OverflowGstackException extends RuntimeException {
		public OverflowGstackException() {}
	}
	
	// ������
	public Gstack(int capacity) {
		ptr=0;
		max = capacity;
		try {
			stk = (E[])new Object[max];		// ���� ��ü�� �迭 ����
		}catch(OutOfMemoryError e) {		// ������ �� ����
			max = 0;			
		}
	}
	
	public E push(E x) throws OverflowGstackException {
		if(ptr >= max)	// ������ ���� ��
			throw new OverflowGstackException();
		return stk[ptr++] = x;
	}
	
	// ���ÿ��� �����͸� ��(���� �ִ� �����͸� ����)
	public E pop(E x) throws EmptyGstackException {
			if(ptr <= 0)	// ������ �������
				throw new EmptyGstackException();
			return stk[--ptr];
		}
		
		// ���ÿ��� �����͸� ��ũ(���� �ִ� �����͸� �鿩�� ��)
		public E peek(E x) throws EmptyGstackException {
			if(ptr <= 0)	// ������ �������
				throw new EmptyGstackException();
			return stk[ptr-1];
		}
		
		// ���ÿ��� x�� ã�� �ε���(������ -1)�� ��ȯ
		public int indexOf(E x) {
			for(int i= ptr-1; i>=0; i--) 	//���� �ʿ��� ���� �˻�
				if(stk[i]==x)
					return i;	// �˻� ����
			return -1;			// �˻� ����
		}
		
		// ������ ���
		public void clear() {
			ptr=0;
		}
		
		// ������ �뷮�� ��ȯ
		public int capacity() {
			return max;
		}
		
		// ���ÿ� �׿��ִ� ������ ���� ��ȯ
		public int size() {
			return ptr;
		}
		
		// ������ ����ִ°�?
		public boolean isEmpty() {
			return ptr<=0;
		}
		
		// ������ ���� á�°�?
		public boolean isFull() {
			return ptr>= max;
		}
		
		// ���� ���� ��� �����͸� �ٴ� -> ����� ������ ���
		public void dump() {
			if(ptr<=0)
				System.out.println("������ ��� �ֽ��ϴ�.");
			else {
				for(int i=0; i<ptr; i++) 
					System.out.print(stk[i]+ " ");
				System.out.println();
				
			}
		}

}

