/*================================================
	���� ���� �帧�� ��Ʈ�� ( ��� ) ����
	- �ݺ���(while)�� �ǽ�
==================================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾� BufferedReader
// �Է¹��� ������ �Ҽ����� �ƴ����� �Ǻ��Ͽ�
// ����� Ǯ���ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է� : 10
// 10 �� �Ҽ� �ƴ�
// ����Ϸ��� �ƹ� Ű��

// ������ ���� �Է� : 11
// 11 �� �Ҽ�
// ����Ϸ��� �ƹ� Ű��

// �� �Ҽ� : 1 �Ǵ� �ڱ� �ڽ��� �� �̿��� � ���ε� ���� �� ���� ��
//			 ��, 1�� �Ҽ� �ƴ�

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test050
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		int n = 2;
		int m;
		String temp = "�Ҽ�";

		System.out.print("������ ���� �Է� : ");
		m = Integer.parseInt(br.readLine());

		if (m<=1)
		{
			temp = "�Ҽ� �ƴ�";
		}
		else
		{
			while (n<m)
			{
				if (m%n==0)
				{
					temp= "�Ҽ� �ƴ�";
				}
				n++;
			}
		}

		System.out.printf("%d �� %s\n", m, temp);
		*/

		/*
		int a;
		System.out.print("������ ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		int j = 2;
			while (j<=(a-1)||(j-a==1))
			{
				if((a%j==0)||a==1)
				{
					System.out.println(a+" �� �Ҽ� �ƴ�");
					return;
				}
				else
				{
						j++;
				}
			}
			System.out.println(a + " �� �Ҽ�");
		*/

		//������ Ǯ��
		// �ֿ� ���� ���� �� �ʱ�ȭ
		int num;		//-- ����� �Է°��� ���� ����

		// ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());

		int n = 2;				//-- ������� �Է°��� �������
								//	 ������ ������ ������ ����(1�� ���� ����)

		boolean flag=true;		//-- �Ҽ���~!!!! (check~!!!!)
		
		while (n<num)
		{
			if (num%n==0)
			{
				flag = false;	//-- �Ҽ� �ƴϴ�~!!!!
				break;
			}
			n++;
		}
		// ��� ���(��� ���� �����ؾ� �� �߰� Ȯ�� �� 1���� ���ο� ���� Ȯ��
		// �Ҽ��� && 1�� �ƴϴ�
		// �� �������� ������� �Ҽ���
		// �׷��� ������
		// �� �������� ������� �Ҽ� �ƴϴ�

		if (flag && num!=1) //flag == true
			System.out.printf("%d �� �Ҽ�~!!!\n", num);
		else
			System.out.printf("%d �� �Ҽ� �ƴ�~!!!\n", num);
		
	}
}
