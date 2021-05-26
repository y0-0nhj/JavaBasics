package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
	// 배열의 최댓값을 구하여 반환합니다.
	private static int maxOf(int[] a) {
		int max = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) max = a[i];
		}
		return max;
	}
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수: ");
		int num = sc.nextInt();			// 배열의 요솟수를 입력 받음.
		
		int[] height = new int[num];	// 요솟수가 num인 배열을 생성
		
		System.out.println("키 값은 아래와 같습니다.");
		for(int i=0; i<height.length; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] : " + height[i]);
			
		}
		System.out.println("사람들 중 가장 큰 키는 " + maxOf(height) + "입니다.");
	
		// Q1. 키뿐만 아니라 사람 수도 난수로 생성하도록 프로그램을 작성하라.
		System.out.println("\n---- 사람 수를 난수로 설정 ----");
		Random n = new Random();
		int num2 = 1 + n.nextInt(30);		// 1부터 30까지의 사람 수를 나타내는 난수
		System.out.println("사람 수: " + num2);
		int[] height2 = new int[num2];		// 요솟수가 num2인 배열을 생성
		
		System.out.println("키 값은 아래와 같습니다.");
		for(int i=0; i<height2.length; i++) {
			height2[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] : " + height2[i]);
			
		}
		System.out.println("사람들 중 가장 큰 키는 " + maxOf(height2) + "입니다.");

	}
}
