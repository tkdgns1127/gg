package corona;

import java.util.ArrayList;

public class DashBoard {
	
	ArrayList<Person> treatmentCompletedList = new ArrayList<>();//��ġ�ڸ���Ʈ
	ArrayList<Person> antibodyList = new ArrayList<>();//��ü������ ����Ʈ
	ArrayList<Person> deathList = new ArrayList<>();//����� ����Ʈ
	
	
	public void dashboardstart() {
		System.out.println("���� Ȯ���� �� : " + "��"); //Ȯ���� ����Ʈ ��ȸ
		System.out.println("�˻� ������ �� : " + "��"); //�˻� ����Ʈ ��ȸ
		System.out.println("���� Ȯ���� �� : " + "��"); //Ȯ���� ����Ʈ  + ġ���� ����Ʈ
		System.out.println("���� ��ġ�� �� : " + "��"); //ġ���� ����Ʈ
		System.out.println("���� ����� �� : " + "��"); //����� ����Ʈ
		System.out.println("��� ������ �� : " + "��"); //ġ���� ����Ʈ + ��ü���� ����Ʈ + ����� ����Ʈ
//		System.out.println("��Ȯ���� �� : " + "��");   //���ġ�Ῡ�ΰ� ���λ��(Boolean Cure = true)�� ����� Ȯ���� ����Ʈ�� ��
		
		
	}
}
