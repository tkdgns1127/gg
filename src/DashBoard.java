

import java.util.ArrayList;
import java.util.Scanner;

public class DashBoard {
	
	Scanner scanner = new Scanner(System.in);
	
	//sanghun.Test test = new sanghun.Test();
	//Consult consult = new Consult();
	
	public DashBoard(){
		dashboardstart();
	}
	
	
	public void dashboardstart() {
		System.out.println("-----��ü ��Ȳ��-----");
	//	System.out.println("���� Ȯ���� �� : " + Test.infectionPersonList.size()); //Ȯ���� ����Ʈ ��ȸ
	//	System.out.println("�˻� ������ �� : " + consult.coronaTestList.size()); //�˻� ����Ʈ ��ȸ
		System.out.println("���� Ȯ���� �� : " + "" ); //Ȯ���� ����Ʈ  + ��ġ�� ����Ʈ
		System.out.println("���� ��ġ�� �� : " + "��"); //ġ���� ����Ʈ
		System.out.println("���� ����� �� : " + "��"); //����� ����Ʈ
		System.out.println("��� ������ �� : " + "��"); //ġ���� ����Ʈ + ��ü���� ����Ʈ + ����� ����Ʈ
		System.out.println("------------------");
		System.out.println();
//		System.out.println("��Ȯ���� �� : " + "��");   //���ġ�Ῡ�ΰ� ���λ��(Boolean Cure = true)�� ����� Ȯ���� ����Ʈ�� ��
	}
	
/*	
 	public void backmenu() {
		
		System.out.println("�ڷ� ���ðڽ��ϱ�? y/n ");
		char input = scanner.next().charAt(0);
		if(input == 'y') {
			MainSearch mainsearch = new MainSearch();
			mainsearch.start();
		}else if(input == 'n') {
			//system.out.println
		}else {
			System.out.println("�ٽ� �Է����ּ���.");
		}

	}
*/
}
