/*=====================================
	���� ����(Sort) �˰��� ����
=======================================*/

// �� �ǽ� ����
//	  ����ڷκ��� ���� �л��� ���� ������ ���� ���·� �Է¹޾�
//	  ������ ���� ������ ����� �ο��Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
//	  ��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է� : 5
// �̸� ���� �Է�(1) : ���ֿ� 90
// �̸� ���� �Է�(2) : ������ 80
// �̸� ���� �Է�(3) : ������ 85
// �̸� ���� �Է�(4) : ������ 75
// �̸� ���� �Է�(5) : �̱�� 95

//====================
// 1�� �̱�� 95
// 2�� ���ֿ� 90
// 3�� ������ 85
// 4�� ������ 80
// 5�� ������ 75
//====================

import java.util.Scanner;

public class Test105
{
	public static void main(String[] args)
	{
		//�Է�
		Scanner sc =new Scanner(System.in);
		int num;
		System.out.print("�ο� �� �Է� : ");
		num = sc.nextInt();
		
		
		//��Ʈ������
		String[] name = new String[num];
		int[] score = new int[num];


		int n=0;
		do
		{
			
			System.out.printf("�̸� ���� �Է�(%d) : ", n+1);
			name[n] = sc.next();
			score[n] = sc.nextInt();
			n++;
		}
		while (n<num);

		//pass���� flag�� �����Ѵ�.
		int pass=0;
		boolean flag;

		String[] tmp = new String[num];
		
		/*Bubble Sort
		for (int i=1 ; i<score.length ; i++ )
		{
			for (int j=0 ; j<score.length-i ; j++ )
			{
				if (score[j]<score[j+1])
				{
					score[j] = score[j]^score[j+1];
					score[j+1] = score[j+1]^score[j];
					score[j] = score[j]^score[j+1];

					tmp[j] = name[j];
					name[j] = name[j+1];
					name[j+1] = tmp[j];
				}
			}
		}*/

		//���� Bubble Sort
		do
		{
			flag=false;
			pass++;
			for (int j=0 ; j<score.length-pass ; j++ )
			{
				if (score[j]<score[j+1])
				{
					score[j] = score[j]^score[j+1];
					score[j+1] = score[j+1]^score[j];
					score[j] = score[j]^score[j+1];

					tmp[j] = name[j];
					name[j] = name[j+1];
					name[j+1] = tmp[j];

					flag=true;
				}
			}
		}
		while (false);

		int[] rank = new int[num];
		int k=1;
	

		System.out.println("====================");
		
		for (int m=0 ; m<num ; m++)
		{
			
			rank[m] += k;
			System.out.printf("%3d�� %5s %3d",rank[m],name[m],score[m]);
			System.out.println();
			k++;
		}

		System.out.println("====================");
	
	}
}