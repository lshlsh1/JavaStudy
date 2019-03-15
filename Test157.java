/*========================================
	���� �÷��� (Collection) ���� �١�
	- Vector
========================================*/

// ���� �ڷᱸ�� ��ü ���� �� ���� �� ����� ���� Ŭ���� Ȱ��
// �� �ڷ���

import java.util.Vector;

// ����� ���� Ŭ���� ���� �� �ڷ���ó�� Ȱ��
class MyData
{
	//�ֿ� �Ӽ� ���� �� �ֿ� ���� ����(��� ����)
	private String name;	//-- �̸�
	private int age;		//-- ����
		
	//getter / setter ����
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}

	//������(���� ���� ������)
	public MyData()
	{
		name = "";
		age =0;
	}

	//������(���� 2���� ������)
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}

public class Test157
{
	public static void main(String[] args)
	{
		//���� �ڷᱸ�� �ν��Ͻ� ����
		Vector<MyData> v = new Vector<MyData>();
		
		// ���� �ڷᱸ�� v ��
		// ������ 16�� / �̱�� 24�� / ������ 86��
		// ��Ƴ���

		// �� 
		/*
		MyData st1 = new MyData();
		st1.setName("������");
		st1.setAge(16);
		v.add(st1);

		MyData st2 = new MyData();
		st2.setName("�̱��");
		st2.setAge(24);
		v.add(st2);

		MyData st3 = new MyData();
		st3.setName("������");
		st3.setAge(86);
		v.add(st3);
		*/


		// ��
		/*
		MyData st1 = new MyData("������", 16);
		v.add(st1);
		MyData st2 = new MyData("�̱��", 24);
		v.add(st2);
		MyData st3 = new MyData("������", 36);
		v.add(st3);
		*/

		// ��
		v.add(new MyData("������", 16));
		v.add(new MyData("�̱��", 17));
		v.add(new MyData("������", 86));
		

		//���� �ڷᱸ��v�� ��� ����(���) ��ü ����ϱ�
		//���� ��)
		//�̸� : ������, ���� : 16��
		//�̸� : �̱��, ���� : 24��
		//�̸� : ������, ���� : 86��
		
		// ��
		for (MyData obj : v)
		{
			System.out.printf("�̸� : %s, ���� : %d\n", obj.getName(), obj.getAge());
		}

		// ��
		for (int i=0 ; i<v.size() ; i++ )
		{
			//System.out.printf("�̸�: %s, ���� : %d\n",v.get(i).getName() , v.get(i).getAge() );
			System.out.printf("�̸�: %s, ���� : %d\n",v.elementAt(i).getName() , v.elementAt(i).getAge() );
		}System.out.println();

		// ��
		for (Object temp : v)
		{
			System.out.printf("�̸� : %s, ���� : %d\n", ((MyData)temp).getName(), ((MyData)temp).getAge()); // ���, ��ĳ����,�ٿ�ĳ����
		}

		
	}
}