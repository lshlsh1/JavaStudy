/*================================
	���� Ŭ���� ��� ���� 
	- ��ø Ŭ����
=================================*/

/*
 �� Anonymous Ŭ���� (�͸��� Ŭ����, ���� Ŭ����)

	- awt �� �ȵ���̵� �̺�Ʈ(����ڰ��ϴ� ��� ����) ó������ �Ϲ������� ���
	- ���� Ŭ���� �޼ҵ带 �ϳ� ���� �������� �ʿ伺�� ���� �� ���
	- Ŭ������ ��ü�� �ʿ��ϸ� �� �ٽ� Ŭ������ �����ؾ� �ϴ�
	  ���ŷο� ������ �͸��� Ŭ������ �����Ͽ� ó���Ѵ�

 �� ���� �� ����

	new ���� Ŭ������ ������()
	{
		�������������� �ڷ��� �޼ҵ�()
		{
			//....
		}
	}; �� �ݵ�� �����ݷ� �ʿ���~!!!!

 �� �������� ���� ���� ��(Ž���� �󿡼�)
	��Ŭ������$1.class�������� �����Ǹ�
	$ ���� ���ڰ� ���������� �ο��ȴ�.
*/

//import java.lang.*; //���ڹپ��� �⺻���� ��Ű��


class Test3	//extends Object
{
	/*
	....
	..
	.
	.
	....
	*/

	public Object getString()
	{
		// return ______; �� Object
		//	  ��
		//Object ob = new Object();
		//return ob;
		//	  ��
		//return new Object();
		//	  ��
		//return new Object(){�߾��߾�};
		//	  ��
		//return new Object()
		//	{�߾��߾�};
		//	  ��
		return new Object()	//��ü�� ������
		{
			@Override
			public String toString()
			{
				return "�͸��� Ŭ����....";
			}
		};	// �� �����ݷ�(�� �ۼ��� ���� �߻�)
	}
	
}

public class Test120 // extends Object //���� Ŭ������ Object�� ��� ��ӹ޾ƿԴ�!
{
	public static void main(String[] args)
	{
		//new Scanner();
		//������ �ν��Ͻ� ���������� �̰Ÿ� �ȴ�.

		Test3 ob1 = new Test3();

		System.out.println(ob1.toString());
		//--==>>Test3@15db9742	//���� toString�� �ϴ� ��

		Test3 ob2 = new Test3();

		System.out.println(ob2.getString());
		//--==>>�͸��� Ŭ����....
	}
}