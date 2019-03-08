/*
Calendar Ŭ������ ��¥������ ó���� �� ����ϱ� ���ϴ�.
Calendar ��ü�� ������ ���� getInstance() �޼ҵ带 ����ؾ� �Ѵ�. 
get() �޼ҵ� : ������ ��, ��, �� ������ ��ų� �Ǵ� ������ ��, ��, �� ������ ���� �� �ִ�.
set() �޼ҵ� : ���� ������� ��ü�� ��¥�� ������ �� �ִ�.


���� ���α׷��� ���� ��¥�� �ð������� �� ����ϰ�, ������ ���Ե� ���� �޷��� ����Ѵ�.
*/

import java.util.Calendar;

public class CalendarExplain 
{
    public static void main(String[] args) 
    {

        Calendar cal = Calendar.getInstance();   // Calendar ��ü ����
        
        System.out.println("���ش� " + cal.get(Calendar.YEAR));   // �� ���� ���
        System.out.println("�̴��� " + (cal.get(Calendar.MONTH) + 1));   // �� ���� ���(0 ~ 11)
        System.out.println("������ " + cal.get(Calendar.DATE));  // �� ���� ���
        System.out.println("���� �ð��� " + cal.get(Calendar.HOUR));  // �� ���� ���
        System.out.println("���� ���� " + cal.get(Calendar.MINUTE));  // �� ���� ���
        System.out.println("���� �ʴ� " + cal.get(Calendar.SECOND));  // �� ���� ���
        if (cal.get(Calendar.AM_PM) == 0)   // ����, ���� ���� ���(0 �Ǵ� 1)
            System.out.println("������ AM");
        else
            System.out.println("������ PM");
        System.out.println("\n\n");
        
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        prt_cal(year, month);    // �ش� �� ��� �޼ҵ�
    }
    
    // �Ű������� �־��� ��� �޿� �ش��ϴ� �޷� ��� �޼ҵ�
    static void prt_cal(int year, int month) {
        Calendar cal = Calendar.getInstance();

 
        cal.set(year, month, 1);   // �ش� ���� 1�Ϸ� ����
        int dayofweek = cal.get(Calendar.DAY_OF_WEEK);   // �ش� ���� 1���� �������� ���



        System.out.println("  ======= " + year + "�� " + (month+1) + "�� ======");
        System.out.println(" SUN MON TUE WED TUR FRI SAT");
        for(int i = 1; i <dayofweek; i++)
            System.out.print("    ");    //  1�� �� ���� ���������� ��ĭ ���
        
        int days = cal.getActualMaximum(Calendar.DATE);   // �ش� ���� �� �� ���
        for(int i = 1; i <= days; i++) {
            System.out.print(String.format("%4d", i));   // 4�ڸ��� ���� ���
            if ((dayofweek + i - 1) % 7 == 0)   //  ����ϱ��� ��� �� �� �ٲ�
                System.out.println("");
        }
        System.out.println("\n\n");
    }
}


//������
/*
���ش� 2019
�̴��� 3
������ 8
���� �ð��� 10
���� ���� 27
���� �ʴ� 10
������ AM



  ======= 2019�� 3�� ======
 SUN MON TUE WED TUR FRI SAT
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30
  31
	*/