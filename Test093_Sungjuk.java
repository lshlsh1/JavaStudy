/*
2. Sungjuk Ŭ����
- �ο� ���� �Է¹޾�, �Է¹��� �ο� ����ŭ �̸�, ��������, ��������, ���������� �Է¹ް�
������ ����� �����ϴ� Ŭ������ ������ ��
- �Ӽ�: �ο� ��, Record ������ �迭
- ���: �ο� �� �Է�, �� ������ �Է�, ����/��� ����, ��� ���
*/
import java.util.Scanner;

public class Test093_Sungjuk
{
	//�ֿ� �Ӽ� ����
	int inwon;		//-- �ο� ��

	//int[] nArr;
	//String[] StrArr;
	Test093_Record[] recArr;		//-- Record �迭 (�л� 1�� �� Record�迭�� �� 1���� Ȱ��)

	//���(�޼ҵ� ����)
	// �� �ο� �� �Է�
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("�ο� �� �Է�(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);	//� �� �ݺ��ؾ��մϱ�? ������ ���� ���� �� �ݺ��ؾ��մϴ�

		// check~!!!
		// Record Ŭ������ ������� ������ ��ü(�ν��Ͻ�)�� ���� �� �ִ�
		// �迭���� inwon ��ŭ ������ ������
		// RecordŬ������ �ν��Ͻ��� ������ ���� �ƴϴ�.
		recArr = new Test093_Record[inwon];

	}

	//���(�޼ҵ� ����)
	// �� �� ������ �Է� + �� ����/ ��� ����

	void input()
	{
		Scanner sc = new Scanner(System.in);

		String[] subTitle = {"���� ���� : ", "���� ���� : ", "���� ���� : "};
		
		for ( int i=0 ; i<inwon ; i++ )	// �ο� �� ��ŭ �ݺ�~!!!!(== recArr.length)
		{

			// check~!!
			// Record Ŭ���� ����� �ν��Ͻ� ����
			//Test093_Record ob1 = new Test093_Record();
			//Test093_Record ob2 = new Test093_Record();
			//			:

			//			||
			//recArr[0] = new Test093_Record();
			//recArr[] = new Test093_Record();
			//			||
			recArr[i] = new Test093_Record();
		
			System.out.printf("%d ��° �л��� �̸� �Է� : ", (i+1));
			recArr[i].name = sc.next();

			for ( int j=0 ; j<subTitle.length ; j++)
			{
				// �ȳ� �޼��� ���
				System.out.print(subTitle[j]);

				// ����ڰ� �Է��� �����͸� ���ھ�(score) �迭�� ��Ƴ���
				recArr[i].score[j] = sc.nextInt();

				// ����.����.���� ���� �����͸� �ݺ������� �Է¹޴� ����
				// �� �������� ���� �����ϱ�
				recArr[i].tot += recArr[i].score[j];	
			}
			
		// ��� �����ϱ�
		recArr[i].avg = recArr[i].tot / 3.0;
		}
	}//end input()

	// ���(�޼ҵ� ����)
	// �� ��� ���
	public void print()
	{
		//���� ���� �޼ҵ� ȣ�ⱸ�� �߰�~!!!
		ranking();
		// ����
		System.out.println();

		// �л� 1�� �� �ݺ� ��� ����
		for ( int i=0 ; i<inwon ; i++ )	//-- �л� �ο� �� ��ŭ �ݺ�~!!!!
		{
			// �̸� ���
			System.out.printf("%5s", recArr[i].name);

			//����(����,����,����) �ݺ� ���
			for ( int j=0 ; j<3 ; j++ )
			{
				System.out.printf("%4d", recArr[i].score[j]);
			}

			//����, ��� ���
			System.out.printf("%5d", recArr[i].tot);
			System.out.printf("%6.2f",recArr[i].avg);

			//���� ��� ���� �߰�~!!!!
			System.out.printf("%5d", recArr[i].rank);

			//����
			System.out.println();
		}
	}//end print

	//���(�޼ҵ� ����)
	// �� ���� ���� �޼ҵ� �߰�~!!!!
	private void ranking()	//�ܺο��� ���ٸ��ϰ�
	{
		// ���� ����
		int i, j;

		//(�غ�)��� �л����� ���(����)�� 1�� �ʱ�ȭ
		for (i=0 ; i<inwon ; i++)
		{
			recArr[i].rank = 1;
		}

		// ���(����) ����
		for (i=0 ; i<inwon-1 ; i++) //i �� �� ������ �����ϴ� �ε���
		{
			for (j=i+1 ; j<inwon ; j++) //j �� �� ����� �����ϴ� �ε���
			{
				if (recArr[i].avg> recArr[j].avg)	//���� �����Ͱ� �� �����ͺ��� ũ�ٸ�...
				{
					//�� �������� rank �� 1��ŭ ����
					recArr[j].rank++;
				}
				else if (recArr[j].avg>recArr[i].avg) //�� �����Ͱ� ���� �����ͺ��� ũ�ٸ�...
				{
					 //���� �������� rank�� 1��ŭ ����
					 recArr[i].rank++;
				}
			}
		}

	}//end ranking()

}