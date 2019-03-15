/*========================================
	���� �÷��� (Collection) ����
	- Vector
========================================*/

// Vector v = new Vector();
//-- ����ִ� Vector �ڷᱸ�� ����

// Vector v = new Vector(8);
//-- 8���� �ʱ� elements�� ���� Vector �ڷᱸ�� ����
//	 8���� ��� ä������ �Ǹ�(���ڶ�� �Ǹ�) �ڵ����� Ȯ��ȴ�.

// Vector v = new Vector(3, 5);
//-- 3���� �ʱ� elements�� ���� Vector �ڷᱸ�� ����
//	 3���� ��� ä������ �Ǹ�(���ڶ�� �Ǹ�) 5�� ����(Ȯ��)�ȴ�.

// �� ���ʹ� ������ ��ҷμ� ������, �Ǽ���, ���ڿ�.. ���
//    ��Ƴ��� ���� �����ϴ�.
//	  �� ���� ��� �� ������ ������ Ȯ�� -- check~!!!

//MyVector Ŭ���� ���� �� Vector Ŭ���� ���
import java.util.Vector;
import java.util.Iterator;

class MyVector extends Vector<Object>
{
	/*
	... ���� Vector ��� ���
	*/

	// ������
	MyVector()
	{
		// Vector(���� Ŭ����) ������ ȣ��
		super(1,1);
		// ù ��° ���� : �־��� �뷮
		// �� ��° ���� : ������
	}

	void addInt(int i)
	{
		addElement(new Integer(i));
	}

	void addFloat(float f)
	{
		addElement(new Float(f));
	}

	void addString(String s)
	{
		addElement(s);
	}

	void addArray(char[] c)
	{
		addElement(c);
	}

	void write()
	{
	/*
		Iterator<Object> it = this.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	*/
	// ���� ����� ��
	Object o;
	int length = size();

	System.out.println("���� ��� ���� : " + length);
	// ���� ��Ұ� ����� ����Ǿ����� Ȯ��

	for (int i=0; i<length; i++)
	{
		o = elementAt(i);

		// "instanceOf" ������
		// ó���ؾ� �ϴ� ����� ��ü Ÿ�� Ȯ��

		if (o instanceof Integer)
			System.out.println("������ : " + o);
		else if (o instanceof Float)
			System.out.println("�Ǽ��� : " + o);
		else if (o instanceof String)
			System.out.println("���ڿ��� : " + o.toString());
		else if (o instanceof char[])
			System.out.println("���ڹ迭 : " + String.copyValueOf((char[])o));
		else
			System.out.println("Ÿ�� Ȯ�� �Ұ�");
	}

		System.out.println();
	}
}

public class Test154{
	public static void main(String[] args){
		// MyVector Ŭ���� �ν��Ͻ� ����
		MyVector v = new MyVector();

		// �ֿ� ���� ���� �� �ʱ�ȭ
		int digit = 5;
		float real = 3.14f;
		String s = new String("�ȳ��ϼ���.");
		char[] letters = {'s', 't', 'u', 'd', 'y'};

		v.addInt(digit);	// ���� �ڷᱸ���� ���� ����
		v.addFloat(real);	// ���� �ڷᱸ���� �Ǽ� ����
		v.addString(s);		// ���� �ڷᱸ���� ���ڿ� ����
		v.addArray(letters);// ���� �ڷᱸ���� ���� �迭 ����

		v.write();
	}
}