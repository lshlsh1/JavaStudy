/*=============================================
	���� ���� �帧�� ��Ʈ��(���) ����
	- if�� ~ else�� �ǽ�
===============================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ 2�� �������, 3�� �������
// 2�� 3�� �������, 2�� 3�� ����� �ƴ��� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է� : 8
// >> 8 �� 2�� ���~!!!
// ����Ϸ��� �ƹ�Ű�� ��������

// ������ ���� �Է� : 9
// >> 9 �� 3�� ���~!!!
// ����Ϸ��� �ƹ�Ű�� ��������

// ������ ���� �Է� : 6
// >> 6 �� 2�� 3�� ���~!!!
// ����Ϸ��� �ƹ�Ű�� ��������

// ������ ���� �Է� : 11
// >> 11 �� 2�� 3�� ��� �ƴ�~!!!
// ����Ϸ��� �ƹ�Ű�� ��������

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		int a;
		
		System.out.print("������ ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		
		if(a%2==0 && a%3==0)
		{
			System.out.printf(">>%d �� 2�� 3�� ���~!!!\n",a);
		}
		else if(a%2==0)
		{
			System.out.printf(">>%d �� 2�� ���~!!!\n",a);
		}
		else if(a%3==0)
		{
			System.out.printf(">>%d �� 3�� ���~!!!\n",a);
		}
		else
		{
			 System.out.printf(">>%d �� 2�� 3�� ��� �ƴ�~!!!\n",a);
		}*/

		
		
		// 2�ǹ��, 3�ǹ�� ���ǽ��� ���� ���� ��쿡�� 2�� 3�� ������(������) ���ǽ��� �����ϴ� �����Ͱ� �б�� �� ����.


		int n;

		System.out.print("������ ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		if (n%2==0 && n%3==0)
		{
			System.out.println(">> " + n + " �� 2�� 3�� ���~!!");
		}
		if (n%2==0)
		{
		}
		if (n%3==0)
		{
		}
		if (n%2!=0 && n%3!=0)
		{
		}
		else
		{
			System.out.println("�ǵ��Ұ�")
		}
	}
}