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

public class Test072
{
	public static void main(String[] args) throws IOException
	{
		Sum ob = new Sum();
		
		int sumsum;

		ob.input();
		
		sumsum = ob.sum();

		ob.print(sumsum);
	}
}

class Sum
{
	int n;

	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{	
			System.out.print("������ ���� �Է� (1~1000) : ");
			n = Integer.parseInt(br.readLine());
		}
		while (n<1 || n>1000);		
	}

	int sum()
	{
		int m=0;
		int i;

		for(i=1; i<=n; i++)
		{
			m += i;
		}
		return m;	
	}

	void print(int a)
	{
		System.out.printf(">> 1 ~ %d ������ �� : %d\n",n,a);
	}
}