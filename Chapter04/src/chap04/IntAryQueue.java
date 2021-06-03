package chap04;

import java.util.Scanner;

public class IntAryQueue {
	private int max;	// 큐 용량
	private int num;	// 현재 데이터 수
	private int[] que;	// 큐 본체
	
	// 실행 시 예외 : 큐가 비어있음.
	public class EmptyIntAryQueueException extends RuntimeException {
		public EmptyIntAryQueueException() {}
	}
	
	// 실행 시 예외 : 큐가 가득 참.
	public class OverflowIntAryQueueException extends RuntimeException {
		public OverflowIntAryQueueException() {}
	}
	
	// 생성자
	public IntAryQueue(int capacity) {
		num=0;
		max=capacity;
		try {
			que= new int[max];
		}catch(OutOfMemoryError e) {
			max=0;
		}
	}
	
	// 인큐
	public int inque(int x) throws OverflowIntAryQueueException {
		if(num>=max)	// 큐가 가득 참.
			throw new OverflowIntAryQueueException();
		return que[num++]= x;
		
	}
	
	// 디큐
	public int deque() throws EmptyIntAryQueueException {
		if(num<=0)	// 큐가 없음
			throw new EmptyIntAryQueueException();
		for(int i=0; i<num; i++) {
			que[i]=que[i+1];
		}
		return que[--num];
	}
	
	// 덤프
	public void dump() {
		if(num<=0)
			System.out.println("스택이 비어있습니다.");
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
		System.out.print("큐 용량 : ");
		int cap = sc.nextInt();
		IntAryQueue que = new IntAryQueue(cap);
		
		while(true) {
			System.out.println("현재 데이터 수 : "+que.size()+" / "+que.capacity());
			System.out.print("(1)인큐 (2)디큐 (3)덤프 (0)종료 : ");
			int menu = sc.nextInt();
			if(menu==0) break;
			int x = 0;
			switch (menu) {
			
			case 1:		// 인큐
				System.out.print("데이터 수 : ");
				x = sc.nextInt();
				try {
					que.inque(x);
				}catch(OverflowIntAryQueueException e) {
					System.out.println("큐가 가득찼습니다.");
				}
				break;
	
			case 2:		// 디큐
				try {	
					x = que.deque();
					System.out.println("디큐를 완료했습니다.");
				} catch(EmptyIntAryQueueException e) {
					System.out.println("큐가 존재하지 않습니다.");
				}
				break;
				
			case 3:
				que.dump();
				break;
			}
		
		}
		
	}
	
}
