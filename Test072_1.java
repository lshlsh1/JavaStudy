/*=======================================
	���� Ŭ������ �ν��Ͻ� ����
	- Ŭ���� ���� �ǽ�
========================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// 1���� �Է¹��� �� ������ ���� �����ѿ�
// ������� ����ϴ� ���α׷��� �����Ѵ�.

// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ���� �Է� ó�� �������� BufferedReader�� readLine() �� ����Ͽ�
// �Է� �����Ͱ� 1���� �۰ų� 1000���� ū �ܿ�
// �ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�

// ���� ��)
// ������ ���� �Է� (1~1000) : 1002
// ������ ���� �Է� (1~1000) : -20
// ������ ���� �Է� (1~1000) : 100
// >> 1 ~ 100 ������ �� : 5050
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Nap
{
	// �ֿ� ���� ����(������� �Է°��� ��Ƶ� ����)
	int su;

	// �Է� �޼ҵ� ����
	void input()	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.print("������ ���� �Է�(1~1000) : ");
			su = Integer.parseInt(br.readLine());
		}
		while (su<1 || su>1000);
	}
	// ���� �޼ҵ� ����
	
	int calculate()
	{
		int result=0;
		
		for ( int i=1 ; i<=su ; i++ )
			result += i;

		return result;
	}
	// ��� ��� �޼ҵ� ����

	void print(int sum)
	{
		System.out.printf(">> 1 ~ %d ������ �� : %d\n",su,sum);
	}
}

//import java.io.IOException;

//main() �޼ҵ带 �����ϰ� �ִ� �ܺ� Ŭ����
public class Test072_1
{
	public static void main(String[] args) throws IOException
	{
		// Nap Ŭ���� �ν��Ͻ� ����
		Nap ob = new Nap();

		// ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ�� �� throws IOException
		ob.input();

		// ������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ�� �� int�� ����� ��ȯ �� �޾Ƴ� �� �ֵ��� ó��
		int s = ob.calculate();
		
		// ������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ�� �� �Ű����� ����
		ob.print(s);
	}
}

//���� ���
/*
������ ���� �Է�(1~1000) : 10000
������ ���� �Է�(1~1000) : 0
������ ���� �Է�(1~1000) : 100
>> 1 ~ 100 ������ �� : 5050
*/


