import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test
{
	public static void main(String[] args) throws IOException
	{
		int a;
		String strResult;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		
		strResult = (a>0) ? "���" : (a<0 ? "����" : "��") ;

		System.out.println(a + " �� " + strResult);

	}
}