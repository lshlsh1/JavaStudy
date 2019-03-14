/*========================================
	���� �÷��� (Collection) ���� 
========================================*/
//Map - HashTable, HashMap .... 
// - java.util.Map �������̽��� Ű(key)�� ��(value)�� ����(mapping)�ϸ�
//	 ������ Ű�� ����� �� ���� �����ؾ� �ϸ�
//	 �� Ű�� �� ���� ������ �����ؾ� �Ѵ�.
//	 ��, �ϳ��� Ű ���� �����ϴ� �ϳ��� ���� ���� �ڷᱸ���̴�.

/*
 �� HashaMap<K, V> Ŭ����

 	- Hashtable Ŭ������ ���������� Map �������̽��� ������
	  HashMap Ŭ������ ����� Hashtable Ŭ������ ����������
	  synchronozation�� ���� ������ ���ü� ������ ���ٸ�(����ȭ)
	  (��, ��Ƽ ������ ���α׷��� �ƴ� �����)
	  HashMap�� ����ϴ� ���� ������ ����ų �� �ִ�.

	- ����, HashMap�� Hashtable�� �ٸ��� null�� ����Ѵ�.	
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashMap;
import java.util.Map;

public class Test165
{
	public static void main(String[] args)	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//HashMap �ڷᱸ�� �ν��Ͻ� ����
		//HashMap<String, String> map = new HashMap<String, String>();
		Map<String, String> map = new HashMap<String, String>();//��ĳ����

		// map�̶�� �ؽø� �ڷᱸ���� ��� �߰� �� put()
		map.put("���","SKYĳ��");
		map.put("��ȭ","ĸƾ����");
		map.put("��ȭ","�Ʊ���");
		
		// null �Է� �õ�
		map.put(null, null);
		map.put("�Ҽ�", null);
		map.put(null, "����");
		//-- ���� ������ �Է� ������ ���� ��� ������ ������ �Է��� ����������
		//	 ������ null�� key�� ���ε� "����"��
		//	 ���� null�� key�� �����ϴ� null�� ����� ��Ȳ�� �߻��ϰ� �ȴ�.
		//	 ��, HashMap�� null�� �ϳ��� ������ key������ �����Ѵ�(�ν��Ѵ�.)

		System.out.print("ī�װ�, Ÿ��Ʋ �Է�(�ĸ� ����) : ");

		String[] temp;

		for (String str ; (str=br.readLine()) != null ; )
		{
			temp = str.split(",");
			if (temp.length<2)
			{
				System.out.print("ī�װ�, Ÿ��Ʋ �Է�(�ĸ� ����) [����ctrl+z] : ");
				continue;
			}
			map.put(temp[0].trim(), temp[1].trim());	//��ĭ����
			System.out.println(map);
		}
	}
}