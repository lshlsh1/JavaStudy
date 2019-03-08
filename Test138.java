/*============================================
	���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- Calendar Ŭ����
============================================*/

/*
�� java.util.Calendar Ŭ������ 
	��¥�� �ð��� ��ü �𵨸�ȭ �� Ŭ������
	��, ��, ��, ����, ��, �� �� ������
	�ð��� ��¥�� ���õ� ������ �����Ѵ�
	��� Calendar Ŭ������ �߻�Ŭ�����̹Ƿ� ���� ��ü�� ������ �� ������
	�������� �޼ҵ� ������ Calendar Ŭ������ ���� Ŭ������
	��GregorinCalendar��Ŭ������ ���ǵǾ� �ִ�.

	�ý������κ��� ���� �ý��� �ð� ������ ���� ��
	getInstance()��� ����(static) �޼ҵ带 �̿��Ͽ� ��ü�� ������ �� �ִ�.
	������ Calendar Ŭ���� ��ü�� �ý����� ���� ��¥�� �ð� ������ ������
	�� ��ü�� �����Ǹ� ���� �ִ� �ð� ��������
	get() �޼ҵ带 �̿��Ͽ� ���� ������(�����) �� �ִ�.

	getInstance() �޼ҵ�� ���������� GregorianCalendar ��ü�� �����Ͽ�
	�����ֱ� ������ GregorianCalendar ��ü�� ���� �����Ͽ� �ð� ������
	���� ���� �ִ�.
*/
/*
// �� �ǽ� ����
//	  ����ڷκ��� ��, ���� �Է¹޾�
//	  �ش� �� ���� �޷��� �׷��ִ�(����ϴ�) ���α׷��� �����Ѵ�.
//	  ��, Calendar Ŭ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ���� �Է� : 0
// ���� �Է� : 2019
// �� �Է� : -2
// �� �Է� : 16
// �� �Է� : 7

	[ 2019�� 7�� ]
	
 �� �� ȭ �� �� �� ��
=======================
    1  2  3  4  5  6
 7  8  9 10 11 12 13
14 15 16 17 18 19 20
21 22 23 24 25 26 27
28 29 30 31
=======================
����Ϸ��� �ƹ�Ű��....
*/
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test138
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int y,m;
		int w;
		do
		{
			System.out.print("���� �Է� :");
			y = sc.nextInt();
		}
		while (y<1);

		do
		{
			System.out.print("�� �Է� : ");
			m = sc.nextInt();
		}
		while (m<1 || m>12);
		
		Calendar cal = new GregorianCalendar();
		cal.set(y, m-1, 1);

		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if( y%4==0 || y!=100 || y%400==0 )
		{
			days[1]=29;
		}

		w = cal.get(Calendar.DAY_OF_WEEK)-1; // Calendar�� �Ͽ����� 1, �츮�� �Ͽ����� 0�̹Ƿ� -1

		
		System.out.println();
		System.out.println("\t [ "+y+"�� "+m+"�� ]");
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("=============================");
		
		for (int n=1 ; n<=w ; n++ )
		{
			System.out.print("    ");
		}

		for (int n=1; n<=cal.getActualMaximum(Calendar.DATE) ; n++ )
		{
			w++;
			System.out.printf("%4d",n);
			if (w%7==0)
			{
				System.out.println();
			}
		}
		
		if(w%7!=0);
			System.out.println();

		System.out.println("=============================");


		
	}
}


