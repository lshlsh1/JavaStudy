/*========================================
	���� Ŭ������ �ν��Ͻ� ����
========================================*/

// �� �ǽ� ����
// ���� ���̿� �ѷ� ���ϱ�

// ���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ ����������(������) �����Ѵ�.
// (Ŭ������ : CircleTest) �� CircleTest.java

// ���� ���� = ������ * ������ * 3.141592
// ���� �ѷ� = ������ * 2 * 3.141592

// ���� ��)
// ������ �Է� : xxx //(����)

// >> �������� xxx�� ����
// >> ���� : xxx.xx
// >> �ѷ� : xxx.xx
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class CircleTest
{
	/*
	int a;	// ���� ����
			
	void intput() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ �Է� : ");
		a = Integer.parseInt(br.readLine());
	}

	double area()
	{
		//������ * ������ * 3.141592
		double aRea;
		aRea = a * a * 3.141592;
		return aRea;
	}
	
	double length()
	{
		// ���� �ѷ� = ������ * 2 * 3.141592
		return a * 2 * 3.141592;
	}
		void print(double s, double t)
		{
			System.out.printf("\n>>�������� %d�� ����\n",a);
			System.out.println(">> ���� : "+s);
			System.out.println(">> �ѷ� : "+t);
		}
	*/

	
	//������ Ǯ��
	
	int r;
	final double PI = 3.141592; //final �߰��Ͽ� ���ȭ
	
	void input() throws IOException	//����ź �������� ������
	{	
		//Ŭ���� ���� �ٷ� �ؿ� BufferedReader��ġ ��ų �� ������ �ٶ������� �ʴ�.
		//������� �ʴ� ��Ȳ������ �޸𸮸� �Һ��ϰԵǱ⶧��
		//����̳� ������ �ʿ��� �޼ҵ� ���� �ȿ��� �����ϵ��� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());
	}
	double calArea()
	{
		double result;
		result = r * r * PI;
		return result;
	}

	double calLength()
	{
		double result;
		result = r * 2 * PI;
		return result;
	}

	void print(double a, double l)
	{
		System.out.printf("\n>> �������� %d�� ���� \n", r);
		System.out.printf(">> ���� : %.2f\n",a);
		System.out.printf(">> �ѷ� : %.2f\n",l);
	}

}