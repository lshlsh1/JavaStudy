/*=================================
	���� Ŭ���� ��� ����
	- ���(Inheritance)
==================================*/

/*
 �� �޼ҵ� �������̵�(Method Overriding)�� Ư¡
 
 	- �޼ҵ� �̸�, ���� Ÿ��, �Ķ���� ���� Ÿ���� ������ ��ġ�ؾ��Ѵ�.
	- �ݵ�� ��Ӱ��谡 �־�� �Ѵ�
	- �����ǵ� ���� Ŭ������ �޼ҵ� �������������ڴ�
	  ���� Ŭ������ �޼ҵ� �������������ں��� ������ ũ�ų� ���ƾ��Ѵ�.
	  ���� ���, ���� Ŭ���� �޼ҵ��� �������������ڰ� ��protected���� ���
	  ���� Ŭ������ �� �޼ҵ带 �������̵�(Overriding)�ϴ� ���
	  �������������ڴ� ��protected���Ǵ� ��public���̾�� �Ѵ�.
	- ��static��, ��final��, ��private���޼ҵ�� �������̵�(Overriding)�� �� ����.
	- Exception�� �߰��� �Ұ����ϴ�.
	- ��, ���� Ŭ������ �޼ҵ尡 ������ �ִ� ���� ���� ���׿� 
	  ���ο� Exception�� �߰��ϴ� ���� �Ұ����ϴٴ� ���̴�.

	- �������� �޼ҵ带 Ʃ���Ѵٴ� ����
	- protected�� ���� ����� �����صΰ� ��������Ŷ�� ������ �� �ִ�
*/

// ���� Ŭ����, �θ� Ŭ����,super class
class SuperTest03
{
	private int a=5;
	protected int b=10;		//������
	public int c=20;		//����

	public void write()
	{
		System.out.println("Super write() �޼ҵ� : "+a+" : "+b+" : "+c);
	}
}

// ���� Ŭ����, �ڽ� Ŭ����, sub class
class SubTest03 extends SuperTest03
{
	/* ��ӹ޴� ����
	protected int b=10;
	public int c=20;

	public void write()
	{
		System.out.println("Super write() �޼ҵ� : "+a+" : "+b+" : "+c);
	}	
	*/

	protected int b = 100;	//������
	//������ �����ǰ� ����
	//���� ���� �� �ʱ�ȭ

	public void print()
	{
		//System.out.println("Sub print()�޼ҵ� : "+a+" : "+b+" : "+c)'
		/*--==>> private ������
		Test109.java:53: error: illegal line end in character literal
                System.out.println("Sub print()�޼ҵ� : "+a+" : "+b+" : "+c)'*/
		//System.out.println(b);									//������
		//--==>>10(b ���� ��)
		//--==>>100(b ���� ��) -- ����� b�� �����ϱ⶧��
		//System.out.println(this.b);								//��������
		//--==>>100
		//System.out.println(super.b);								//�θ�κ��� �������� ������
		//--==>>10

		System.out.println("Sub print()�޼ҵ� : "+b+" : "+c);				
		//--==>> Sub print() �޼ҵ� : 100 : 20
		//-- ���� Ŭ����(SuperTest03)���� ����� ���� a���� ������ �� ����.
		// �� private �����̱� ������...

		System.out.println("Sub print()�޼ҵ� : "+super.b+" : "+c);		
		//--==>> Sub print()�޼ҵ� : 10 : 20
		//-- ���� Ŭ����(SuperTest03)���� ������ ����b�� �����ϱ� ���ؼ���
		// ��super��Ű���带 ����ϸ� �����ϴ�

		System.out.println("Sub print()�޼ҵ� : "+c);						//����
		System.out.println("Sub print()�޼ҵ� : "+this.c);					//������
		System.out.println("Sub print()�޼ҵ� : "+super.c);					//�θ�κ��� �������� ����
		//--==>>Sub print()�޼ҵ� : 20
		//		Sub print()�޼ҵ� : 20
		//		Sub print()�޼ҵ� : 20
		//-- ����Ŭ�������� ����� ���� c�� �����ϴ� ������
		//	 �ƹ��� ����� ������ ����.
	}

	@Override
	public void write()
	{
		
		//System.out.println("Sub write()�޼ҵ� : "+a+" : "+b+" : "+c);
		System.out.println("Sub write()�޼ҵ� : "+b+" : "+c);
		//--==>>Sub write()�޼ҵ� : 100 : 20
		//-- ���� Ŭ�������� ����� ���� a�� ������ �� ����
		//	 �� private �����̱� ������...
		//	���� �� �� ������ ���� b�� �θ�� ���� �������� b�� �ƴ�
		//	�ڽ��� ���� b�� ���� �� �� �ִ�.
	}



}
//print() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test109
{
	public static void main(String[] args)
	{
		//���� Ŭ����(SubTest03) �ν��Ͻ� ����
		SubTest03 ob = new SubTest03();
		
		ob.print();

		ob.write();
		//--==>> Super write() �޼ҵ� : 5 : 10 : 20
		//����Ŭ�������� override�ϱ� �� �θ�Ŭ������ write�� ��µȴ�.

		System.out.println("------------------------------------���м�");

		((SuperTest03)ob).write();				//check~!!
		//--==>>Sub write()�޼ҵ� : 100 : 20
		// ob�� SuperTest03���� ����ȯ�� �ߴٰ��ϴ��� 
		// �޼ҵ�� ����⸦ �ؼ� ������ �ϱ⶧���� �θ�Ŭ������ ���� �޼ҵ�� ���ư� �� ����
		
		// �� ���� �θ�
		//�׷��� �Ʒ��� ���� ������ �ܺ��� �ٸ� Ŭ���� ������ ����Ŭ������ ������ �����ϴٴ� ���� �� �� �ִ�.
		System.out.println(ob.b);
		//--==>>100
		System.out.println(((SuperTest03)ob).b); //check~!!
		//--==>>10

		// �� �޼ҵ�� ������ �� �����Ͽ� ������ ��
		

	}
}