/*==========================================================
	���� ���� �帧�� ��Ʈ�� ( ��� ) ����
	- break;
============================================================*/

// �� �ǽ� ����
// ������ ���� ó���� �̷������ ���α׷��� �����Ѵ�.
// ��, �Է¹޴� ������ 1 ~ 1000 ���� �ȿ�����
// �����ϵ��� �ۼ��Ѵ�

// ���� ��)
// ������ ���� �Է� : -10
// ������ ���� �Է� : 0
// ������ ���� �Է� : 2019
// ������ ���� �Է� : 10
// >> 1 ~ 10������ �� : 55
// ����Ͻðڽ��ϱ�?(Y/N) : y

// ������ ���� �Է� : 100
// >> 1 ~ 100 ������ �� : 5050
// ����Ͻðڽ��ϱ�?(Y/N) : N
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test064
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		int n,m ;
		int sum=0;
		char i=0;
		
		while (true)
		{
			do
			{
				System.out.print("������ ���� �Է� : ");
				n = Integer.parseInt(br.readLine());		
			}
			while (n<1 || n>1000);
			
			for ( m=1 ; m<=n ; m++)
			{
				sum += m;
			}
					
			System.out.println("1 ~ "+n+"������ �� : "+sum);

			System.out.print("����Ͻðڽ��ϱ�?(Y/N) : ");
			
			i = (char)System.in.read();
			System.in.skip(2);
			
			if(i=='y' || i=='Y')
			{
				sum = 0;
			}
			else
			{
				break;
			}
			
		}*/

		// <������ Ǯ��>

		int n, s, i;	//-- ����� �Է°�, ������, ��������
		char ch;		//-- ��� ���� �Է°�

		while (true)	//-- ���� ���� (���� �ݺ�)
		{
			do
			{
				System.out.print("������ ���� �Է� : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n<1 || n>1000);

			s=0;
			
			for ( i=1 ; i<=n ; i++)
				s += i;

			System.out.printf(">>1 ~ %d ������ �� : %d\n", n, s);

			System.out.print("����Ͻðڽ��ϱ�?(Y/N) : ");

			ch = (char)System.in.read();		// y + \r + \n
			
			//	�Է°��� �ҹ��� y�� �ƴϴ�. �Է°��� �빮�� Y�� �ƴϴ�.
			//	�� ch!='y'					 �� ch!='Y'

			// ch=='y' || ch=='Y'
			//		   ��
			// ch!='y' && ch!='Y'

			if (ch!='y' && ch!='Y')		//������ �����ϸ�
			{
				//�ݺ��� �� while(true)�� �������� �� �ִ� �ڵ� �ۼ� �ʿ�
				//-- ���Ͱ��� �ǻ� ǥ���� �ߴٸ�
				//	 �׵��� �����ߴ� �ݺ����� ���߰� ���������� �Ѵ�.
				break;
				//-- �����. (+ �׸��� ����������) check~!!!
			}

			//���Ͱ�(\r+\n) ó��
			System.in.skip(2);

		}//end while
		




	}// end main

}//end class

//���� ���
/*
������ ���� �Է� : 100
1 ~ 100������ �� : 5050
����Ͻðڽ��ϱ�?(Y/N) : y
������ ���� �Է� : 100
1 ~ 100������ �� : 5050
����Ͻðڽ��ϱ�?(Y/N) : n
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/