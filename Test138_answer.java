import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;

public class Test138_answer
{
	public static void main(String[] args) throws IOException
	{

		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//Calendar
		Calendar cal = Calendar.getInstance();

		//�ֿ� ���� ����
		int y, m;		//--��,��
		int w;			//-- ����
		int i;			//-- ��������

		do
		{
			System.out.print("���� �Է� :");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("�� �Է� : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);
		
		// ����ڷκ��� �Է¹��� ������ ��(y), ��(m)�� �̿��Ͽ� �޷��� ��¥ ����

		cal.set(y, m-1, 1);
		//-- �� ���� �� �Է°�(m)�� �״�� ����ϴ� ���� �ƴ϶�

		//	 �Է°����� 1�� �� ������ ���� �����ؾ� �Ѵ�.
		//-- �� ���� �� �Է¹��� ��, ���� �ش��ϴ� 1�Ϸ� �����ؾ� �Ѵ�.

		// ���� ��������
		w = cal.get(Calendar.DAY_OF_WEEK);

		//Ȯ��
		//System.out.println(w);
		//--==>> 6 �� 2019�� 3�� ���� �� �ݿ��� �� 2019�� 3�� 1�� : �ݿ���

		// ��� ��� �� �޷� �׸���
		System.out.println();
		System.out.println("\t [ "+y+"�� "+m+"�� ]\n");
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("============================");
		for (i=1 ;i<w ; i++ )
		{
			System.out.print("    ");	// ���� 4ĭ �߻�
		}

			for (i=1 ; i<=cal.getActualMaximum(Calendar.DATE) ; i++)
		{
			w++;	//-- �ݺ����� �����Ͽ� ��¥�� ������ �� ����
					//	 ���ϵ� �Բ� ������ �� �ֵ��� ó��
			System.out.printf("%4d",i);
			if (w%7==1)	//-- ������ ������ �Ͽ����� �� �� ���� ���� �� ���(0�ƴϰ� 1����) ,�Ͽ����� 1�̴ϱ�
			{
				System.out.println();	// ����
			}
		}
			
		if(w%7!=1);
			System.out.println();	// ����
		
		System.out.println("============================");
	}
}