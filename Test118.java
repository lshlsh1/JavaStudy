/*================================
	���� Ŭ���� ��� ���� 
	- ��ø Ŭ����
=================================*/

//�޼ҵ� �� Ŭ����

class Test2
{
	static int a=10;	// ��������, �������, static����(Ŭ��������)
	int b=20;			// ��������, �������, instance����(�ν��Ͻ�����)

	// �� ù ��° write()�޼ҵ�
	void write()
	{
		System.out.println("write()...��");
		final int c=30;	// ��������, ���ȭ�Ⱥ���(���̺������ʴº���) 
		int d=40;		// ��������, ���̼��÷κ��Ҽ��ִº���

		// �� ���� c�� ���� d�� �� �� ��������������...
		//	  c�� final�����̱� ������
		//	  �� ��° write() �޼ҵ忡�� ���� �����ϴ���
		//	  ������ ������ ������� �� �ִ�.
		//	  �ݸ鿡 d�� �� ���� ���÷� ������ �� �ִ� ��Ȳ�̹Ƿ�
		//	  LocalTestŬ������ �ν��Ͻ� ���� ������
		//	  ������� �� ���� ������ d�� �����ϴ� ���� ���ؾ� �Ѵ�.

		class LocalTest	// ����Ŭ���� �� �ν��Ͻ� ������ �¾
		{
			// �� �� ���� write() �޼ҵ�
			void write()
			{
				System.out.println("write()...��");
				System.out.println("a : "+a);
				System.out.println("b : "+b);
				System.out.println("c : "+c);
				//System.out.println("d : "+d); // �� D���� ������� ���� �����Ͽ���
			}
		}

		d=10;

		//ù ��° write() �޼ҵ忡�� ������ ���� Ŭ������ �ν��Ͻ�
		LocalTest ob1 = new LocalTest();
		d=20;
		d=30;
		ob1.write();	//-- �� ��° write() �޼ҵ� ȣ��
	}
}

//main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test118
{
	public static void main(String[] args)
	{
		Test2 ob2 = new Test2();
		ob2.write();	//-- ù ��° write() �޼ҵ� ȣ��
	}
}

//���� ���
/*
write()...��
write()...��
a : 10
b : 20
c : 30
*/