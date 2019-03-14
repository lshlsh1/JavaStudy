/*========================================
	���� �÷��� (Collection) ����
	- Vector
========================================*/

// �� �ǽ� ����
// ���� �ۼ����� Test158 Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�.

/*
���� ��)
	
	[�޴� ����]
	1.��� �߰�
	2.��� ���
	3.��� �˻�
	4.��� ����
	5.��� ����
	6.����
	>> �޴� ����(1-6) : 

	1��° ��� �Է� : ���Ѿ�
	1��° ��� �Է� ����~!!!
	��� �Է� ���(Y/N)? : y
	
	2��° ��� �Է� : ��ȫ��
	2���� ��� �Է� ����~!!!!
	��� �Է� ���(Y/N)? : n

	[�޴� ����]
	1.��� �߰�
	2.��� ���
	3.��� �˻�
	4.��� ����
	5.��� ����
	6.����
	>> �޴� ����(1-6) : 2

	[���� ��ü ���]
		���Ѿ�
		��ȫ��
	���� ��ü ��� �Ϸ�~!!!!

	[�޴� ����]
	1.��� �߰�
	2.��� ���
	3.��� �˻�
	4.��� ����
	5.��� ����
	6.����
	>> �޴� ����(1-6) : 3

	�˻��� ��� �Է� : ���Ѿ�

	[�˻� ��� ���]
	�׸��� �����մϴ�.

	[�޴� ����]
	1.��� �߰�
	2.��� ���
	3.��� �˻�
	4.��� ����
	5.��� ����
	6.����
	>> �޴� ����(1-6) : 4
	
	������ ��� �Է� : ���ȯ
	
	[���� ��� ���]
	�׸��� �������� �ʾ� ������ �� �����ϴ�.

	[�޴� ����]
	1.��� �߰�
	2.��� ���
	3.��� �˻�
	4.��� ����
	5.��� ����
	6.����
	>> �޴� ����(1-6) : 5
	
	������ ��� �Է� : ��ȫ��
	������ ���� �Է� : �輱��

	[���� ��� ���]
	������ �Ϸ�Ǿ����ϴ�.

	[�޴� ����]
	1.��� �߰�
	2.��� ���
	3.��� �˻�
	4.��� ����
	5.��� ����
	6.����
	>> �޴� ����(1-6) : 6

	���α׷� ����
	����Ͻ÷��� �ƹ� Ű��....
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.util.Vector;
import java.io.InputStreamReader;

class Menus
{	
	public static final int E_ADD=1;		//��� �߰�
	public static final int E_DISP=2;		//��� ���
	public static final int E_FIND=3;		//��� �˻�
	public static final int E_DEL=4;		//��� ����
	public static final int E_CHA=5;		//��� ����
	public static final int E_EXIT=6;		//����
}


public class Test158_Test	extends Menus
{	
	// �ֿ� �Ӽ� ���� -- �ϼ�
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;				//-- ���� ��
	private static String con;				//-- ��� ����
	
	//static �ʱ�ȭ �� -- �ϼ�
	static 
	{
		//Vector �ڷᱸ�� ����
		vt = new Vector<Object>();

		//BufferedReader Ŭ���� �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		//����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";

	}
	//�޴� ��� �޼ҵ�
	public static void menuDisp()
	{
	}

	//�޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException
	{
	}

	//���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException
	{
	}

	//��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException
	{
	}

	//��� ��� �޼ҵ�
	public static void dispElement()
	{
	}

	//��� �˻� �޼ҵ�
	public static void findElement() throws IOException
	{
	}

	//��� ���� �޼ҵ�
	public static void delElement()  throws IOException
	{
	}

	//��� ����(����) �޼ҵ�
	public static void chaElement()  throws IOException
	{
	}

	//���α׷� ���� �޼ҵ� -- �ϼ�
	public static void exit()
	{
		System.out.println("\n\t���α׷� ����~!!!!");
		System.exit(-1);
	}

	//main()�޼ҵ� -- �ϼ�
	public static void main(String[] args) throws IOException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}
}

