/*================================================
	���� ���� �帧�� ��Ʈ�� ( ��� ) ����
	- �ݺ���(while)�� �ǽ�
==================================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ �� ������ �Է¹޾�
// ���� �� ���� ū �� ������ ���� ���Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 20
// >> 10 ~ 20 ������ �� : xxxx

// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 2
// >> 2 ~ 20 ������ �� : xxxx

import java.io.BufferedReader;		
import java.io.InputStreamReader;	
import java.io.IOException;

public class Test051
{
	public static void main(String[] args)	throws IOException
	{
		/*
		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		// �ֿ� ���� ���� �� �ʱ�ȭ
		int a, b, sum=0;	
	
		
		System.out.print("ù ��° ���� �Է� : ");	//���� ���
		a = Integer.parseInt(br.readLine());		//�Է�
		System.out.print("�� ��° ���� �Է� : ");	//���� ���
		b = Integer.parseInt(br.readLine());		//�Է�
	
		//a���� b������ Ŭ ��� a,b�� ���� ����
		if(a>b)
		{
			a=a^b;
			b=b^a;
			a=a^b;
		}

		System.out.printf(">>%d ~ %d ���� �� : ",a , b); 
		//�ڿ� ��ġ�ϸ� while�� ������ ���� a,b���� ��µǹǷ� ������ while�� �տ� ��ġ��Ų��

		// while ����
		// a���� b������ �۰ų� ���ƾ� ������ �����Ѵ�
		// a���� b���� ���� ���Ѵ�
		while(a<=b)	
		{
			sum += a;	// 1������ ���� sum�� �����Ѵ�

			a++;		//a�� 1������Ų��
		}

		System.out.println(sum);
		//����� ���� ����Ѵ�.
		*/

		// <������ Ǯ��>
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �� �ֿ� ���� ����
		int n, su1, su2, result=0;
		//-- ��������, ù ��° �Է°�, �� ��° �Է°�, �����(������ ������)

		// �� ���� �� ó��
		// ������ڿ��� �ȳ��޼��� ��� �� �Է°� ��Ƴ���
		System.out.print("ù ��° ���� �Է� : ");
		su1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		su2 = Integer.parseInt(br.readLine());

		//�������� ���꿡 ���� �ռ�
		//	�Է¹��� �� ���� ũ�� �� �� �ڸ� �ٲ�
		//	��, su1�� su2���� Ŭ ��� �� ���� �ڸ��� �ٲ� �� �ֵ��� ó��
		
		if (su1>su2)
		{
			//�� ���� �ڸ� �ٲ�
			su1=su1^su2;
			su2=su2^su1;
			su1=su1^su2;
		}
		
		//�ݺ��п� �����ϱ� ��
		// ���� ���� ���� �����صд�
		// (�� ���� ���� ��� �������� �ʿ��� ���̸�
		// ������ ������ ���� ���� ��� �ݺ����� �����ϴ� ����
		// �� ���� ��� ���� ���̱� ����....)
		n = su1;
		
		while (n<=su2)
		{
			result += n;
			n++;
		}
		
		//��� ���
		System.out.printf(">>%d ~ %d ���� �� : %d\n",su1 , su2, result); 

	}
}

//���� ���
/*
ù ��° ���� �Է� : 100
�� ��° ���� �Է� : 1
>>1 ~ 100 ���� �� : 5050
*/