/*========================
	���� �迭 ����
	- �迭�� ����
=========================*/

// �� �ǽ� ����
// ������ �迭(a, b)�� ����ִ� ���ڵ��� �������� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �ߺ��� ���ŵ� ������ �������� ����� �� �ֵ��� �Ѵ�.
// ����, �迭 ���� ������ ������� ó���� �� �ֵ��� �Ѵ�.

// ex) ������ �� �迭
// int[] a = {2, 3, 7, 10, 11}
// int[] b = {3, 6, 10, 14}

// ���� ��)
// 2 3 7 10 11 6 14
// �Լ��Ϸ��� �ƹ� Ű�� ��������....

public class Test099_A
{
	public static void main(String[] args)
	{
		//������ �� �迭
		int[] a = {2, 3, 7, 10, 11};
		int[] b = {3, 6, 10, 14};

		//��� ��
		/*
		// - ���� a�� ��ü ��� ���
		for (int i=0 ; i<a.length ; i++)	// a���

			System.out.printf("%3d",a[i]);
		// - ���� b�� ��� ���
		// ��, ����b�� ����a�� ��ҿ� �ߺ��Ǵ� �����͸� 
		// �����ϸ鼭 ���

		for (int i=0 ; i<b.length ; i++)	//4ȸ�� //�����Ÿ��鼭 b�� �������� a�� ��(b���-������ ���)
		{
			boolean flag = false;	//�ߺ����� �ʾҴٴ°��� ����

			for (int j=0; j<a.length ; j++)	//5ȸ��
			{
				if (b[i] == a[j])	//�ߺ��� ���� �߰��ߴٸ�
				{
					flag = true;	//-- �ߺ� Ȯ��
					break;			//-- �����. �׸��� ����������.(j �ݺ��� Ż��)
				}
			}

			if (flag)				//flag�� true��� ...(�ߺ��Ǹ�)
				continue;			//�޺κ� �����ϰ� ����Ѵ�
			System.out.printf("%3d", b[i]);	// �޺κ�
		}
		System.out.println();
		//������
		//  2  3  7 10 11  6 14
		*/


		// ��� ��
		//�迭
		//1.���� ���ݿ�Ҹ� ���ؾ��Ѵ�.
		//2.� ���·ε� ���̸� ��ȭ��ų �� ����
		// - �ӽ� �迭�� �����
		//int[] temp = new int[????];
		int[] temp = new int[a.length + b.length];

		// - ������� �ӽù迭�� �ߺ����� ���� �迭 ��Ҹ� ä�� ����
		int n;	//-- ���� ���� ��ġ �߿�~!!!! check~!!!!
		for (n=0 ; n<a.length ; n++)
		{
			temp[n] = a[n];			// n : 0 1 2 3 4 --------- 5
		}

		for (int k=0 ; k<b.length ; k++)
		{
			boolean flag = false;	//�ߺ����� �ʾҴٴ°��� ����

			for (int m=0; m<a.length ; m++)	
			{
				if (b[k] == a[m])	//�ߺ��� ���� �߰��ߴٸ�
				{
					flag = true;	//-- �ߺ� Ȯ��
					break;			//-- �����. �׸��� ����������.(m �ݺ��� Ż��)
				}
			}

			if (flag)				//flag�� true��� ...(�ߺ��Ǹ�)
				continue;			//�޺κ� �����ϰ� ����Ѵ�
			temp[n] = b[k];			// n => 5 �޺κ�
			n++;
			
		}

		// - �׷��� ������ �ӽ� �迭�� ����Ѵ�.
		for (int h=0 ; h<n ; h++)
		{
			System.out.printf("%3d",temp[h]);
		}System.out.println();
					
		
	}//end main
}

//���� ���
//  2  3  7 10 11  6 14