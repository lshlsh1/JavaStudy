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

public class Test158	extends Menus
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
	/*
	public void setCon(String con)
	{
		this.con = con;
	}
	public String getCon();
	{
		return con;
	}
	public void setSel(Integer sel)
	{
		this.sel = sel;
	}
	public Integer getSel()
	{
		return sel;
	}*/

	//�޴� ��� �޼ҵ�
	public static void menuDisp()
	{
		System.out.println();
		System.out.println("[�޴� ����]");
		System.out.println("1.��� �߰�");
		System.out.println("2.��� ���");
		System.out.println("3.��� �˻�");
		System.out.println("4.��� ����");
		System.out.println("5.��� ����");
		System.out.println("6.����");
	}

	//�޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException
	{
		System.out.print(">> �޴� ����(1-6) : ");
		sel = Integer.parseInt(br.readLine());
	}

	//���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException
	{
		switch (sel)
		{
			case E_ADD : addElement(); break;
			case E_DISP : dispElement(); break;
			case E_FIND : findElement(); break;
			case E_DEL : delElement(); break;
			case E_CHA : chaElement(); break;
			case E_EXIT : exit(); break;
		}
	}

	//��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException
	{
		int n=0;
		do
		{
			n++;
			System.out.printf("%d��° ��� �Է� : ",n);
			
			vt.add(br.readLine());
			System.out.printf("%d��° ��� �Է� ����~!!!\n2",n);

			System.out.printf("��� �Է� ���(Y/N)? : ");
			con = br.readLine();
		
			if (!con.equals("y") && !con.equals("Y"))
					break;
		}
		while (true);
	}
	
	//��� ��� �޼ҵ�
	public static void dispElement()
	{
		System.out.println("[���� ��ü ���]");
		for (Object str : vt)
			System.out.println(str + " ");
		
		System.out.println("[���� ��¿Ϸ�]");

	}

	//��� �˻� �޼ҵ�
	public static void findElement() throws IOException
	{
		System.out.print("�˻��� ��� �Է� : ");
		String s1 = br.readLine();
		if (vt.contains(s1))
		{
			System.out.println("�׸��� �����մϴ�.");
		}
		else
		{
			System.out.println("�׸��� ���������ʽ��ϴ�.");
		}
	}
	
	//��� ���� �޼ҵ�
	public static void delElement()  throws IOException
	{
		System.out.print("������ ��� �Է� : ");
		
		String s1 = br.readLine();
		if (vt.contains(s1))
		{
			vt.remove(s1);
			System.out.println("�׸��� �����߽��ϴ�");
		}
		else
		{
			System.out.println("�׸��� �������� �ʾ� ������ �� �����ϴ�.");}
	}
	
	//��� ����(����) �޼ҵ�
	public static void chaElement()  throws IOException
	{
		System.out.print("������ ��� �Է� : ");
		String s1 = br.readLine();
		if (vt.contains(s1))
		{
			vt.remove(s1);
			System.out.print("������ ���� �Է� : ");
			vt.add(br.readLine());
		}
		else
		{
			System.out.println("�׸��� �������� �ʾ� ������ �� �����ϴ�.");
		}
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