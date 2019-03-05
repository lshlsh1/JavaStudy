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
	//���� ����
	int num;			//�л� ���� ���� ������ �����Ѵ�.
	Record[] rcArray;	// Record ��ü�� ���� �迭 ���� ��ġ int[] arr ó��
	
	@Override			//�������̵��� ����Ͽ� SungjukImpl�� abstract�� ���ֺ���
	public void set()	
	{	
		//��ĳ�� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		
		do	//�ο����� �Է¹޴´�
		{	
			System.out.print("�ο� �� �Է�(1-10) : ");
			num = sc.nextInt();
		}
		while (num<1 || num>10);	//�ο����� 1���� 10�� ���̷� �����Ѵ�.
		
		rcArray = new Record[num];	//�� �ο����� �̿��Ͽ� Record�迭�� ũ�⸦ ���ϵ��� �Ѵ�
	}

	@Override
	public void input()	
	{	
		// ������ �Է¹ޱ����� ��ĳ�� �ν��Ͻ��� �����Ѵ�.
		Scanner sc = new Scanner(System.in);

		for (int i=0 ; i<num ; i++)	//for���� �̿��Ͽ� �Է¹��� �ο�����ŭ �ݺ��Ѵ�
		{
			rcArray[i] = new Record();	//�迭�� ����Ǵ� ���� record�� ������� �� �迭�� ������ �Էµȴ�.
			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ",i+1); //i�� 0���� ���۵ǹǷ� 1�� ��������
			rcArray[i].hak = sc.next();
			rcArray[i].name =  sc.next();	//������ �̸��� �Է¹޴´�.
	
			System.out.print("���� ���� ���� ���� �Է�	  (���� ����) : ");
			rcArray[i].kor = sc.nextInt();
			rcArray[i].eng = sc.nextInt();
			rcArray[i].mat = sc.nextInt();	//���� ���� ���������� �Է¹޴´�.

			rcArray[i].tot = rcArray[i].kor+rcArray[i].eng+rcArray[i].mat;
			// �迭�Է°��� ��� ���Ͽ� �հ谪�� ����Ѵ�

			rcArray[i].avg = rcArray[i].tot/3;
			// �������̹Ƿ� 3���� ������ ��հ��� ���Ѵ�
		}
	}

	@Override
	public void print()
	{	
		int[] score = new int[3];	//������ ���� �迭 ����
		char[] grade = new char[3]; //����̾簡 ����� ���� �迭 ����
									// �ѱ����̹Ƿ� char���� �̿��ϱ�� ����

		for (int i=0; i<num ; i++)
		{	
			//���� (����,����,����)�� ����, ��հ� ����ϱ�
			System.out.printf("%s %s \t %3d %3d %3d \t%5d %3d\n",rcArray[i].hak, rcArray[i].name,rcArray[i].kor, rcArray[i].eng, rcArray[i].mat,rcArray[i].tot,rcArray[i].avg);
			
			System.out.print("\t\t"); //���� ���߱� ���� ���� ����

			//����� �Ǵ��ϱ����� �� ������ ������ �迭�� �ֱ�
			score[0] = rcArray[i].kor;
			score[1] = rcArray[i].eng;
			score[2] = rcArray[i].mat;
			

			for (int j=0; j<grade.length; j++)
			{
				if (score[j]>89)			
					grade[j] = '��';	// 100~90 ��

				else if (score[j]>79)	// 89~80 ��
					grade[j] = '��';		

				else if (score[j]>69)	// 78~70 ��
					grade[j] = '��';		
				
				else if (score[j]>59)	// 69~60 ��
					grade[j] = '��';		
				
				else
					grade[j] = '��';	// �� �ܴ̿� ���� ó��	
			}

			// ���񺰷� ���� ����ϱ����� n�� 3�̸�����
			for (int n=0; n<3; n++)
			{
				System.out.print(grade[n] + "  "); //��ް� ���
			}System.out.println();
		
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