/*=======================================
	���� Ŭ������ �ν��Ͻ� ����
	- Ŭ���� ���� �ǽ�
========================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// ��Ģ ������ �����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// Scanner ��밡��

// ���� ��)
// ������ �� ���� �Է� (���� ����) : 10 5
// ������ ������ �Է�(+ - * /)	   : +
// >> 10 + 5 = 15
// ����Ϸ��� �ƹ� Ű�� ��������....

import java.util.Scanner;
import java.io.IOException;

class Nap
{
	int a, b;
	char c;
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է� (���� ����) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("������ ������ �Է� (+ - * /) : ");
		c = (char)System.in.read();
	}
	
	int ifcalculate()
	{
		int result=0;
		
		if(c=='+')
			result = (a+b);
		else if(c=='-')
			result = (a-b);	
		else if(c=='*')
			result = (a*b);
		else if(c=='/')
			result = (a/b);

		return result;
	}

	void print(int d)
	{
		System.out.printf(">> %d %c %d = %d\n", a,c,b,d);
	}
}


public class Test073
{
	public static void main(String[] args)  throws IOException
	{

		Nap ob = new Nap();

		int n;

		ob.input();

		n = ob.ifcalculate();
		
		ob.print(n);
	}
}