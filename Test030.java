/*=============================================
	���� ���� �帧�� ��Ʈ��(���) ����
	- if�� �ǽ�
===============================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ ¦������ Ȧ������ �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, BufferedReader�� readLine() �޼ҵ带 ���� �Է¹��� �� �ֵ��� ó���ϰ�
// ���� if���� Ȱ���Ͽ� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : 37
// 37 �� Ȧ���Դϴ�.
// ����Ϸ��� �ƹ� Ű��...

// ������ ���� �Է� : 26
// 26 �� ¦���Դϴ�.
// ����Ϸ��� �ƹ� Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test030
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		/*

		int a;
		String b;


		int a = Integer.parseInt(br.readLine());

		System.print.out("������ ���� �Է� :");

		if(a%0==0)
			System.print.out("¦���Դϴ�.");
		if(a%0!=0)
			System.print.out("Ȧ���Դϴ�.");
			*/

		System.out.print("������ ���� �Է� : ");
			String strData = br.readLine();

		int num = Integer.parseInt(strData);
		
		if(num%2 == 0)
		{
			System.out.printf("%d ¦���Դϴ�.\n",num);

		}
		if(num%2 != 0)
			System.out.printf("%d Ȧ���Դϴ�\n",num);
	}
}

//���� ���
/*

*/