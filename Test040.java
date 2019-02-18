/*=============================================
	���� ���� �帧�� ��Ʈ��(���) ����
	- switch�� �ǽ�
===============================================*/

/*
�� ���� ���� ���̶� �ϸ�, switch�� ������ ���� ���� ����
   ���� ������ ���� �������� �б��� �� ����ϴ� �����̴�.

�� ���� �� ����
   switch(����)
   {
	   case ���1 : ����1; [break;]
	   case ���2 : ����2; [break;]
			  :
	   [default : ����n+1;] [break;]
	}
	
	switch���� �����ġ��� case�� ���������
	byte, short, int, long ���̾�� �Ѵ�.

	case �� �ڿ� ��break;���� ���� ������ ���
	���� case ���� ������ ����ؼ� �����ϰ� �ȴ�. (�⺻ ��)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test040
{
	public static void main(String[] args)	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		System.out.print("�̸� �Է� : ");
		String name = br.readLine();
		System.out.print("���� ���� : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		int mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		double avg = tot/3.0;
		char grade = 'F';
		
		switch((int)avg/10)
		{
			case 10 : case 9 : grade ='A'; break;
			case 8 : grade ='B'; break;
			case 7 : grade ='C'; break;
			case 6 : grade ='D'; break;
			default : grade ='F'; break;
		}

		System.out.println();
		System.out.printf(">> ����� �̸��� %s�Դϴ�.\n",name);
		System.out.printf(">> ���� ������ %d,\n",kor);
		System.out.printf(">> ���� ������ %d,\n",mat);
		System.out.printf(">> ������ %d�̰�, ����� %.2f�Դϴ�\n",tot,avg);
		System.out.printf(">> ����� %c�Դϴ�.\n",grade);
	
	}
}

//���� ���
/*
�̸� �Է� : �̽���
���� ���� : 70
���� ���� : 80
���� ���� : 90

>> ����� �̸��� �̽����Դϴ�.
>> ���� ������ 70,
>> ���� ������ 90,
>> ������ 240�̰�, ����� 80.00�Դϴ�
>> ����� B�Դϴ�.
*/