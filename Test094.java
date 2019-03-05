/*===============================
	���� Ŭ������ �ν��Ͻ� ����
	- Ŭ������ �ν��Ͻ� Ȱ��
=================================*/

// �� �ǽ� ����
// 1~3 ������ ���� ������ ������ �߻�����
// ����, ����, �� ���� ���α׷��� �����Ѵ�.
// ��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ���� �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

// ���� ������ �� 1:���� 2:���� 3:��

// ���� ��)
// 1:���� 2:���� 3:�� �� �Է�(1-3) : 4
// 1:���� 2:���� 3:�� �� �Է�(1-3) : -12
// 1:���� 2:���� 3:�� �� �Է�(1-3) : 2
// - ���� : ����
// - ��ǻ�� : ��
// >> �º�������� : ��ǻ�Ͱ� �̰���ϴ�~!!!!

// >> �º�������� : ����� �̰���ϴ�~!!!!

// >> �º�������� : �����ϴ�~!!!!

import java.util.Scanner;
import java.util.Random;

class Rpsgames
{
	int com;	
	int user;

	private void runCom()
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;		// 0 1 2 �� 1 2 3 4
	}

	public void input()
	{
		runCom();

		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("1:���� 2:���� 3:�� �� �Է�(1-3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);

	}

	public void middleCalc()
	{
		String[] str = {"����","����","��"};
		
		System.out.println("-���� : "+str[user-1]);
		System.out.println("-��ǻ�� : "+ str[com-1]);
	}

	public String resultCalc()
	{

		String result = "���º�";

		if((user==1&&com==3) || (user==2&&com==1) || (user==3&&com==2))
			result = "����� �¸��߽��ϴ�~!!!";
		if((user==1&&com==2) || (user==2&&com==3) || (user==3&&com==1))
			result = "��ǻ�Ͱ� �¸��߽��ϴ�~!!!!";

		return result;
	}

	public void print(String result)
	{
		System.out.println(">> �º� ���� ��� : "+result);
	}
	
}

public class Test094
{
	public static void main(String[] args)
	{
		Rpsgames ob = new Rpsgames();

		ob.input();
		ob.middleCalc();
		String result = ob.resultCalc();
		ob.print(result);
			
	}
}


//���� ���
/*
1:���� 2:���� 3:�� �� �Է�(1-3) : 2
-���� : ����
-��ǻ�� : ����
>> �º� ���� ��� : ����� �¸��߽��ϴ�~!!!
*/