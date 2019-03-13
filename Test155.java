/*==============================================================
	�÷���(Collection)
==============================================================*/

import java.util.Vector;
import java.util.Collections;

public class Test155{

	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};

	public static void main(String[] args){
		// ���� �ڷᱸ�� ����
		Vector<String> v = new Vector<String>();

		// v��� ���� �ڷᱸ���� colors ��� �߰�
		for (String str : colors)
			v.add(str);

		System.out.println("ù ��° ��� : " + v.firstElement());
		System.out.println("�� ��° ��� : " + v.get(1));
		System.out.println("������ ��� : " + v.lastElement());
		System.out.println("����� ���� : " + v.size());
		
		// ù ��° ��Ҹ� "�Ͼ�"���� ����
		v.set(0, "�Ͼ�");
		System.out.println("ù ��° ��� : " + v.firstElement());
		System.out.println("�� ��° ��� : " + v.get(1));
		System.out.println("����� ���� : " + v.size());

		// ù ��° ��ҿ� "��Ȳ" �߰�
		v.insertElementAt("��Ȳ", 0);
		System.out.println("ù ��° ��� : " + v.firstElement());
		System.out.println("�� ��° ��� : " + v.get(1));
		System.out.println("����� ���� : " + v.size());

		// ��ü ���
		System.out.print("��ü ��� : ");
		for (String str : v)
			System.out.print(str + " ");
		System.out.println();

		// �������� ����
		Collections.sort(v);
		System.out.print("�������� ���� �� ��ü ��� : ");
		for (String str : v)
			System.out.print(str + " ");
		System.out.println();
		// ���� �ε����� �����.

		// �˻�
		// Collections.binarySearch()
		// �˻� ��� ����. ��, �������� ���ĵ� �ڷḸ ��� ����.
		// �˻� ����� �������� ���� ���... ������ ��ȯ�Ѵ�.
		int idxBlue = Collections.binarySearch(v, "�Ķ�");
		System.out.printf("�Ķ� : %d ��° �ε����� ��ġ�ϰ� �ִ�.\n", idxBlue);

		int idxnavi = Collections.binarySearch(v, "����");
		System.out.printf("���� : %d ��° �ε����� ��ġ�ϰ� �ִ�.\n", idxnavi);

		// �������� ����
		Collections.sort(v, Collections.reverseOrder());
		System.out.print("�������� ���� �� ��ü ��� : ");
		for (String str : v)
			System.out.print(str + " ");
		System.out.println();
		idxBlue = Collections.binarySearch(v, "�Ķ�");
		System.out.printf("�Ķ� : %d ��° �ε����� ��ġ�ϰ� �ִ�.\n", idxBlue);

		
		idxBlue = Collections.binarySearch(v, "�Ķ�", Collections.reverseOrder());
		System.out.printf("�Ķ� : %d ��° �ε����� ��ġ�ϰ� �ִ�.\n", idxBlue);
	}
}