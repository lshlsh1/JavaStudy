/*=========================================
	���� ����(Exception) ó�� ����
==========================================*/
//143�� ���Ͽ� ����

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test144
{
	private String[] data = new String[3];

	public void proc()	//throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n =0;

		try
		{
			System.out.print("�̸� �Է�[����:Ctrl+z] : ");
			
			while ((str=br.readLine()) != null)
			{
				data[n++] =str;
				System.out.print("�̸� �Է�[����:Ctrl+z] : ");
			}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("���� �߻�~!!!!");
			System.out.println("getMessage : "+e.getMessage());
			System.out.println("toString : "+e.toString());
			System.out.println("printStackTrace...");
			e.printStackTrace();
		}
		catch (IOException e)
		{
			System.out.println(e.toString()); //Exception toString ���ܿ� ���� ���³��� ���ڿ��� ��ȯ
		}

		System.out.println("�Էµ� ����...");
		for (String s:data)
		{
			System.out.println(s);
		}
		System.out.println();		
	}
	public static void main(String[] args) //throws IOException try catch�� �̿��ϸ� ���ܸ� ������ ������ ���� �ƴϱ⶧���� ���ʿ�
	{
		Test144 ob = new Test144();
		ob.proc();
	}
}

//������
/* <ArrayIndexOutOfBoundsException e>
�̸� �Է�[����:Ctrl+z] : a
�̸� �Է�[����:Ctrl+z] : b
�̸� �Է�[����:Ctrl+z] : c
�̸� �Է�[����:Ctrl+z] : d
���� �߻�~!!!!
getMessage : 3
toString : java.lang.ArrayIndexOutOfBoundsException: 3
printStackTrace...
java.lang.ArrayIndexOutOfBoundsException: 3
        at Test144.proc(Test144.java:26)
        at Test144.main(Test144.java:53)
�Էµ� ����...
a
b
c

*/
/* <IOException e>
�̸� �Է�[����:Ctrl+z] : a
�̸� �Է�[����:Ctrl+z] : b
�̸� �Է�[����:Ctrl+z] : c
�̸� �Է�[����:Ctrl+z] : ^Z
�Էµ� ����...
a
b
c

*/

