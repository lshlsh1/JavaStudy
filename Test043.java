/*===============================================
	���� ���� �帧�� ��Ʈ�� ( ��� ) ����
	- �ݺ���(while)�� �ǽ�
=================================================*/

/*
 �� �ݺ����� ����
	
	�־��� ������ �������� ���
	������ ������ ������� �ݺ� �����ϴٰ�
	���ǽ��� ������ �Ǵ� ������ ����,
	�ݺ� ������ �ߴ��ϴ� �����̴�.
	�̿� ���� �ݺ������� ��while��,��do~while����for���� ���� ������
	�ݺ����� ��� ���� ��break��,��continue������
	�Բ� ����ϴ� ��쵵 �ִ�
*/

/*
 �� while ��

	���ǽ��� ���� ���Ͽ�
	���ǽ��� ����� ���� ���, Ư�� ������ �ݺ� �����ϴ� ��������
	�ݺ� Ƚ���� ������ ���� ���� ��쳪
	�ݺ� Ƚ���� ���� ��� �ַ� ����Ѵ�.
	while���� ������ ���� �ʴ� ���
	�ݺ��� Ŀ�� �� �� ���� ������� ���� �� �ִ�.
*/

/*
 �� ���� �� ����
 	while(���ǽ�)
	{
		���๮;
	}
*/


public class Test043
{
	public static void main(String[] args)
	{	
		/*
		int n=0;

		while(n<=10)
		{
			System.out.println("n = " + n);
			n++;
		}
		*/
		
		/*
		int n=0;
		while(n<=10)
		{	
			n++;
			System.out.println("n = " + n);
		}
		*/

		/*
		int n=0;
		while(n<10)
		{	
			System.out.println("n = " + ++n);
		}
		*/

		/*
		int n=0;
		while(n++<10)
		{	
			System.out.println("n = " + ++n);
		}
		*/
		
		// 1 ���� 100������ ���� ����Ͽ�
		// ����� ����ϴ� ���α׷��� �����Ѵ�.
		// ��, while �ݺ����� Ȱ���Ѵ�.

		// ���� ��)
		// 1���� 100������ �� : 5050
		// ����Ϸ��� �ƹ� Ű�� ��������

		// �� ���� �ν� �� �м�
		//	  1. ��� ������ �ݺ����� ���� �ۿ� ��ġ�ؾ� �Ѵ�.
		//	  2. 1���� 1�� ������ ������ �������� ���� ����
		//		 �� ���� ������ �ʿ��ϴ�.

		// 1���� ���ʷ� ��� 1�� �����ϴ� ���� ���� �� �ʱ�ȭ
		int n = 1;

		// �������� ����Ͽ� ��Ƴ� ���� ���� �� �ʱ�ȭ
		int sum = 0;
		
		// ���� �� ó��(�ݺ��� ����)
		while(n <=100)
		{		
			// n�� 1�� ������ ������ ���� �ʿ�~!!!
			// ������ n��ŭ �������� ���� ����(sum)��
			// �� ��ŭ��(n��ŭ��) ������ ������ ���� �ʿ�~!!!
			
			sum += n; // sum�� n��ŭ�� �������Ѷ�...
			n++;	  // n�� 1��ŭ�� �������Ѷ�...
		}

		//��� ���
		System.out.println("1���� 100������ �� : "+ sum);
	}
}

//���� ���
/*
n = 0
n = 1
n = 2
n = 3
n = 4
n = 5
n = 6
n = 7
n = 8
n = 9
n = 10
*/

//���� ���
/*
n = 1
n = 2
n = 3
n = 4
n = 5
n = 6
n = 7
n = 8
n = 9
n = 10
n = 11
*/

//���� ���
/*
n = 1
n = 2
n = 3
n = 4
n = 5
n = 6
n = 7
n = 8
n = 9
n = 10
*/

//���� ���
/*
n = 2
n = 4
n = 6
n = 8
n = 10
*/