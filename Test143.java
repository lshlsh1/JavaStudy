/*=========================================
	���� ����(Exception) ó�� ����
==========================================*/
//�ڵ� �м� �غ���

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test143
{

	private String[] data = new String[3];

	public void proc()	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n=0;

		System.out.print("�̸��Է�[����:ctrl+z] :");
		
		while ((str=br.readLine()) != null)
		{
			data[n++]=str;
			System.out.print("�̸��Է�[����:ctrl+z] :");
		}

		System.out.println("�Էµ� ����...");
		for (String s : data)
		{
			if (s != null)
			{
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) throws IOException
	{
		Test143 ob = new Test143();
		ob.proc();
		
	}
}

//������
/*
�̸��Է�[����:ctrl+z] :a
�̸��Է�[����:ctrl+z] :b
�̸��Է�[����:ctrl+z] :c
�̸��Է�[����:ctrl+z] :^Z
�Էµ� ����...
a
b
c
*/
/*
�̸��Է�[����:ctrl+z] :a
�̸��Է�[����:ctrl+z] :b
�̸��Է�[����:ctrl+z] :c
�̸��Է�[����:ctrl+z] :d
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        at Test143.proc(Test143.java:25)
        at Test143.main(Test143.java:42)
*/
