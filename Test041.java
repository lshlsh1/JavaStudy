/*=============================================
	���� ���� �帧�� ��Ʈ��(���) ����
	- switch�� �ǽ�
===============================================*/

// �� �ǽ� ����
// 1 ���� 3������ ���� �� �ϳ��� ����ڷκ��� �Է¹޾�
// �Է¹��� ������ŭ ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
// �� �� ���� ������� ������ �� �ֵ��� �Ѵ�.

// �� switch ���� �Ϲ� ���� Ȱ���Ѵ�.
// �� switch ���� �⺻ ���� Ȱ���ϵ�,
//	  ��break���� �� �� ���� ����� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է�(1~3) : 3
// �ڡڡ�
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է�(1~3) : 1
// ��
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է�(1~3) : 7
// �Է� ����~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test041
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a;
		System.out.print("������ ���� �Է�(1~3) : ");
		a = Integer.parseInt(br.readLine());

		// �� switch ���� �Ϲ� ��
		/*
		switch(a)
		{
			case 1 : System.out.println("��"); break;
			case 2 : System.out.println("�ڡ�"); break;
			case 3 : System.out.println("�ڡڡ�"); break;
			default : System.out.println("�Է� ����~!!!");
		}
		*/

		// �� switch ���� �⺻ ��
		switch(a)
		{
			case 3 : System.out.print("��"); 
			case 2 : System.out.print("��"); 
			case 1 : System.out.print("��\n"); break;
			default : System.out.println("�Է� ����~!!!");
		}

		

	}
}