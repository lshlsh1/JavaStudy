/*=======================================
	���� Ŭ������ �ν��Ͻ� ����
	- ������(Constructor)
========================================*/

class NumberTest2
{
	int num;

	/*
	// default ������
	NumberTest2()
	{
		//�� ����ִ� ����
	}
	*/
	
	// ����� ���� ������ �� ���ڸ� ���޹޴� ������
	NumberTest2(int n)
	{
		num = n;
		//�ð����� Ȯ���� ���� ��� ���� ����
		System.out.println("���� ���� : "+n);
	}

	int getnum()
	{
		return num;
	}

	
}



// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test075
{
	public static void main(String[] args)
	{

		//NumberTest2 Ŭ���� ����� �ν��Ͻ� ����
		//NumberTest2 ob = new NumberTest2();
		//-- ����� ���� �����ڸ� ������ ���� ������ ���� �߻�
		//	 NumberTest2 Ŭ��������
		//	 ����� ���� �����ڰ� �����ϰ� �ִ� ��Ȳ�̱� ������
		//	 ��default �����ڡ��� �ڵ����� ��������(���Ե���) �ʴ´�.

		// NumberTest2 Ŭ���� ����� �ν��Ͻ� ����
		NumberTest2 ob = new NumberTest2(10);
		//--==>> ���� ���� : 10
		//-- �ν��Ͻ� ������ ���ÿ� ���ڰ��� �ִ� ����� ���� ������ ȣ��~!!!!
		

		System.out.println("�޼ҵ� ��ȯ �� : "+ob.getnum());
		//--==>> �޼ҵ� ��ȯ �� : 10

		//NumberTest2 Ŭ���� ����� �ν��Ͻ� ����
		NumberTest2 ob2 = new NumberTest2(2582);
		//--==>> ���� ���� : 10

		System.out.println("�޼ҵ� ��ȯ �� : "+ob.getnum());
		//--==>> �޼ҵ� ��ȯ �� : 2582

		

		

	}
}