/*=====================================
	���� ����(Sort) �˰��� ����
	-- ���� ���� ����(Bubble Sort)
=======================================*/

/*
 �� �ռ� ������ Selection Sort �� Bubble Sort�� ������ ����(�ݺ��� Ƚ���� ����)
	������ ���� Bubble Sort�� ��� �������� ������ ����
	�Ϲ� Bubble Sort �� Selection Sort ���� ������ ����.

���� ������ =	61  15  20  22  30
				15  20  22  30  61  -- 1ȸ�� (���� �߻� true) -- ���� ȸ�� ��
				15  20  22  30  61  -- 2ȸ�� (���� �߻� false) -- ���� ȸ�� ��
				
==> 1ȸ�� ���� ... 2ȸ�� ����... �� �غ��Ҵ���...
	2ȸ���� �����ϴ� �������� ������ ���� �Ͼ�� �ʾұ� ������
	���ʿ��� �߰� ����(ȸ��, �ݺ�)�� �������� �ʴ´�.

*/
public class Test104
{
	public static void main(String[] args)
	{
		int[] a = {10, 50, 20, 33, 40};
		/*
		10, 50, 20, 33, 40			default

		---------------------------------------
		
		10, 50, 20, 33, 40			0	1
		==	==

		10, 20, 50, 33, 40			1	2
			==	==

		10, 20, 33, 50, 40			2	3
				==	==
		
		10, 20, 33, 40, 50			3	4
					==	==
		
		---------------------------------------1ȸ��
		
		10, 20, 33, 40, 50			
		==	==						0	1
			==	==					1	2
				==	==				2	3

		---------------------------------------2ȸ�� // (���� �߻� false) -- ���� ȸ�� ��
		*/

		System.out.print("Sort : ");
		for (int n : a)
		{
			System.out.print(n+" ");
		}System.out.println();

		/*
		for (int i=1 ; i<a.length ; i++)				
		{
			boolean flag = false;
			System.out.println("��");								
			for ( int j=0 ; j<(a.length-1)-i ; j++ )	
			{
				System.out.println("��");											

				if (a[j]>a[j+1])						//�������� ����
				//if (a[j]<a[j+1])						//�������� ����
				{
					//�ڸ� �ٲٱ�
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];
					flag = true;
				}
			}

			if (flag==false)
				break;
		}

		System.out.print("sorted data : ");
		for (int n : a)
		{
			System.out.print(n+" ");
		}System.out.println();
		*/

		//���� Bubble Sort ����

		int pass=0;
		boolean flag;
		do
		{
			flag=false;
			pass++;
			for (int i=0 ; i<a.length-pass ; i++ )
			{
				if (a[i]> a[i+1])
				{
					//�ڸ� �ٲٱ�
					a[i] =a[i]^a[i+1];
					a[i+1]=a[i+1]^a[i];
					a[i]=a[i]^a[i+1];

					flag = true;
				}
			}
		}
		while (flag);
		// ȸ���� ���������� �߻��ϴ� ���� ������ �Ͼ�� ���� ����
		// �� �̻��� �ݺ��� ������ ���ǹ��� ������ �Ǵ�~!!!!

		System.out.print("sorted data : ");
		for (int n : a)
		{
			System.out.print(n+" ");
		}System.out.println();

	}
}

// ������
/*
Sort : 10 50 20 33 40
sorted data : 10 20 33 40 50
*/