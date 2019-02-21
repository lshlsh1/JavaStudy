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
		System.out.print("임의의 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		
		strResult = (a>0) ? "양수" : (a<0 ? "음수" : "영") ;

		System.out.println(a + " → " + strResult);

	}
}