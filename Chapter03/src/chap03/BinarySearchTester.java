package chap03;

import java.util.Arrays;
import java.util.Scanner;

// Arrays.binarySearch로 이진 검색
public class BinarySearchTester {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟 수: ");
		int num = sc.nextInt();
		int[] x = new int[num];			// 요솟수가 num인 배열
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0] : ");	// 배열의 첫 요소를 먼저 입력
		x[0] = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x["+i+"] : ");
				x[i]=sc.nextInt();
			} while(x[i] < x[i-1]);		// 바로 앞의 요소보다 작으면 다시 입력.
		}
		
		System.out.print("검색할 값 : ");	// 키 값을 입력 받음
		int key = sc.nextInt();
		
		int idx = Arrays.binarySearch(x, key);	// 배열 x에서 키 값이 key인 요소를 검색
		
		if(idx < 0)
			//System.out.println("그 값의 요소가 없습니다.");
			// Q6 풀이.
			System.out.println("검색에 실패였습니다.\n그 값의 요소가 없습니다.\n삽입포인트는 x["+(-idx-1)+"]입니다.");
		else
			System.out.println(key+"은(는) x["+idx+"]에 있습니다.");
		
		
		// Q6. 검색에 실패하면 삽입 포인트의 값을 출력하는 프로그램을 작성하라.
	}
	
}
