package chap03;

import java.util.Scanner;

public class BinSearch_Q4 {

		static int binSearchSen(int[] a, int n, int key) {
	    int pl = 0;
	    int pr = n - 1;
	    
	    System.out.print("  |");
	    for (int i = 0; i < n; i++)
	      System.out.printf("%2d", i);
	    System.out.println();
	    System.out.print("--+");
	    for (int i = 0; i < n; i++)
	      System.out.print("--");
	    System.out.println();
	    
	    do {
	      int pc = (pl + pr) / 2;
	      
	      System.out.print("  |");
	      for (int i = 0; i < n; i++)
	        if (i == pc)
	          System.out.print(" +");
	        else if (i == pl)
	          System.out.print("<-"); 
	        else if (i == pr)
	          System.out.print("->");
	        else
	          System.out.print("  ");
	      System.out.println();
	      
	      System.out.printf("%2d|", pc);
	      for (int j = 0; j < n; j++)
	        System.out.printf("%2d", a[j]);
	      System.out.println();
	      
	      if (a[pc] == key)
	        return pc;
	      else if (a[pc] < key)
	        pl = pc + 1;
	      else
	        pr = pc - 1;
	          
	    } while (pl <= pr);
	    return -1;
	  }

	  public static void main(String[] args) {
	    Scanner stdIn = new Scanner(System.in);

	    System.out.print("��ڼ�: ");
	    int num =  stdIn.nextInt();
	    int[] x = new int[num + 1];

	    for (int i = 0; i < num; i++) {
	      System.out.print("x[" + i + "]: ");
	      x[i] = stdIn.nextInt();
	    }

	    System.out.print("�˻��� ��: ");
	    int ky = stdIn.nextInt();
	    int idx = binSearchSen(x, num, ky);

	    if (idx ==  -1)
	      System.out.println("�� ���� ��Ұ� �����ϴ�.");
	    else
	      System.out.println(ky + "��(��) x["+ idx + "]�� �ֽ��ϴ�.");

	  }
	}
