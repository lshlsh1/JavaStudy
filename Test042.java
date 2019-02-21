/*=============================================
	���� ���� �帧�� ��Ʈ��(���) ����
	- switch�� �ǽ�
===============================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� ������ ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, switch ���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�
// ���� ����� ���ǻ� ���� ���·� ó���ϵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է�	: 10
// �� ��° ���� �Է�	: 28
// ������ �Է�(+ - * /) : +

// >> 10 + 28 = 38
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/* 
		//�� Ǯ�� ����
		int a, b;
		char op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();
		
		//���� : boolean cannot be converted to int switch
		/* 
		switch(op=='+')
		{
			default : System.out.printf("\n >> %d + %d = %d", a,b,a+b);
		}
		switch(op=='-')
		{
			default : System.out.printf("\n >> %d - %d = %d", a,b,a-b);
		}
		switch(op=='*')
		{
			default : System.out.printf("\n >> %d - %d = %d", a,b,a*b);
		}
		switch(op=='/')
		{
			default : System.out.printf("\n >> %d - %d = %d", a,b,a/b);
		}
		*/
		
		/* ���� �� ����
		switch(op)
		{
			case 43 : System.out.printf("\n >> %d + %d = %d\n", a,b,a+b); break;
			case 45 : System.out.printf("\n >> %d - %d = %d\n", a,b,a-b); break;
			case 42 : System.out.printf("\n >> %d * %d = %d\n", a,b,a*b); break;
			case 47 : System.out.printf("\n >> %d / %d = %d\n", a,b,a/b); break;
		}*/

		// �������� Ǯ��
		int a, b, result;
		char op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();

		switch (op)
		{
			case '+' : result = a+b; break;
			case '-' : result = a-b; break;
			case '*' : result = a*b; break;
			case '/' : result = a/b; break;
			//jdk1.5���� char���� ���ȭ���� ����ϴ°��� ��������
			default : return;		//-- �޼ҵ� ���� �� main() �޼ҵ� ���� �� ���α׷� ����
		}

		// �� ��return�� : �簪�� ��ȯ
		//				   ��޼ҵ��� ����

		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);

		
	}
}

//������
/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 28
������ �Է�(+ - * /) : *

>> 10 * 28 = 280
*/