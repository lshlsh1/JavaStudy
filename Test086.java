/*==============================
	���� �迭 ����
	- �迭�� �迭(2���� �迭)
==============================*/

// �� �ǽ� ����
// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭(5x5)�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
  1  2  3  4  5
  6  7  8  9 10
 11 12 13 14 15
 16 17 18 19 20
 21 22 23 24 25
 ����Ͻ÷��� �ƹ� Ű�� ��������....
*/

public class Test086
{
	public static void main(String[] args)
	{
		/*
		int[][] day = new int[5][5];
		
		int n = 1;
		
		for (int i=0; i<day.length ; i++ )
		{
			for (int j=0; j<day[i].length; j++ )
			{
				day[i][j] = n;
				n++;
			}
		}

		for (int i=0 ; i<day.length ; i++ )
		{
			for (int j=0 ; j<day[i].length ;j++ )
			{
				System.out.printf("%3d", day[i][j]);
			}
			System.out.println();
		}
		*/

		//�迭�� �迭 ����
		//int[][] arr;
		
		// �迭�� �迭 �޸� �Ҵ�
		//arr = new int[5][5];
		
		// �迭�� �迭 ���� + �޸� �Ҵ�
		int[][] arr =new int[5][5];
		

		int n=1;
		//�ʱ�ȭ
		for (int i=0 ; i<arr.length ; i++) // i �� 0 1 2 3 4 (5ȸ �ݺ�)
		{
			for (int j=0 ; j<arr[i].length ; j++ ) //j �� 0 1 2 3 4 (5ȸ �ݺ�)
			{
				arr[i][j] = n;
				n++;
			}
		}

		//�迭�� �迭 ��� ��ü ���
		for (int i=0 ; i<arr.length ; i++)
		{
			for (int j=0 ; j<arr[i].length ; j++ )
			{
				System.out.printf("%3d", arr[i][j]);
			}System.out.println();
		}
	}
}

//���� ���
/*
  1  2  3  4  5
  6  7  8  9 10
 11 12 13 14 15
 16 17 18 19 20
 21 22 23 24 25
*/
