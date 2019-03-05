/*================================
	���� Ŭ���� ���� ���� 
	- �������̽�(Interface)
=================================*/

// �������̽�
interface Demo
{
	public void write();
	public void print();
}

// �������̽��� �����ϴ� Ŭ����
abstract class DemoImpl			implements Demo
{
	@Override
	public void write()
	{
		System.out.println("write() �޼ҵ� ������...");
	}
	
	//public void print();
}

//�߻� Ŭ������ ��ӹ��� �߻� Ŭ����
//abstract class DemoImplSub			extends DemoImpl
//		��
//�߻� Ŭ������ ��ӹ��� �Ϲ� Ŭ����
class DemoImplSub						extends DemoImpl
{
	public void print()
	{
		System.out.println("print() �޼ҵ� ������...");
	}
}

public class Test114
{
	public static void main(String[] args)
	{

		//Demo ob1 = new Demo();			//-- �������̽� �� �ν��Ͻ� ���� �Ұ�
		//DemoImpl ob2 - new DemoImple();	//-- �߻�Ŭ���� �� �ν��Ͻ� ���� �Ұ�

		DemoImplSub ob3 = new DemoImplSub();

		ob3.write();
		ob3.print();
		//--==>>
	}
}