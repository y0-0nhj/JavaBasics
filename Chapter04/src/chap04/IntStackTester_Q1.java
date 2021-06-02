package chap04;

import java.util.Scanner;

// Q1. IntStack의 모든 메서드를 사용하는 프로그램을 작성하라.
public class IntStackTester_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println("현재 데이터 수 : "+s.size()+" / "+s.capacity());
			System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)클리어 (6)검색 (0)종료 : ");
			
			int menu = sc.nextInt();
			if(menu==0) break;
			
			int x = 0;
			switch(menu) {
			case 1 : 	// 푸시
				System.out.print("데이터 : ");
				x = sc.nextInt();
				
				try {
					s.push(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
				
			case 2 : 	// 팝
				try {
					x = s.pop();
				System.out.println("팝한 데이터는 "+x+"입니다.");
				} catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 없습니다.");
				}
				break;
				
			case 3 : 
				try {	// 피크
					x = s.peek();
				System.out.println("피크 데이터는 "+x+"입니다.");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 없습니다.");
				}
				break;
				
			case 4 :	// 덤프
				s.dump();
				break;
				
			case 5 : 	// 클리어
				s.clear();
				break;
				
			case 6 :	// 검색
				System.out.print("데이터 : ");
				x = sc.nextInt();
				int idx = s.indexOf(x);
				if(idx==-1) System.out.println("인덱스가 존재하지 않습니다.");
				else System.out.println("검색한 데이터 "+ x +"의 인덱스는 " + idx +"입니다.");
				break;
			}
			
			
		}
		
	}
	
}
