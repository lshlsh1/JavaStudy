/*==============================================================
	�÷���(Collection)
==============================================================*/

// �˻� �� ����

import java.util.Vector;

public class Test156{

	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};

	public static void main(String[] args){
		// ���� �ڷᱸ�� �ν��Ͻ� ����
		Vector<String> v = new Vector<String>();

		// ���� �ڷᱸ�� v�� colors ��� �߰�
		for (String str:colors)
			v.add(str);
		
		// ���� �ڷᱸ�� v�� ��ü ��� ���
		System.out.print("��ü ��� ��� : ");
		for (String str:colors)
			System.out.print(str + " ");
		System.out.println();

		String s1 = "��ȫ";

		// indexOf()
		int i = v.indexOf(s1);
		System.out.println(s1 + " �� index ��ġ : " + i);
		System.out.println();

		String s2 = "���";
		/*
		int j = v.indexOf(s2);
		System.out.println(s1 + " �� index ��ġ : " + j);
		v.remove(j);
		for (String str:v)
			System.out.print(str + " ");
		System.out.println();*/


		//v.contains(s) : ���� �ڷᱸ�� v�� s�� ���ԵǾ� �ִٸ�...indexȮ��
		if (v.contains(s2))
		{
			i = v.indexOf(s2);
			System.out.println(s2 + " �� index ��ġ : "+i);

			//�켱 �� �ڵ带 ���� ã�� ã������ �����ض�
			v.remove(i);
		}

		//ã�Ƽ� ������ �� ��ü ��� ���
		System.out.print("���� �� ��ü ��� : ");
		for (String str : v)
		{System.out.print(str + " ");
		}System.out.println();
		//--==>> ���� �� ��ü ��� : ���� �ʷ� �Ķ� ���� ����

		// �߰� �׽�Ʈ(���ǻ���)
		System.out.println(colors);
		//--==>>[Ljava.lang.String;@15db9742

		System.out.println(v); 
		//--==>> [����, �ʷ�, �Ķ�, ����, ����]
		//-- Ȯ�ο뵵. �����Ϳ���Ұ�

		// �� Ȯ�ο�(�׽�Ʈ��) ���� �����ʹ�
		//	  ���� ���(������)�� �ƴϱ� ������
		//	  �̸� Ȱ���Ͽ� ������ �����ϰų� �ϸ� �ȵȴ�~!!!! check~!!!
	}
}