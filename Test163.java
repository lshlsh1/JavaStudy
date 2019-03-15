/*========================================
	���� �÷��� (Collection) ���� 
========================================*/

// Set �� HashSet, TreeSet
// - ������ ����
// - �ߺ��� ������� �ʴ� ����(�⺻)

/*
 �� TreeSet<E> Ŭ����

	java.util.TreeSet<E> Ŭ������
	Set �������̽��� ����� SortedSet �������̽��� ������ Ŭ������
	�����͸� �߰��ϸ� �����͵��� �ڵ����� �������� ������ �ȴ�.
	���� Ư���� ��쿡�� ���
*/
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

// VO �� Value Object
// DTO �� Data Transfer Object
// DAO �� Data Access Object
class GradeVO
{
	//�ֿ� �Ӽ� ����
	private String hak;
	private String name;
	private int kor,eng,mat;

	GradeVO()
	{
	}

	//������ (����� ���� ������ �� 5���� �Ű������� ���� ������)
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak =hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	//getter/ setter ����
	public void setHak(String hak)
	{
		this.hak = hak;	
	}
	public String getHak()
	{
		return hak;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}

	public void setKor(int kor)
	{
		this.kor=kor;
	}
	public int getKor()
	{
		return kor;
	}

	public void setEng(int eng)
	{
		this.eng=eng;
	}
	public int getEng()
	{
		return eng;
	}
	
	public void setMat(int mat)
	{
		this.mat=mat;
	}
	public int getMat()
	{
		return mat;
	}

	//�߰� �޼ҵ� ����
	int getTot()
	{
		return kor+eng+mat;
	}
}


class Mycomparator<T> implements Comparator<T>
{
	@Override
	public int compare(T o1,T o2)
	{
		GradeVO s1 = (GradeVO)o1;
		GradeVO s2 = (GradeVO)o2;

		// �й� ����
		//return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());	//--���������� ���ڿ�
		// ���� ����
		//return s1.getTot() - s2.getTot();		//-- ��������
		//return s2.getTot() - s1.getTot();		//-- ��������

		// �̸� ����
		//return s1.getName() -s2.getName();	//--error
		//return Integer.parseInt(s1.getName()) - Integer.parseInt(s1.getName());	//--���������� �ƴϱ⶧���� ����ȯ�Ұ�
		/*
		String name1 = s1.getName();
		String name2 = s2.getName();
		return name1.compareTo(name2);
		*/
		return s1.getName().compareTo(s2.getName());
		
		
	}
}

public class Test163
{
	public static void main(String[] args)
	{
		// TreeSet �ڷᱸ�� �ν��Ͻ� ����
		TreeSet<String> set = new TreeSet<String>();

		// TreeSet �ڷᱸ�� set�� ��� �߰� �� add()
		set.add("���ϸ���");
		set.add("������");
		set.add("���ǽ�");
		set.add("����ö��999");
		set.add("�Ƿη�");
		set.add("�̴��߻�");
		set.add("�ڷ����");
		set.add("ī��ĸ��ü��");
		set.add("��");
		set.add("¯���� ������");
		set.add("�λ��̵�ƿ�");
		set.add("���󿡸�");
		set.add("�̻��ѳ�������");
		set.add("�ϸ�ã�Ƽ�");

		//Iterator �� Ȱ���Ͽ� set��� ��ü ���
		System.out.print("�����ϴ� ��ȭ��ȭ : ");
		Iterator<String> it = set.iterator();
		while (it.hasNext())
		{
			System.out.print(it.next()+" ");
		}System.out.println();
		//--==>>�����ϴ� ��ȭ��ȭ : �ϸ�ã�Ƽ� ���󿡸� ������ �Ƿη� �� ���ǽ� ����ö��999 �̴��߻� �̻��ѳ������� �λ��̵�ƿ� ¯���� ������ ī��ĸ��ü�� �ڷ���� ���ϸ���

		// TreeSet �ڷᱸ�� �ν��Ͻ� ����
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();	//������ ��� �񱳺Ұ�
		//--==>>ClassCastException: GradeVO cannot be cast to java.lang.Comparable
		
		// TreeSet �ڷᱸ�� �ν��Ͻ� ����. ��, �й� �������� ����
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new  Mycomparator<GradeVO>());

		set2.add(new GradeVO("16","������", 90, 80, 70));
		set2.add(new GradeVO("21","������", 80, 70, 60));
		set2.add(new GradeVO("62","�ѽ¿�", 100, 100, 100));
		set2.add(new GradeVO("24","��ȫ��", 12, 23, 34));
		set2.add(new GradeVO("10","���Ѿ�", 50, 50, 50));
		

		//set2 Iterator�� ���
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			GradeVO vo = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %4d\n", vo.getHak(), vo.getName(), vo.getKor(), vo.getEng(), vo.getMat(), vo.getTot());

		}

	}
}