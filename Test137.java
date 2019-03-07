/*============================================
	���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- Calendar Ŭ����
============================================*/
/*
 �� Calendar Ŭ������ �߻�Ŭ�����̱� ������ ��ü�� ������ �� ����.
	(�߻� Ŭ���� : �̿ϼ��� Ŭ����)

	��, ��Calendar ob = new Calendar();���� �̿� ���� ������ ���� �ν��Ͻ� ���� �Ұ�

�� Calendar Ŭ���� ��ü(�ν��Ͻ�)�� ������ �� �ִ� ���
	
	1. Calendar ob1 = Calendar.getInstance();
	//CalendarŬ������ ������ �ִ� getInstance�޼ҵ带 �̿��Ͽ� ȣ��

	2. Calendar ob2 = new GregorianCalendar();
	// new�����ڸ� �̿� GregorianCalendar(����Ŭ����) ��ĳ���� ��� ���

	3. GregorianCalendar ob3 = new GregorianCalendar();
	//���� GregorianCalendar ����ϴ� ���

	( �� GregorianCalendar : Calendar Ŭ������ ����(�ڽ�) Ŭ����)

*/

//��, ��, ��, ������ Calendar Ŭ�����κ��� ������ ���

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test137
{
	public static void main(String[] args)
	{
		//Calendar Ŭ���� �ν��Ͻ� ����
		Calendar rightNow = Calendar.getInstance();

		//������ �޷�(Calender) �ν��Ͻ��� ����
		//��¥ ���� ������ �� �� �ִ� �޼ҵ� �� get()

		int y = rightNow.get(Calendar.YEAR);
		int m = rightNow.get(Calendar.MONTH)+1; //check~!!!
		//���� ��ü������ �迭ó���� �Ǿ��ִ�. +1 ����� ���� ���� ���´�.
		int d = rightNow.get(Calendar.DATE);
		int w = rightNow.get(Calendar.DAY_OF_WEEK);

		System.out.println(y + "-"+m+"-"+d+" "+w);
		//--==>> 2019-3-7 5(����)


		//�׽�Ʈ
		System.out.println(Calendar.SUNDAY);	//--==>> 1
		System.out.println(Calendar.MONDAY);	//--==>> 2
		System.out.println(Calendar.TUESDAY);	//--==>> 3
		System.out.println(Calendar.WEDNESDAY);	//--==>> 4
		System.out.println(Calendar.THURSDAY);	//--==>> 5
		System.out.println(Calendar.FRIDAY);	//--==>> 6
		System.out.println(Calendar.SATURDAY);	//--==>> 7

		String week = "";

		switch (w)
		{
			//case 1 : week="�Ͽ���"; break;
			case Calendar.SUNDAY: week ="�Ͽ���"; break;
			//case 2 : week="������"; break;
			case Calendar.MONDAY: week ="������"; break;
			//case 3 : week="ȭ����"; break;
			case Calendar.TUESDAY : week = "ȭ����"; break;
			//case 4 : week="������"; break;
			case Calendar.WEDNESDAY : week = "������"; break;
			//case 5 : week="�����"; break;
			case Calendar.THURSDAY : week = "�����"; break;
			//case 6 : week="�ݿ���"; break;
			case Calendar.FRIDAY : week = "�ݿ���"; break;
			//case 7 : week="�����"; break;
			case Calendar.SATURDAY : week = "�����"; break;
		
		}

		System.out.println(y+"-"+m+"-"+d+" "+week);
		//--==>>2019-3-7 �����


		///////////////////////////////////////////////////////////////////
		
		//Calendar Ŭ���� �ν��Ͻ� ����
		Calendar rightNow2 = new GregorianCalendar();

		String[] week2 = {"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};

		//�޷��� ��¥ ���� �� ��set()�� �޼ҵ� Ȱ��
		rightNow2.set(2019, 6, 18); // ���� ��ü �迭ó�������� �Է��Ҷ��� -1�ؼ� �־���Ѵ�. 

		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		//--==>>5 �� �����

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>>5
		//DAY_OF_WEEK�ε����� �����Ϻ��� ���� �迭�� �ε����� �Ͽ��Ϻ��� �����ؼ� -1

		System.out.println();

		rightNow2.set(1992, 10, 20); // ����~! ���� ��ü �迭ó�������� �Է��Ҷ��� -1�ؼ� �־���Ѵ�. 
		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);




	}
}