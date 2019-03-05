/*=================================
	���� Ŭ���� ��� ����
	- �߻� Ŭ����(Abstract)
==================================*/

/*
 �� �߻� Ŭ����(abstract)��
	���� �ְ� ���ǰ� ���� �ϳ� �̻��� �޼ҵ�(�߻� �޼ҵ�)�� ���� Ŭ������
	���� Ŭ�������� �������̵�(Overriding)�� ������ ����Ǵ� �޼ҵ忡 ����
	�޸� ���� ���� �̸� ȣ�� ��ȹ�� �����α� ���� �����.

 �� ���� �� ����
	[��������������] abstract class Ŭ������
	{
		[��������������] abstract �ڷ��� �޼ҵ��([�Ű�����]. ...);
	}

 �� Ư¡
	Ŭ������ ��� �ϳ� �̻��� �߻� �޼ҵ带 ������ ��
	�� Ŭ������ Ŭ���� �̸� �տ� ��abstract�� Ű���带 �ٿ�
	�߻� Ŭ������ ����ؾ� �ϸ�
	�߻� Ŭ������ ������ ��쿡��
	�ҿ����� ������ Ŭ�����̹Ƿ� ��ü�� ������ �� ����
	�߻� �޼ҵ尡 �������� �ʴ� �߻� Ŭ����������
	��ü�� ������ �� ���� ���̴�

	��, �߻� Ŭ������ ���������� ������ �� ���� ������
	����� ���ؼ��� �����ϸ�
	�߻� Ŭ�������� ��ӹ��� ���� Ŭ����������
	�ݵ�� �߻� �޼ҵ带 �������̵�(Overriding)�ؾ� �Ѵ�

�� ��abstract�� Ű�����
	Ŭ������ �޼ҵ忡���� ����� �� ������
	��� ������ ���� ���������� ��� �Ұ��ϴ�.

	abstract class AŬ����
	{
		abstract int �޼ҵ��();
	}

	abstract class BŬ����
	{
		......;
		....;
	}
	abstract class CŬ���� extends AŬ����
	{
	}
	
	class DŬ����
	{
		main()
		{
			AŬ���� ob1 = new AŬ����(); ---(X)
			BŬ���� ob2 = new BŬ����(); ---(X)
			CŬ���� ob3 = new CŬ����(); ---(X)
			DŬ���� ob4 = new DŬ����(); ---(X)

		}
	}
*/

// �߻� Ŭ���� (abstract)
abstract class SortInt
{
	private int[] value;

	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}

	// �߻� �޼ҵ�(abstract)
	protected abstract void sorting();

	protected int dataLength();
	{
		return value.length;
	}
	
	//compare()�޼ҵ�� ũ�� �� �޼ҵ�
	// ��final��Ű����� ���� �� Ŭ����(SortInt)�� ��ӹ޴� Ŭ��������
	// �� �޼ҵ带 ������ �� �� ����.
	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
			return 0;
		else if(x>y)
			return 1;
		else
			return -1;
	}
	
	// swap() �޼ҵ�� �ڸ� �ٲ� �޼ҵ�
	// ��final�� Ű����� ���� �� Ŭ����(SortInt)�� ��ӹ޴� Ŭ��������
	// ��� �� �޼ҵ常ŭ�� Overriding�ؼ� ������� ���ƶ�~!!!
	//��� �ǹ� ����
	protected final int swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
}

//SortInt(�߻� Ŭ����)�� ��ӹ��� Ŭ���� �� �߻� Ŭ���� �� �߻� �޼ҵ� ������ �� �Ϲ� ���� Ŭ����
public class Test110_c		extends SortInt
{
	/*��ӹ��� ��
	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}

	protected abstract void sorting();

	protected int dataLength();
	{
		return value.length;
	}
	
	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
			return 0;
		else if(x>y)
			return 1;
		else
			return -1;
	}
	
	protected final int swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}*/

	int i, j;
	static int[] data = {7, 10, 3, 8, 7};
	//--------------------------------------------

	protected void sorting()
	{
		for (int i=1; i<data.length ; i++)
		{
			for (int j=0 ; j<data.length-i ; j++ )
			{	
				
				if (compare(i.j)==0)
				{
					swap(i,j);
				}
				
			}
		}
			
	}


	//---------------------------------------------

	public static void main(String[] args)
	{
		//SortInt ob = new SortInt();

		System.out.print("Source data : ");
		for (int n: data)
		{
			System.out.println(n+" ");
		}System.out.println();

		Test110_c ob = new Test110_c();
		ob.sort(data);

		System.out.print("Sorted Data : ");
		for (int n : data)
		{
			System.out.println(n+" ");
		}System.out.println();
		

	}
}
