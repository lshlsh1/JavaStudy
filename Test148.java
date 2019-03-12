/*=========================================
	���� ����(Exception) ó�� ����
	- �ٸ� ���� �ٽ� ������
==========================================*/
//-- ���ܻ�Ȳ������ return���� ���������� ������� �ʴ´�.

public class Test148
{
	public int getValue(int value)	throws Exception	//�Ķ� ��ź ������
	{
		int a =0;

		try
		{
			a = getData(-2); 
			//-- a������ ���� ��ź ��Ƴ���
		}
		catch (Exception e)
		{
			//�������� ���� ��ź ó��
			System.out.println("printStackTrace....(getValue)");
			e.printStackTrace();

			//���ܹ߻� -- �������� �Ķ� ��ź
			throw new Exception("value�� �����Դϴ�.");
		}
		return a;
		
	}

	public int getData(int data)	throws Exception	//������ź ������
	{
		if (data<0)
			throw new Exception("data�� 0���� �۽��ϴ�.");
			//-- ���� �߻� �������� ���� ��ź		

		return data+10;

	}
	public static void main(String[] args)
	{

		Test148 ob = new Test148();

		try
		{
			int a = ob.getValue(-2);
			System.out.println("a : "+a);
		}
		catch (Exception e)		//�Ķ� ��ź ���
		{
			System.out.println("printStackTrace....(main)");
			e.printStackTrace();
		}
	}
}

//������
/*
printStackTrace....(getValue)
java.lang.Exception: data�� 0���� �۽��ϴ�.
        at Test148.getData(Test148.java:34)
        at Test148.getValue(Test148.java:14)
        at Test148.main(Test148.java:48)
printStackTrace....(main)
java.lang.Exception: value�� �����Դϴ�.
        at Test148.getValue(Test148.java:24)
        at Test148.main(Test148.java:48)
*/