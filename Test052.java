/*================================================
	���� ���� �帧�� ��Ʈ�� ( ��� ) ����
	- �ݺ���(while)�� �ǽ�
==================================================*/

// �� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// 1�κ��� �� �������� ��ü ��, ¦�� ��, Ȧ�� ���� 
// ��� ������ ����ϴ� ���α׷��� �����Ѵ�.
//
// ���� ��)
// ������ ���� �Է� : 276
// >> 1 ~ 276 ���� ������ �� : xxxx
// >> 1 ~ 276 ���� ¦���� �� : xxxx
// >> 1 ~ 276 ���� Ȧ���� �� : xxxx
// ����Ϸ��� �ƹ� Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{	
		//BufferedReader ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ���� ���� �� �ʱ�ȭ
		int a=0, b=1, tot =0, even=0, odd=0;
		
		// ����ڿ��� �ȳ��޼��� ��� �� �Է°� ��Ƴ���
		System.out.print("������ ���� �Է� : ");	//�������
		a=Integer.parseInt(br.readLine());			//�Է�

		
		while(b<=a)	// 1���� �Է¹��� a���� while ����
		{
			tot += b;	//������ ��

			if(b%2==0)	//¦���ΰ��
				even += b;//¦������
			else		//Ȧ���ΰ��
				odd += b;//Ȧ������

			b++;//1����
		}

		//��� ���
		System.out.printf(">> 1 ~ %d ���� ������ �� : %d\n", a, tot);	//������ �� ���
		System.out.printf(">> 1 ~ %d ���� ¦���� �� : %d\n", a, even);	//¦���� �� ���
		System.out.printf(">> 1 ~ %d ���� Ȧ���� �� : %d\n", a, odd);	//Ȧ���� �� ���

	}
}

//���� ���
/*
������ ���� �Է� : 100
>> 1 ~ 100 ���� ������ �� : 5050
>> 1 ~ 100 ���� ¦���� �� : 2550
>> 1 ~ 100 ���� Ȧ���� �� : 2500
*/

