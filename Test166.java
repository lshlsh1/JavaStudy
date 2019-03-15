/*=========================================
	���� �ڹ��� �⺻ �����(I/O) ���� 
=========================================*/
/*
- �ڹ��� �⺻������� ���������(Queue�Ͱ���)
  ���찰����
				��������������������������
	������������������������������������������������
inputStream��	����	s t r e a m			����������outStream
	������������������������������������������������
				��						��
				��		J A V A			��
				��						��
				��						��
				��						��
				��						��
				��������������������������


*/
import java.io.IOException;

public class Test166
{
	public static void main(String[] args)	throws IOException
	{	
		int data;
		char ch;

		System.out.println("���ڿ� �Է�(����:Ctrl+z)");
		
		//read() : InputStream Ŭ������ ��ǥ�� �޼ҵ�(�� ����Ʈ��� ��Ʈ��)
		while ( ( data = System.in.read() ) != -1 )

		{
			ch = (char)data;

			//print() : ���� ��Ʈ��
			//System.out.print(ch);	//-- �ѱ� ����
			//--==>>
			/*
			���ڿ� �Է�(����:Ctrl+z)
			abcd
			abcd
			1234
			1234
			�����ٶ�
			�Ƣ�������?��?
			*/

			//write : OutputStream Ŭ������ ��ǥ�� �޼ҵ� (�� ����Ʈ �޼ҵ�)
			System.out.write(ch);
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
		}
	}
}