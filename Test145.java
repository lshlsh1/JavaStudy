/*=========================================
	���� ����(Exception) ó�� ����
==========================================*/
//146.java�� ��~!!!
//Demo Ŭ������ ������ ���� ���ԵɰŴϱ� �����ӽô�

class Demo
{
	private int value;		//��������
	
	//setter �� �����ϱ�
	public void setValue(int value)
	{
		if (value <=0)
		{
			return;	//-- �޼ҵ� ����
		}
		this.value = value;
	}

	//getter �� �޾ƿ���
	public int getValue()
	{
		return value;
	}
}

public class Test145
{
	public static void main(String[] args)
	{
		Demo ob = new Demo();
		ob.setValue(-3);
		int result = ob.getValue();
		System.out.println(result);
	}
}

//���� ���
//0