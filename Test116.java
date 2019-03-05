/*================================
	���� Ŭ���� ��� ���� 
	- �������̽�(Interface)
=================================*/

// �� �ǽ� ����
//	  ���� ó�� ���α׷��� �����Ѵ�.
//	  �� �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է�(1-10) : 2
// 1��° �л��� �й� �̸� �Է�(���� ����) : 1921004 �̿���
// ���� ���� ���� ���� �Է�	  (���� ����) : 99 100 85
// 2��° �л��� �й� �̸� �Է�(���� ����) : 1921005 ������
// ���� ���� ���� ���� �Է�	  (���� ����) : 85 70 65

// 1921004 �̿���	90 100  85		275		91
//					��  ��  ��
// 1921005 ������	85	70	65		220		73
//					��	��	��

// ����Ϸ��� �ƹ� Ű�� ��������...

// �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��
import java.util.Scanner;

class Record	
{
	String hak, name;	//-- �й�, �̸�
	int kor, eng, mat;	//-- ����, ����, ���� ����
	int tot, avg;		//-- ����, ���(���ǻ� ���� ó��)
}

//�������̽�

interface Sungjuk
{
	public void set();
	public void input();
	public void print();
}

// ���� �ذ� �������� �����ؾ� �� Ŭ����

class SungjukImpl		implements Sungjuk
{
	int num;
	Record[] rcArray;	// Record ��ü�� ���� �迭 ���� ��ġ int[] arr ó��
	
	public void set()
	{	
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("�ο� �� �Է�(1-10) : ");
			num = sc.nextInt();
		}
		while (num<1 || num>10);
		
		rcArray = new Record[num];
	}

	public void input()
	{
		Scanner sc = new Scanner(System.in);

		for (int i=0 ; i<num ; i++)
		{
			rcArray[i] = new Record();	
			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ",i+1);
			rcArray[i].hak = sc.next();
			rcArray[i].name =  sc.next();
	
			System.out.print("���� ���� ���� ���� �Է�	  (���� ����) : ");
			rcArray[i].kor = sc.nextInt();
			rcArray[i].eng = sc.nextInt();
			rcArray[i].mat = sc.nextInt();

			rcArray[i].tot = rcArray[i].kor+rcArray[i].eng+rcArray[i].mat;

			rcArray[i].avg = rcArray[i].tot/3;
		}
	}

	public void print()
	{
		for (int i=0; i<num ; i++)
		{
			System.out.printf("%s %s %3d %3d %3d %5d %3d\n",rcArray[i].hak, rcArray[i].name,rcArray[i].kor, rcArray[i].eng, rcArray[i].mat,rcArray[i].tot,rcArray[i].avg);
			

		}



	}

}

public class Test116
{
	public static void main(String[] args)
	{
		
		Sungjuk ob = new SungjukImpl();
		//���� �ذ� �������� �ۼ��ؾ� �� ob ����
		

		ob.set();
		ob.input();
		ob.print();
	}
}