/*============================================
	���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- Wrapper Ŭ����
============================================*/


import java.math.BigInteger;


public class Test127
{
	public static void main(String[] args)
	{
		//int a1 = 123456789123456789;
		//long b1 = 123456789123456789l;
		//long c1 = 123456789123456789123456789l;

		//System.out.println(a1);
		//System.out.println(b1);
		//--==>> 123456789123456789
		//System.out.println(c1);

		BigInteger a = new BigInteger("123456789123456789");
		BigInteger b = new BigInteger("123456789132456789");

		//BigInteger c = a+b;
		//System.out.println(c)

		// �� �Ϲ����� ��������ڸ� ���� ���� �Ұ���
		
		// ���ϱ� 
		BigInteger c = a.add(b);
		System.out.println("���� ��� : "+c);
		//--==>> ���� ��� : 246913578255913578

		//����
		BigInteger d = a.subtract(b);
		System.out.println("���� ��� : "+d);
		//--==>>

		//���ϱ�
		BigInteger e = a.multiply(b);
		System.out.println("���� ��� : "+e);
		//--==>> ���� ��� : 15241578781784789617733731851190521

		//������
		BigInteger f = a.divide(b);
		System.out.println("������ ��� : "+f);
		//--==>>

		//������
		BigInteger g = new BigInteger("2");
		System.out.println("2�� 3�� : "+g.pow(3));
		//--==>>2�� 3�� : 8
		
	}
}