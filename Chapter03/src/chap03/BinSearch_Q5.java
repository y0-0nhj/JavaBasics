package chap03;

import java.util.Scanner;

// 검색할 값과 같은 값을 갖는 요소가 하나 이상일 경우 그 요소 중에서 맨 앞의 요소를 찾지 못하는데, 맨 앞의 요소를  찾는 binSearchX 메서드를 작성하라
public class BinSearch_Q5 {

		  static int binSearchX(int[] a, int n, int key) {
		    int pl  = 0;
		    int pr = n  -1;

		    do {
		      int pc = (pl + pr) / 2;
		      if (a[pc] == key) {
		        int idx = pc;
		        while (a[idx] == key) {
		          idx--;
		        }
		        return idx + 1;
		      }
		      else if (a[pc] < key)
		        pl = pc + 1;
		      else
		        pr = pc - 1;
		    } while (pl <=  pr);
		    return -1;
		  }

		  public static void main(String[] args) {
		    Scanner stdIn = new Scanner(System.in);

		    System.out.print("요솟수: ");
		    int num = stdIn.nextInt();
		    int[] x = new int[num];

		    System.out.println("오름차순으로 입력하세요.");

		    System.out.print("x[0]: ");
		    x[0] = stdIn.nextInt();

		    for (int i = 1; i < num; i++) {
		      do {
		        System.out.print       ("x[" + i + "]: ");
		        x[i] = stdIn.nextInt();
		      } while (x[i] < x[i - 1]);
		    }

		    System.out.print("검색할 값: ");
		    int ky = stdIn.nextInt();

		    int idx = binSearchX(x, num, ky);

		    if (idx == - 1)
		      System.out.println("그 값의 요소가 없습니다.");
		    else
		      System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
		  }
		}

