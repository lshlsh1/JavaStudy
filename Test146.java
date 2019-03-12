/*=========================================
	���� ����(Exception) ó�� ����
==========================================*/
//145.java�� ��~!!!

class Demo2
{	
	//�ֿ� �Ӽ� ����
	private int value;

	//setter
	public void setValue(int value)	throws Exception
	{
		if (value<=0)
			throw new Exception("value�� 0���� �۰ų� ���� �� �����ϴ�.");
			//-- ���ο� ���� �߻�~!!!
			//unreported exception Exception; must be caught or declared to be thrown
	        //     throw new Exception("value�� 0���� �۰ų� ���� �� �����ϴ�.");
			//br.readLine()�� ����� ����
		this.value = value;
	}
	
	//getter
	public int getValue()
	{
		return value;
	}
}


public class Test146
{
	public static void main(String[] args) //throws Exception
	{
		Demo2 ob = new Demo2();

		try
		{
				ob.setValue(-10);
				int result = ob.getValue();
				System.out.println(result);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}

	}
}

//������
/*- main���� throws ���� ��
Exception in thread "main" java.lang.Exception: value�� 0���� �۰ų� ���� �� �����ϴ�.
        at Demo2.setValue(Test146.java:15)
        at Test146.main(Test146.java:36)
*/

//try catch�� ���������
//java.lang.Exception: value�� 0���� �۰ų� ���� �� �����ϴ�.