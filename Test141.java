/*============================================
	���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- Random Ŭ����
============================================*/

/*
�� java.util.Random Ŭ������

	���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�
	Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ嵵 ������ �����ϴ� �޼ҵ�������
	0.0 ~ 1.0 ������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
	�ʿ��� ���� ������ ������ ������ ���ؼ��� �߰����� ������� �����ؾ� �Ѵ�
	�׷��� �ڹٴ� ���� ������ ������ �߻������ִ�
	���� Ŭ������ Random Ŭ������ ������ �����ϰ� �ִ�.
*/

// �ζ� ��ȣ ������(���� �߻� ���α׷�)

// ���α׷��� ����Ǹ� �⺻������ �ζǸ� 5���� �����ϴ� ���α׷��� �����Ѵ�.
//�ζǹ�ȣ 45�� ���� 6��

// ���� ��)
// 2 39 40 41 42 45
// 1 2 8 16 28 42
// 4 9 10 13 14 28
// 20 24 31 33 37 41
// 5 7 8 11 36 40
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Random;
import java.util.Arrays;

class Lotto
{
	//�迭 ���� ���� �� �޸� �Ҵ� �� �ζ� ��ȣ�� ��Ƶ� �迭�� 6��
	
	private int[] num = new int[6];

		// getter(int[] num�� private��)
		public int[] getNum()
		{
			return num;
		}

		//6���� ������ �߻���Ű�� �޼ҵ� ����
		public void start()
		{
			int cnt = 0;
			Random rd = new Random();
			int n;


			jump:
			while (cnt<6)	//cnt �� 0 1 2 3 4 5
			{
				n = rd.nextInt(45) + 1; // 1 ~ 45
			
				for (int i=0 ; i<cnt ; i++)
				{
					if (num[i] == n)
					{
						continue jump;
					}
				}
				num[cnt++] = n;	
			}

			sorting();
		}

		//���� �޼ҵ�
		public void sorting()
		{
			Arrays.sort(num);
		}
}
	


public class Test141
{
	public static void main(String[] args)
	{	
		/*
		for (int m=0; m<6 ; m++)
		{
			int[] lotto = new int[6];
		
		int i, j;

		for ( i=0 ; i<lotto.length  ; i++ )
		{
			lotto[i] = (int)(Math.random()*45)+1;
			System.out.print(lotto[i]+" ");

			for ( j=0 ; j<lotto.length ; j++)
			{
				if(lotto[i] == lotto[j])
		{
			i--;
			break;
		}

				
				if (lotto[i]>lotto[j])
				{
					lotto[i] = lotto[i]^lotto[j];
					lotto[j] = lotto[j]^lotto[i];
					lotto[i] = lotto[i]^lotto[j];
				}					
			}
		}
							
		
		System.out.println();
		
		}
		*/

		//lotto Ŭ���� �ν��Ͻ� ����
		Lotto lotto = new Lotto();

		// �⺻ 5����
		for (int i=1 ; i<=5 ; i++ )
		{
			lotto.start();

			//��� ���
			for (int n: lotto.getNum())
			{
				System.out.printf("%4d",n);
			}
			System.out.println();
		}
	}
}

