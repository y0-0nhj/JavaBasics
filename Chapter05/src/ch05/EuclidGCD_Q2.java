package ch05;

import java.util.Scanner;

// 유클리드 호제법으로 최대공약수 구하기
public class EuclidGCD_Q2 {
	// 정수 x, y의 최대공약수를 구하여 반환합니다.
	static int gcd(int x, int y) {
		int num;
		while(y!=0) {
			num = y;
			y = x%y;
			x = num;	// swap기법 활용한 x 자리바꿈.
		}return x;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수의 최대공약수를 구합니다.");
		System.out.print("정수 x : "); int x = sc.nextInt();
		System.out.print("정수 y : "); int y = sc.nextInt();
		
		System.out.println("최대 공약수는 " + gcd(x,y) +"입니다.");
	}
}
