/*========================================
	���� ������(Operator) ����
	- ���� ������ == ���� ������
========================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �������, ��������, 0������ �����Ͽ�
// ����� ����ϴ� ���α׷��� �ۼ��Ѵ�
// ��, �Է� �����ʹ� BufferedReader�� readLine()�� ���� �Ѱܹ��� �� �ֵ��� �Ѵ�.
// ����, ���� ������(���� ������)�� Ȱ���Ͽ� ����� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : -12
// -12 �� ����
// ����Ϸ��� �ƹ�Ű��..

// ������ ���� �Է� : 257
// 257 �� ���
// ����Ϸ��� �ƹ� Ű��....

// ������ ���� �Է� : 0
// 0 �� ��
// ����Ϸ��� �ƹ�Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test028
{
	public static void main(String[] args) throws IOException
	{
		/*int a;
		String b;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		
		b = (a>0) ? "���" : (a==0) ? "��" : "����" ;
		
		System.out.printf("%d �� %s\n", a, b);*/

		// �� �ֿ� ���� ����

		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;				//-- ����� �Է°��� ���� ����
		String strResult;	//-- �������� ������� ������ �Ǻ� ����� ���� ����
		
		// �� ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		/*
		n�� 0���� ũ�� �� ture �� ���
					   �� false �� n�� 0���� �۴� �� true �� ����
					   							  �� false �� ��
		*/

		strResult = n>0 ? "���" : (n<0 ? "����" : "��");

		
		// �� ��� ���
		System.out.println(n + " �� " + strResult);

	}

}
