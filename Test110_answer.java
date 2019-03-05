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

	// �߻� �޼ҵ�
	protected abstract void sorting();

	protected int dataLength()
	{
		return value.length;
	}
	
	// compare() �޼ҵ�� ũ�� �� �޼ҵ�
	// "final" Ű����� ���� �� Ŭ����(SortInt)�� ��� �޴� Ŭ��������
	// �� �޼ҵ带 �������� �� ����.
	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
			return 0;

		else if (x>y)
			return 1;

		else
			return -1;
	}
	
	// swap() �޼ҵ�� �ڸ� �ٲ� �޼ҵ�
	// "final" Ű�͵�� ���� �� Ŭ����(SortInt)�� ��ӹ޴� Ŭ��������
	// ��� �� �޼ҵ常ŭ�� Overriding �ؼ� ������� ���ƶ��� �ǹ� ����
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
}


//SortInt(�߻� Ŭ����)�� ��ӹ��� Ŭ���� �� �߻� Ŭ���� �� �߻� �޼ҵ� ������ �� �Ϲ� ���� Ŭ����
//public abstract class Test110_answer	extends SortInt
public class Test110_answer		extends SortInt
{
	int i, j;
	static int[] data = {7, 10, 3, 8, 7};
	//--------------------------------------------
	//��ĭ ä���ֱ�
	@Override
	protected void sorting()
	{
		//����(Sort) �˰����� �����ض�
		for ( i=0 ; i<dataLength()-1; i++ )
		{
			for (j=i+1 ;j<dataLength() ; j++ )
			{
				if (compare(i,j)>0)	//ũ��� (���ı���)
				{
					swap(i, j);
				}
			}

			//�߰�
			System.out.print((i+1) + "Round Data : ");
			for (int n: data )
			{
				System.out.print(n+" ");
			}System.out.println();
		}


	}

	//---------------------------------------------
	public static void main(String[] args)
	{
			System.out.print("Source data : ");
		for (int n: data)
		{
			System.out.print(n+" ");
		}System.out.println();
		System.out.println();

		Test110_answer ob = new Test110_answer();
		ob.sort(data);

		System.out.println();
		System.out.print("Sorted Data : ");
		for (int n : data)
		{
			System.out.print(n+" ");
		}System.out.println();
	}
}
