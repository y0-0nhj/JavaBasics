package chap03;

import java.util.Scanner;

public class SeqSearchSen {
// 선형 검색(보초법)
	
	// 요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색.
	static int seqSearchSen(int[] a, int n, int key) {
	
		/* 기본 예제
		   int i=0;
			
			a[n]=key;			// 보초를 추가
			
			while(true) {
				if(a[i]==key)	// 검색 성공
					break;
				i++;
			}
			return i==n? -1:i;
		 */
		
		// Q2 풀이
		System.out.print("  |");
	    for (int i = 0; i < n; i++)
	      System.out.printf("%2d", i);
	    System.out.println();
	    System.out.print("--+");
	    for (int i = 0; i < n; i++)
	      System.out.print("--");
	    System.out.println();

	    for (int i = 0; i < n; i++) { 
	      System.out.print("  | ");
	      for (int j = 0; j < i; j++)
	        System.out.print("  ");
	      System.out.println("*");
	      System.out.printf("%2d|", i);
	      for (int j = 0; j < n; j++)
	        System.out.printf("%2d", a[j]);
	      System.out.println();
	      if (a[i] == key)
	        return i;
	    }
	    return -1;
	  }
		
	
		static int seqSearchFor(int[] a, int n, int key) {
			a[n]=key;
			for(int i=0; i<n; i++) 
				if(a[i]==key)
					return i;
				return -1;
		}
			
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num+1];				// 요솟수 num+1
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");		// 키 값 입력
		int key = sc.nextInt();
		
		int idx = seqSearchSen(x, num, key);	// 배열 x에서 키 값이  key인 요소를 검색
		
		if(idx==-1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(key+"은(는) x["+idx+"]에 있습니다.");
	
		
		// Q1. 실습 3-3의 seqSearchSen 메서드를 while문이 아니라 for문을 사용하여 수정한 프로그램을 작성하라.
		// static int seqSearchFor(int[] a, int n, int key)
		int idx2 = seqSearchFor(x, num, key);
		if(idx2==-1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(key+"은(는) x["+idx2+"]에 있습니다.");

		
		// Q2. 선형 검색의 스캐닝 과정을 상세하게 출력하는 프로그램을 작성하라.
		
		
	}

}
