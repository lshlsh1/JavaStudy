/*=============================================
	���� ���� �帧�� ��Ʈ��(���) ����
	- if�� ~ else�� �ǽ�
===============================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �ۼ��Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 4
// �� ��° ���� �Է� : 8
// �� ��° ���� �Է� : 73

// >> ���� ��� : 4 8 73
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		int a, b, c;		//-- ����ڰ� �Է��ϴ� ������ ������ ���� ����
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());
		
		/*
		if(a<=b && b<=c)
		{
			System.out.printf("\n>> ���� ��� : %d %d %d\n",a,b,c);
		}
		else if(a<=c && c<=b)
		{
			System.out.printf("\n>> ���� ��� : %d %d %d\n",a,c,b);
		}
		else if(b<=a && a<=c)
		{
			System.out.printf("\n>> ���� ��� : %d %d %d\n",b,a,c);
		}
		else if(b<=c && c<=a)
		{
			System.out.printf("\n>> ���� ��� : %d %d %d\n",b,c,a);
		}
		else if(c<=a && a<=b)
		{
			System.out.printf("\n>> ���� ��� : %d %d %d\n",c,a,b);
		}
		else if(c<=b && b<=a)
		{
			System.out.printf("\n>> ���� ��� : %d %d %d\n",c,b,a);
		}
		else
		{
			System.out.println("�ǵ� �Ұ�");
			*/

		int a, b, c;		//-- ����ڰ� �Է��ϴ� ������ ������ ���� ����
		int temp;			//-- �ӽ� ���� ����(�� ��)
		
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());

		// 2 2 2 | 3 2 1 | 2 1 3 | 3 1 2 | 1 3 2 | 1 2 3
		//		 | 2 3 1 | 1 2 3 | 1 3 2 | 1 2 3
		//		 | 2 1 3 |		 | 1 2 3 |
		//		 | 1 2 3 |

		if(a>b)		// �� ù ��° ������ �� ��° �������� ũ�ٸ�...
		{
			// �� ������ �ڸ��� �ٲ۴�.
			temp = a;
			a = b;
			b = temp;
		}
		if(a<b)		// �� �� ��° ������ �� ��° �������� ũ�ٸ�...
		{
			// �� ������ �ڸ��� �ٲ۴�.
			temp = b;
			b = c;
			c = temp;
		}
		if(a>b)		// �� ù ��° ������ �� ��° �������� ũ�ٸ�...
		{
			// �� ������ �ڸ��� �ٲ۴�.
			temp = a;
			a = b;
			b = temp;
		}//else if ����ϸ� �ȵ�
				
		
		System.out.printf("\n>> ���� ��� : %d %d %d\n",a,b,c);	
	
	}
}

//���� ���
/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 20
�� ��° ���� �Է� : 5

>> ���� ��� : 5 10 20

ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 10
�� ��° ���� �Է� : 50

>> ���� ��� : 10 10 50
*/