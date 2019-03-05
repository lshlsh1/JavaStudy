/*=====================================
	���� Ŭ���� ���� ����
	- ���(Inheritance)
=======================================*/

// �� �ǽ� ����
//	  ������ ���� ���α׷��� �����Ѵ�.
//	  ��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 20 15
// ������ �Է�(+ - * /) : -
// >>20 - 15 = 5
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class AClass
{
	protected int x, y;
	protected char op;

	AClass()
	{
	}
	
	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}

class BClass extends AClass	
{
	/* AClass���� ��� ���� ��
	protected int x, y;
	protected char op;
	
	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
	*/

	/* �� Ǯ��
	void input() throws IOException
	{

		Scanner sc = new Scanner(System.in);	
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();
	}

	double xycal()
	{
	double result=0;
		
	switch (op)
	{
		case '+' : result = super.x + super.y; break;
		case '-' : result = super.x - super.y; break;
		case '*' : result = super.x * super.y; break;
		case '/' : result = super.x / super.y; break;
	}
		return result;
	}
	*/

	// ������ Ǯ��
	BClass()
	{
	}

	boolean input()	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ �� ���� �Է�(���� ����) : ");	// 20 15
		String temp = br.readLine();							// "20 15"
		String[] str = temp.split("\\s"); // �����ڸ� �������� ���ض�
		// �� ���ڿ�.split("������");
		// ex) "��� ���� �ٳ��� ���� ����".split("\\s");
		//		��ȯ �� {"���", "����", "�ٳ���", "����", "����"} - �迭 ���·� ��ȯ
		// ex) "10 20 30 40".split("\\s");
		//		��ȯ �� {"10", "20", "30", "40"};
		//------------------------------------------------->p.86-87 // String[] str = {"20", "15"};
		
		if (str.length != 2)
		{
			return false;	//-- false(����)�� ��ȯ�ϸ� input() �޼ҵ� ����
		}
		
		// �� �� ���ǹ��� ������ ��� �Ʒ��� �ڵ���� �����ִ� ��Ȳ������
		//	  �� �̻� �������� �ʰ� ������� ��ȯ�ϸ� �޼ҵ�� ����ȴ�.

		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);
		
		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();

		if (op!='+' && op!='-' && op!='*' && op!='/') //or�� �Է����� �ʵ��� ����
		{
			return false;
		}
		return true;

		/*
		if (op=='+' || op=='-' || op=='*' || op=='/') 
			return false;
	
		return true;
		*/
	}

	double calc()
	{
		double result=0;
		
		switch (op)
	{
		case '+' : result = x + y; break;
		case '-' : result = x - y; break;
		case '*' : result = x * y; break;
		case '/' : result = (double)x / y; break;
	}

		return result;
	}

}

public class Test108
{
	public static void main(String[] args) throws IOException
	{
		BClass ob = new BClass();

		//ob.input();
		//double result = ob.xycal();

		if (!ob.input()) //! �� �Է°��� ��ȿ���� �ʴٸ�
		{
			System.out.print("Error...");
			return;
		}

		double result = ob.calc();
		ob.write(result);

		//�ڽ�Ŭ������ �θ�Ŭ�������� ����� �� ������
		//�θ�Ŭ������ �ڽ�Ŭ�������� ����� �� ����.

	}
}