/*====================================
	���� Ŭ������ �ν��Ͻ� ����
	- Ŭ���� ����
	- �迭 Ȱ��
====================================*/

// �� �ǽ� ����
// �Ʒ��� Ŭ����(WeekDay)�� �ϼ��Ѵ�.
// ����ڷκ��� ��, ��, ���� �Է¹޾�.
// �ش� ��¥�� ������ ����ϴ� ���α׷��� �����Ѵ�.
// ��, �޷� Ŭ����(Calender)�� ������� �ʴ´�.
// ����, Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// �׸���, �迭�� ���䵵 ������� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// �� �� �� �Է�(���鱸��) :

// >> 2019�� 2�� 26�� �� ȭ����
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� ���� �ν� �� �м�
//	  - ���� �� ����� ���� ����
//	  - 1�� 1�� 1�� �� ������

import java.util.Scanner;

class WeekDay
{
	// �ֿ� ���� ����(�Ӽ� ����)
	private int y, m, d;	//-- ����ڰ� �Է��� ��, ��, ���� ���� ����
		
	// �޼ҵ� ����(�Է¹ޱ�)
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� �� �Է�(���鱸��) : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
	}

	// �޼ҵ� ����(���� �����ϱ�)
	String week()
	{
		int sum=0;
		//int[] year = new int[y];
		for ( int i=1 ; i<y  ; i++ )
		{
			if ( i%4==0 && i%100==0 || i%400==0)
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
		}
		
		for ( int i=1 ; i<y ; i++ )
		{
			if (m==2)
				sum += 28;
			else if (m%2==0)
				sum += 30;
			else if (m%2!=0)
				sum += 31;
		}

		for ( int i=1 ; i<d ; i++)
		{
			sum += i;
		}
	
				
		String[] daynames = {"������","ȭ����","������","�����","�ݿ���","�����","�Ͽ���"};
		
		return String[] daynames;
		
	}

	// �޼ҵ� ����(��� ����ϱ�)
	void print(String day)
	{
		this.y= y;
		this.m= m;
		this.d= d;
		System.out.printf("\n>> %d�� %d�� %d�� �� %s",y,m,d,day);
	}

	
}

public class Test091
{
	public static void main(String[] args)
	{
		WeekDay wd = new WeekDay();

		wd.input();						//-- �Է� �޼ҵ� ȣ��

		String result = wd. week();		//-- ���� ���� �޼ҵ� ȣ��

		wd.print(result);				//-- ��� ��� �޼ҵ� ȣ��
		
	}
}