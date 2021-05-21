package chap01;

import java.util.Scanner;

public class Digits {
	// 입력한 값을 2자리의 양수로 제한하는 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("두 자리의 정수를 입력하시오.");
		
		do {
			System.out.print("입력 : ");
			n = sc.nextInt();
			
		} while(!(n>=10 && n<=99)); // 드모르간 법칙
		//while(n<10 || n>99); 
		
		System.out.println("변수 n의 값은 " + n + "가(이) 되었습니다.");
	}

}
