/*=========================================
	���� �ڹ��� �⺻ �����(I/O) ���� 
=========================================*/

// Reader �ǽ�
// Test166�� ���Ұ�

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test168
{
	public static void main(String[] args)	throws IOException
	{
		int data;
		char ch;

		// System.in		 : �ڹ��� ǥ�� �Է� ��Ʈ�� �� ����Ʈ ��� ��Ʈ��
		// InputStreamReader : ����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ������ ��ȯ
		//					 : (��ȯ��, ������ ���� ����)
		// Reader			 : ���� ��� ��Ʈ�� ��ü
		Reader rd = new InputStreamReader( System.in );
		//new InputStreamReader(System.in);

		//Test166�� Ctrl + V
		System.out.println("���ڿ� �Է�(����:Ctrl+z)");
		
		//while ( ( data = System.in.read() ) != -1 )	//����Ʈ ���
		while ( ( data = rd.read() ) != -1 )			//���� ���
		{
			ch = (char)data;

			//print() : ���� ��Ʈ��
			//System.out.print(ch);	//-- �ѱ� �����µ� ���� �ȱ���
			//--==>>
			/*
			���ڿ� �Է�(����:Ctrl+z)
			abcd
			abcd
			1234
			1234
			�����ٶ�
			�����ٶ�
			*/

			//write : OutputStream Ŭ������ ��ǥ�� �޼ҵ� (�� ����Ʈ �޼ҵ�)
			System.out.write(ch);	//--�ȱ����µ� ����
			//--==>>
			/*
			1234
			1234
			abcd
			abcd
			�����ٶ�
			 ��|
			*/

	}}
}