/*=============================
	���� �迭 ����
	- �迭�� �⺻���� Ȱ��
=============================*/

// �� �ǽ� ����
// ����ڷκ��� �ο� ���� �Է¹ް�
// �̷��� �Է¹��� �ο� �� ��ŭ�� �л� �̸��� ��ȭ��ȣ�� �Է¹޾�
// �Է¹��� ���빰 ��ü�� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �Է� ó���� �л� �� �Է�(��, 1~10) : 3
// �̸� ��ȭ��ȣ �Է�[1](���� ����) : ������ 010-1111-1111
// �̸� ��ȭ��ȣ �Է�[2](���� ����) : ��ȫ�� 010-2222-2222
// �̸� ��ȭ��ȣ �Է�[3](���� ����) : ���ȯ 010-3333-3333

// -----------------------
// ��ü �л��� : 3��
// -----------------------
// �̸�		��ȭ��ȣ
// ������	010-1111-1111
// ��ȫ��	010-2222-2222
// ���ȯ	010-3333-3333
// -----------------------
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;

public class Test082
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		/*
		int a=0;
		String[] name = new String[9];
		String[] phone = new String[9];

		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			a = sc.nextInt();
	
			for (int i=0; i<a ; i++)
			{
				System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ",a);
				name[i]= sc.next();
				phone[i] =sc.next();
			}

			System.out.println("-----------------------");
			System.out.print("��ü �л��� :"+a);
			System.out.println();
			System.out.println("-----------------------");
			System.out.print("�̸�	��ȭ��ȣ");
			System.out.println();


				
			for (int i=0 ; i<a ; i++)
			{
				System.out.print(name[i]+"  ");
				System.out.print(phone[i]);
				System.out.println();
	
			}
			
			System.out.println();
			System.out.println("-----------------------");
		
			a++;


		}
		while (a<0 || a>11); // <-Ʋ�ȴ�!

		*/

		int memCount = 0;
		
		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			memCount = sc.nextInt();
		}
		while (memCount<1 || memCount>10);

		//�̸� ���� �迭 ���� �� �Է¹��� �ο� �� ��ŭ�� �迭�� ����
		String[] names = new String[memCount];

		//��ȭ��ȣ ���� �迭 ���� �� �Է¹��� �ο� �� ��ŭ�� �迭�� ����
		String[] tels = new String[memCount];

		//�ݺ����� Ȱ���Ͽ� ������� �Է� �����͸� �迭�� ��Ƴ���
		for (int n=0 ; n<memCount ; n++) //memCount == names.length == tels.length
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ", n+1);
			//���Ѿ� 010-1111-1111
			names[n] = sc.next();
			tels[n] = sc.next();
		}
		
		// ���� ���(�̸�, ��ȭ��ȣ) ���
			System.out.println("-----------------------");
			System.out.printf("��ü �л��� : %d��\n", memCount);
			System.out.println("-----------------------");
			System.out.print("�̸�	��ȭ��ȣ");
			System.out.println();
		
		for ( int m=0 ; m<memCount ; m++ )
		{
			System.out.printf("%3s %9s\n", names[m], tels[m]);
		}


	}
}

//���� ���
/*
�Է� ó���� �л� �� �Է�(��, 1~10) : 3
�̸� ��ȭ��ȣ �Է�[1](���� ����) : �Ͽ��� 010-1111-1111
�̸� ��ȭ��ȣ �Է�[2](���� ����) : �̿��� 010-2222-2222
�̸� ��ȭ��ȣ �Է�[3](���� ����) : ����� 010-3333-3333
-----------------------
��ü �л��� : 3��
-----------------------
�̸�    ��ȭ��ȣ
�Ͽ��� 010-1111-1111
�̿��� 010-2222-2222
����� 010-3333-3333
*/