/*==========================================
	���� �ֹε�Ϲ�ȣ ��ȿ�� �˻� ����
============================================*/

/*
�� �ֹε�Ϲ�ȣ ���� ����

   �� ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�.

	  123456-1234567(�ֹι�ȣ)
	  ****** ******
	  234567 892345 ���ڸ��� ������ ��	

   �� ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�

   ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
   	   * * * * * *   * * * * * * *
	   2 3 4 5 6 7   8 9 2 3 4 5 
   ---------------------------------
   �� 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15 == 217
	   
   �� ������ ������� 11�� ������ ������������ ���Ѵ�
   	  �������� �� �ڸ��� �������� 10���� ������.
  	  11 �� �ֹι�ȣ ������ ���� 0
	  10 �� �ֹι�ȣ ������ ���� 1

		 19
	  --------
   11 | 217
   		11
	  -------
	    107
		 99
	 --------
	 	  8	�� ������

   �� 11���� �������� �� ������� ���Ѵ�
   	  
	  11 - 8

   �� �꿡�� ó���� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ� ��ġ�ϴ��� ���Ѵ�

		  			  ��ġ
	  11 - 8 ������ 3 == �ֹι�ȣ ������ ���� 3

   �� ������ ���ڿ� ���� ��� ��ȿ�� �ֹε�Ϲ�ȣ~!!!!
  

// ���� ��)
// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 123456-12345678 �� �Է°��� �ʰ�
// >> �Է¿���~!!!
// ����Ϸ��� �ƹ�Ű�� ��������...

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 123456-123456 �� �Է°��� ����
// >> �Է¿���~!!!

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 123456-1234567 �� ��ȿ�� �ֹι�ȣ
// >> ��Ȯ�� �ֹι�ȣ~!!!

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 123456-1234567 �� ��ȿ���� ���� �ֹι�ȣ
// >> �߸��� �ֹι�ȣ~!!!

 �� ���ڿ�.length() �� ���ڿ��� ���� ��ȯ
	���ڿ�.substring() �� ���ڿ� ����
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test101
{
	public static void main(String[] args)	throws IOException
	{
		/*
		//�׽�Ʈ
		String strTemp = "���ع�����λ��� ���������";
		System.out.println(strTemp.length());
		//--==>> 15

		//�׽�Ʈ
		System.out.println("�������� �� �ҳ���".length()); 
		//--==>> 10
		
		// �׽�Ʈ
		System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 5));	//�ε��� 0���� ��. //�ε��� 3���� 5������
		//--==>> de
		
		// �׽�Ʈ
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 50)); 
		//--==>>java.lang.StringIndexOutOfBoundsException
		//		���ڿ��� ������ ����� ����
		
		// �׽�Ʈ
		System.out.println("���̿��������װڳ�".substring(4, 9));
		//--==>>�����װڳ�

		//�׽�Ʈ
		System.out.println("������������".substring(3));		//�ε��� 3���� ���ڿ�length(��)����
		System.out.println("������������".substring(3, "������������".length()));
		System.out.println("������������".substring(3 ,6));
		//--==>>������
		//		������
		//		������
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num;

		do
		{
			System.out.print("�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : ");
			num = br.readLine();

				if (num.length()!=14)
			{
				System.out.println(">> �Է¿���~!!!");	
			}
					
		}
		while (num.length()!=14);
		
		int sum=0;
		int sum2=0;
		int sum3=0;
		/*
		sum = Integer.parseInt(num.substring(0, 1))*2 + Integer.parseInt(num.substring(1, 2))*3 + Integer.parseInt(num.substring(2, 3))*4 + Integer.parseInt(num.substring(3, 4))*5 +
				Integer.parseInt(num.substring(4, 5))*6 + Integer.parseInt(num.substring(5, 6))*7 +
				Integer.parseInt(num.substring(7, 8))*8 + Integer.parseInt(num.substring(8, 9))*9 + Integer.parseInt(num.substring(9, 10))*2 + 
				Integer.parseInt(num.substring(10, 11))*3 + Integer.parseInt(num.substring(11, 12))*4 + Integer.parseInt(num.substring(12, 13))*5;
				*/

		int[] arr1 = new int[13];
		int[] arr2 = {2 ,3 ,4, 5, 6, 7, 0, 8, 9, 2, 3 ,4, 5};

		for (int i=0 ; i<6 ; i++)
		{
			sum += Integer.parseInt(num.substring(i, i+1))*arr2[i];
		}

		for ( int i=7 ; i<13 ; i++)
		{
			sum2 += Integer.parseInt(num.substring(i, i+1))*arr2[i];
		}

		sum3 = sum+sum2;
		
		//System.out.println(sum);
		//System.out.println(sum3);
		
		
		int namuji, end;
		namuji = sum3%11;

		if (namuji>=10)
		{
			if (namuji%10==0)
			{
				end = 1;
			}
			else if (namuji%10==1)
			{
				end = 0;
			}
		}

		end = 11-namuji;

		if (end==Integer.parseInt(num.substring(13, 14)))
		{
			System.out.println(">> ��Ȯ�� �ֹι�ȣ~!!!");
		}
		else
		{
			System.out.println(">> �߸��� �ֹι�ȣ~!!!");
		}

	}
}

//���� ���
/*
�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 750615-1862133
>> ��Ȯ�� �ֹι�ȣ~!!!
*/