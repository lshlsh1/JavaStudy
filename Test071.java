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

// >> ���� : xxx.xx
// >> �ѷ� : xxx.xx
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.IOException;

public class Test071
{
	public static void main(String[] args) throws IOException //����ź �ǹ������� ������
	{
		/*
		CircleTest ob = new CircleTest();

		ob.intput();

		double areA = ob.area();
		double lengtH = ob.length();

		ob.print(areA, lengtH);
		*/

		//<������ Ǯ��>

		CircleTest ob = new CircleTest();

		ob.input();	//-- ����ź�� �������� ����

		double area = ob.calArea();
		double length = ob.calLength();

		ob.print(area, length);


	}
}

//���� ���
/*
������ �Է� : 10

>> �������� 10�� ����
>> ���� : 314.16
>> �ѷ� : 62.83
*/