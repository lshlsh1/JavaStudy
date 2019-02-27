/*=====================================================
	���� �޼ҵ� �ߺ�����(Method Overloading) ����
=======================================================*/

/*
 �� �޼ҵ� �ߺ����� ����
	��, ����, ������ �޴� ���� �̸��� �޼ҵ� �̾߱�
	�޼ҵ� �ߺ�����(Method Overloading)�� 
	�޼ҵ尡 ó���ϴ� ����� ����(Ȥ�� �ſ� �����ϰ�)
	�޼ҵ� ��ȣ �ӿ� �Ѱ��ְ� �Ǵ� �μ�(����, �Ű�����, �Ķ����)�� ������ �ٸ��ų�
	�ڷ���(data Type)�� �ٸ����
	�żҵ��� �̸��� ������ �̸����� �ο��Ͽ� �޼ҵ带 ������ �� �ֵ���
	���������� ����ϰ� �Ǵµ�
	�̸� �޼ҵ� �����ε�(Method Overloading) �̶�� �Ѵ�.
*/

/*
public class Test095 �� ����Ұ�
{
	public static void main(String[] args)		//Ŭ���� �޼ҵ�
	{
		drawline();
	}

	//���� �׸��� �޼ҵ� ����
	public void drawline()						//�ν��Ͻ� �޼ҵ� ��
	{
		System.out.println("====================");	//20��
		
	}
}
*/

public class Test095
{
	public static void main(String[] args)		
	{
		drawline();

		//drawline2("*",20) �� ������~!

		drawline('-');
		
		drawline('+');

		drawline('>',80);

		drawline('*',50);
	}

	//���� �׸��� �޼ҵ� ����
	public static void drawline()						
	{
		System.out.println("====================");	//20��
		
	}

	//���� ���¸� �ٲپ� �׸��� �޼ҵ� ����
	//public static void drawline2(char c)
	public static void drawline(char c)
	{
		for ( int i=0 ; i<20 ; i++ )
		{
			System.out.print(c);
		}
		System.out.println();
	}

	//���� ���¿� ���̸� �ٲپ� �׸��� �޼ҵ� ����
	//public static void drawline3(char c, int n)
	public static void drawline(char c, int n)
	{
		for (int i=0 ; i<n ; i++ )
		{
			System.out.print(c);
		}System.out.println();
	}



}



//���� ���
/*
====================
--------------------
++++++++++++++++++++
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
**************************************************
*/

