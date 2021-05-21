package chap01;

import java.util.Scanner;

public class Multi99Table {
// 이중루프를 사용하는 알고리즘의 예로 곱셈표를 출력하는 프로그램
	static void squere(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("------------곱셈표------------");
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%3d", i*j);
			}
			System.out.println();
		}
		System.out.println();
		
		//Q12. 구분선이 있는 곱셈표를 출력하는 프로그램을 작성하라.
		System.out.println("-------------곱셈표-------------\n");
		for(int i=0; i<=9; i++) {
			if(i==0) System.out.print("   |");
			else System.out.printf("%3d", i);
		}
		System.out.println();
		for(int i=0; i<=9; i++) {
			if(i==1) System.out.print("+----");
			else System.out.print("---");
		}
		System.out.println();
		
		for(int i=1; i<=9; i++) {
			System.out.print(" " + i + " |");
			for(int j=1; j<=9; j++) {
				
				System.out.printf("%3d", i*j);
			}
			System.out.println();
		}
		System.out.println();
		
		// Q13. 구분선이 있는 덧셈표를 출력하는 프로그램을 작성하라.
		System.out.println("-------------덧셈표--------------\n");
		for(int i=0; i<=9; i++) {
			if(i==0) System.out.print("   |");
			else System.out.printf("%3d", i);
		}
		System.out.println();
		for(int i=0; i<=9; i++) {
			if(i==1) System.out.print("+----");
			else System.out.print("---");
		}
		System.out.println();
		
		for(int i=1; i<=9; i++) {
			System.out.print(" " + i + " |");
			for(int j=1; j<=9; j++) {
				
				System.out.printf("%3d", i+j);
			}
			System.out.println();
		}
		
		System.out.println();
		// Q14. 입력한 수를 한 변으로 하는 정사각형을 *기호로 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("사각형을 출력합니다.");
		System.out.print("단 수 : ");
		int n = sc.nextInt();
		squere(n);
	}
	
	

}
