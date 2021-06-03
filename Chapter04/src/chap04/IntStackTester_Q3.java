package chap04;

public class IntStackTester_Q3 {

	// Q3. �ϳ��� �迭�� �����Ͽ� 2���� ������ �����ϴ� int�� �����Ϳ� ���� Ŭ������ ����ÿ�.
	// ���ÿ� �����ϴ� �����ʹ� int�� ������ �Ʒ� �׸�ó�� �迭�� ó���� ���� ����϶�.
	private int max;	// ���� �뷮
	private int ptrA;	// ���� ������
	private int ptrB;
	private int[] stk;	// ���� ��ü
	
	public enum WhichStack {stackA, stackB}
	
	// ���� �� ���� : ������ �������.
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	// ���� �� ���� : ������ ���� ��.
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}
	
	public IntStackTester_Q3(int capacity) {
		ptrA=0;
		ptrB=capacity-1;	// ptr�� �ε���
		max = capacity;
		try {
			stk = new int[max];
		} catch(OutOfMemoryError e) {
			max=0;
		}
	}
	
	public int push(WhichStack stack, int x) throws OverflowIntStackException {
		if(ptrA>=ptrB+1) {
			throw new OverflowIntStackException();
		}
		switch (stack) {
		case stackA:
			return stk[ptrA++] = x;
		default:
			return stk[ptrB--] = x;
			
		}
	}
	
	public int pop(WhichStack stack) throws EmptyIntStackException {
		switch (stack) {
	      case stackA:
	        if (ptrA <= 0)
	          throw new EmptyIntStackException();
	        return stk[--ptrA];
	      default:
	        if (ptrB >= max - 1)
	          throw new EmptyIntStackException();
	        return stk[++ptrB];
	    }
	  }
	  
	  public int peek(WhichStack stack) throws EmptyIntStackException {
	    switch (stack) {
	      case stackA:
	        if (ptrA == 0)
	          throw new EmptyIntStackException();
	        return stk[ptrA - 1];
	      default:
	        if (ptrB == max - 1)
	          throw new EmptyIntStackException();
	        return stk[ptrB + 1];
	    }
	  }
	  
	  public int indexOf(WhichStack stack, int key) {
	    switch(stack) {
	      case stackA:
	        for (int i = ptrA - 1; i <= 0; i--) {
	          if (stk[i] == key)
	            return i;
	        }
	        break;
	      default:
	        for (int i = ptrB + 1; i > max; i++) {
	          if (stk[i] == key)
	            return i;
	        }
	        break;
	    }
	    return -1;
	    
	  }
	  
	  public void clear(WhichStack stack) {
	    switch (stack) {
	      case stackA:
	        ptrA = 0;
	        break;
	      default:
	        ptrB = max;
	    }
	  }
	  
	  public int capacity() {
	    return max;
	  }
	  
	  public int size(WhichStack stack) {
	    switch (stack) {
	      case stackA:
	        return ptrA;
	      default:
	        return max - ptrB - 1;
	    }
	  }
	  
	  public boolean isEmpty(WhichStack stack) {
	    switch (stack) {
	      case stackA:
	        return ptrA <= 0;
	      default:
	        return ptrB >= max - 1;
	    }
	  }
	  
	  public boolean isFull() {
	    return ptrA >= ptrB + 1;
	  }
	  
	  // ���� ���� ��� �����͸� �ٴ� -> ����� ������ ���
	  public void dump(WhichStack stack) {
	    switch (stack) {
	      case stackA:
	        if (ptrA <= 0)
	          System.out.println("������ ����ֽ��ϴ�.");
	        else {
	          for (int i = 0; i < ptrA; i++)
	            System.out.println(stk[i] + " ");
	          System.out.println();
	        }
	        break;
	      default:
	        if (ptrB >= max)
	          System.out.println("������ ����ֽ��ϴ�.");
	        else {
	          for (int i = max; i > ptrB; i--)
	            System.out.println(stk[i] + " ");
	          System.out.println();
	        }
	        break;
	    }
	  }
	
	}
	
