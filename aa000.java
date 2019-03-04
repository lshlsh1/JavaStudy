/*===========================
	���� ����޷� ����
============================*/

// ���� ��)
// ���������� �Է��ϼ��� : 2019
// �������� �Է��ϼ��� : 7
/*
	[ 2019�� 7�� ]
	
 �� �� ȭ �� �� �� ��
=======================
    1  2  3  4  5  6
 7  8  9 10 11 12 13
14 15 16 17 18 19 20
21 22 23 24 25 26 27
28 29 30 31
=======================
*/

import java.util.Scanner;

public class aa000
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int y,m,nalsu,w;
		
		do
		{
			System.out.print("���������� �Է��ϼ��� : ");
			y = sc.nextInt();
		}
		while (y<1);

		do
		{
			System.out.print("�������� �Է��ϼ��� : ");
			m = sc.nextInt();
		}
		while (m<1 || m>12);

		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if ( y%4==0 && y%100==0 || y%400==0)
		{
			days[1] = 29;
		}
		
		nalsu = (y-1)*365 +(y-1)/4 - (y-1)/100 + (y-1)/400;
		
		for (int i=0 ; i<m-1 ; i++ )
		{
			nalsu += days[i];
		}

		nalsu += 1;
		
		w=nalsu%7;

		System.out.print("\t [ "+y+"�� "+m+"�� ]");
		System.out.println();
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("=======================");

		for (int i=1; i<=w ; i++ )
		{
			System.out.print("    ");
		}
		for (int i=1 ; i<=days[m-1] ; i++)
		{
			System.out.printf("%4d",i);
			w++;
			if (w%7==0)
			{
				System.out.println();
			}
		}

		if (w%7!=0)
		{
			System.out.println();
		}
	}

}
		
		
	