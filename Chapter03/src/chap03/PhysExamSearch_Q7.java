package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


//��ü�˻� ������ �迭���� ���� �˻��ϱ�

public class PhysExamSearch_Q7 {
	// Q7. �÷¿� ���� �������� ������ ��ü�˻� �����Ϳ��� Ư�� �÷��� ���� ����� �˻��ϴ� ���α׷��� �ۼ��϶�.
	
		// ��ü�˻� ������ ����
		static class PhyscData {
			private String name;	// Ű
			private int height;		// �̸�
			private double vision;	// �÷�
			
			// ������
			public PhyscData(String name, int height, double vision) {
				this.name=name;
				this.height=height;
				this.vision=vision;
			}
			
			// ���ڿ��� ��ȯ�ϴ� �޼���(���� Ȯ�ο�)
			public String toString() {
				return name + " " + height + " " + vision;
			}
			
			// ������������ �����ϱ� ���� comparator
			public static final Comparator<PhyscData> VISION_ORDER
			= new VisionOrderComparator();
			
			private static class VisionOrderComparator implements Comparator<PhyscData> {
				public int compare(PhyscData d1, PhyscData d2) {
					return  (d1.vision<d2.vision) ?  1 :
							(d1.vision>d2.vision) ? -1 : 0;
				}
			}
			
		public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);
			PhyscData[] x = {	// �÷��� ������������ ���ĵǾ� �ֽ��ϴ�.
					new PhyscData("�̳���", 162, 2.0),
					new PhyscData("������", 168, 1.5),
					new PhyscData("���Ѱ�", 169, 1.2),
					new PhyscData("ȫ�ر�", 171, 1.0),
					new PhyscData("������", 173, 0.8),
					new PhyscData("��ȣ��", 174, 0.7),
					new PhyscData("�̼���", 175, 0.3),
			};
			System.out.print("�÷��� ���� ����� ã���ֳ� ? : ");
			double vision = sc.nextDouble();
			int idx = Arrays.binarySearch(
					x,
					new PhyscData("", 0, vision),
					PhyscData.VISION_ORDER
			);
			
			if(idx < 0)
				System.out.println("��Ұ� �����ϴ�.");
			else {
				System.out.println("x["+idx+"]�� �ֽ��ϴ�.");
				System.out.println("ã�� ������ : " + x[idx]);
			}
			
			
		}
	}
}

