
import java.util.Scanner;
class Record
{
   String hak, name ;   //-- �ѹ� �̸�
   int kor,eng,mat;   //-- ����,����,����
   int tot,avg   ;      //-- ����,���
}

interface Sungjuk
{
   public void set();
   public void input();
   public void print();
}

class SungjukImpl implements Sungjuk
{
   int n=0; // �ο��� 
   char[][] st ;   // ���� �ֱ� 

   Record[] record;

   public void set()
   {
      Scanner sc= new Scanner(System.in);
      System.out.print("�ο� �� �Է�(1~10) : ");
      n = sc.nextInt();

      record = new Record[n];
      st = new char[n][3];
   }
      
   public void st()
   {
      for (int i=0 ; i<n ; i++ )
      {
         st[i][0] = suwoo(record[i].kor);
         st[i][1] = suwoo(record[i].eng);
         st[i][2] = suwoo(record[i].mat);

      }

   }

   public char suwoo(int a)
   {
      char st = 0;
      if (a>=90 && a<=100)
         st = '��';
      else if (a>=80 && a<90)
         st = '��';
      else if (a>=70 && a<80)
         st = '��';
      else if (a>=60 && a<70)
         st = '��';
      else 
         st = '��';
      
      return st;
   }

   public void input()
   {
      Scanner sc= new Scanner(System.in);
            
      

      for (int i=0; i<n ; i++ )
      {   
         Record rc = new Record();

         System.out.printf("%d��° �л��� �й� �̸� �Է�(���鱸��) : ",i+1);
         rc.hak = sc.next();
         rc.name = sc.next();

         System.out.print("���� ���� ���� ���� �Է�   (���鱸��) : ");
         rc.kor = sc.nextInt();
         rc.eng = sc.nextInt();
         rc.mat = sc.nextInt();

         rc.tot = rc.kor+rc.eng+rc.mat;
         rc.avg = rc.tot/3;

         record[i] = rc;

      }

      System.out.println();
   
   }

   public void print()
   {
      st();
      for (int i=0; i<n; i++ )
      {
         System.out.printf("%s %s %3d %3d %3d %5d %3d\n",record[i].hak, record[i].name, record[i].kor, record[i].eng, record[i].mat, record[i].tot, record[i].avg);
         System.out.printf("%17c %2c %2c\n",st[i][0],st[i][1],st[i][2]);
      }
      System.out.println();
   
   }


}
public class Test116
{
   public static void main(String[] args)
   {
      Sungjuk ob = new SungjukImpl();

      // ���� �ذ� �������� �ۼ��ؾ� �� ob ����

      ob.set();
      ob.input();
      ob.print();
   
   }
}