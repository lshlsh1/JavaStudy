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
  | 0  1  2  3  4		��
  |----------------
0 | 1  2  3  4  5		�� i=0
1 | 2  3  4  5  6		�� i=1
2 | 3  4  5  6  7		�� i=2
3 | 4  5  6  7  8		�� i=3
4 | 5  6  7  8  9		�� i=4
 ����Ͻ÷��� �ƹ� Ű�� ��������....
*/
public class Test087
{
	public static void main(String[] args)
	{
		/*
		int[][] arr = new int[5][5];
		
		for ( int i=0 ; i<arr.length ; i++)
		{
			for (int j=0 ; j<arr[i].length ; j++ )
			{
				arr[i][j] = i+1+j;
			}
		}

		for ( int i=0 ; i<arr.length ; i++ )
		{
			for (int j=0 ; j<arr[i].length ; j++ )
			{
				System.out.printf("%3d",arr[i][j]);
			}System.out.println();
		}
		*/

		//�迭�� �迭 ���� �� �޸� �Ҵ�
		int[][] arr = new int[5][5];

		int n;

		for (int i=0; i<arr.length ; i++ )	// i-> 0 1 2 3 4
		{
			n=i+1;							// n-> 1 2 3 4 5
			for ( int j=0 ; j<arr[i].length ; j++ )
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