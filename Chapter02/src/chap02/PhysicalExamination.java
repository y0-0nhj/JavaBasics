package chap02;

import java.util.Scanner;

// ��ü�˻� �����Ϳ� Ŭ���� �迭���� ��� Ű�� �÷��� ������ ����
public class PhysicalExamination {

	static final int VMAX = 21;	// �÷� ����(0.0���� 0.1������ 21��)
	
	static class PhyscData {
		String name;	// �̸�
		int height;		// Ű
		double vision;	// �÷�
	
		// ������
		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	// Ű�� ��հ��� ����
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;
		
		for(int i=0; i<dat.length; i++) {
			sum+=dat[i].height;
		}
		return sum / dat.length;
	}
	
	// �÷� ������ ����
	static void distVision(PhyscData[] dat, int[] dist) {
		int i=0;
		dist[i]=0;
		for(i=0; i<dat.length; i++)
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX/10.0)
				dist[(int)(dat[i].vision * 10)]++;
	}
	
	
	static class YMD {
		int year;	// ��
		int month;	// ��(1~12)
		int day;	// ��(1~31)
		
		static int isLeap(int year) {
			return (year%4==0 && year%100!=0 || year%400==0)? 1:0;
		}
		
		static int[][] mdays = {
				{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
				{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		};
		
		// ������
		YMD(int year, int month, int day) {
			this.year = year;
			this.month = month;
			this.day = day;
		}
		
		YMD after(int n){
			if(n < 0) return(before(-n));
			YMD result = new YMD(this.year, this.month, this.day);

			result.day += n;

			while(result.day > mdays[isLeap(result.year)][result.month - 1]){
				result.day -= mdays[isLeap(result.year)][result.month - 1];
				if(++result.month > 12){
					result.year++;
					result.month = 1;
				}
			}
			return result;
			
		}
		
		YMD before(int n){
			if(n < 0) return(after(-n));
			YMD result = new YMD(this.year, this.month, this.day);

			result.day -= n;

			while(result.day < 1){
				if(--result.month < 1){
					result.year--;
					result.month = 12;
				}
				result.day += mdays[isLeap(result.year)][result.month - 1];
			}

			return result;
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("������", 162, 0.3),
				new PhyscData("������", 173, 0.7),
				new PhyscData("������", 175, 2.0),
				new PhyscData("ȫ����", 171, 1.5),
				new PhyscData("�̼���", 168, 0.4),
				new PhyscData("�迵��", 174, 1.2),
				new PhyscData("�ڿ��", 169, 0.8),
		};
		
		int[] vdist = new int[VMAX];	// �÷� ����
		
		System.out.println("�� ��ü�˻� ����Ʈ ��");
		System.out.println(" �̸�	Ű     �÷�");
		System.out.println("-----------------");
		for(int i=0; i<x.length; i++) 
			System.out.printf("%-8s%3d%5.1f\n",
					x[i].name, x[i].height, x[i].vision);
		
		System.out.printf("\n��� Ű : %5.1fcm\n", aveHeight(x));
		
		distVision(x, vdist); 		// �÷º����� ����
		
		System.out.println("\n�÷� ����");
		for(int i=0; i<VMAX; i++) 
			System.out.printf("%3.1f~:%2d��\n", i/10.0, vdist[i]);
		
		
		// Q10. ��ȣ���� *�� �÷� ������ �ش��ϴ� ��� ����ŭ �ݺ��Ͽ� ��Ÿ����.
		System.out.println("\n�÷� ����");
		for(int i=0; i<VMAX; i++) {
			System.out.printf("%3.1f~: ", i/10.0);
				for(int j=0; j<vdist[i]; j++) {
					System.out.print("*");
				}
				System.out.println();
		}
		System.out.println();
		
		// Q11. ���� ������� �ʵ�� ���� Ŭ���� ����
		
		System.out.println("������� �Է��Ͻÿ�.");
		int y, m, d;
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
		
		YMD days = new YMD(y,m,d);
		
		int n;
		System.out.print("n�� �� : ");
		n = sc.nextInt();
		System.out.println();
		
		YMD d1 = days.after(n);
		System.out.printf("%d�� ���� ��¥�� %d�� %d�� %d���Դϴ�.\n", n, d1.year, d1.month, d1.day);
		
		YMD d2 = days.before(n);
		System.out.printf("%d�� ���� ��¥�� %d�� %d�� %d���Դϴ�.", n, d2.year, d2.month, d2.day);
		

	}

}
