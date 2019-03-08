/*============================================
	���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- Calendar Ŭ����
============================================*/

// �ǽ� ����
//	 ������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������
//	 Ȯ���Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
//	 �� Calendar Ŭ������ Ȱ���Ͽ� ó���Ѵ�

// ���� ��)
// ���� ��¥ : 2019-3-6 �ݿ���
// �� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

// ========[Ȯ�ΰ��]===========
// 200�� �� : 2019-xx-xx x����
// =============================
// ����Ϸ��� �ƹ� Ű�� ��������...
import java.util.Scanner;
import java.util.Calendar;

public class Test139
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		
		int y = cal.get(Calendar.YEAR);
		int m = (cal.get(Calendar.MONTH)+1);
		int d = cal.get(Calendar.DATE);

		System.out.print("���� ��¥ : "+y+"-"+m+"-"+d+" ");

		String[] w = { "�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
		
		System.out.print (w[cal.get(Calendar.DAY_OF_WEEK)-1]);
		System.out.println();

		System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
		int n = sc.nextInt();
		
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if ( y%4==0 && y%100!=0 || y%400==0 )
		{
			days[1] = 29;
		}
		int nalsu;
		nalsu = (y-1)*365+(y-1)/4-(y-1)/100+(y-1)/400
		
		for (int i=0; i<(m-1) ; i++)
		{
			nalsu += days[i]
		}
		
		nalsu += d;

		

		
	}
}