package HospitalReserve;

import java.util.*;

public class ReserveMain { //����Ŭ���� ���⼭ ����
	
	public static void main(String[] args) {
		
		String reserveName = null; //������ ����
		int phoneNum = 0; //��ȭ��ȣ
		boolean input = true; //�Է��� �� true�̴�.
		
		reserveseat seat = new reserveseat(reserveName, phoneNum);
		
		Scanner scanner = new Scanner(System.in); //�Է��Ҽ� �ִ� ��ĳ��
		
		while(input) { // - ���� �ý����� �޴��� "����", "��ȸ", "���", "������"�� �ִ�.
					  // - ���� �̸�, ���� ��ȣ, ���� �޴�, �߸��� ��� � ���ؼ� ���� �޽����� ����ϰ� ����ڰ� �ٽýõ��ϵ��� �Ѵ�.
			System.out.println("==============================");
			System.out.println("1.�����ϱ� 2.������ȸ 3.������� 4.�ڷΰ���");
			
			int reservefor = scanner.nextInt(); //���� �޴��� 4���� �Է� �׿ܴ� �߸��Է����
			switch(reservefor) {
			case 1: 
				seat.Seat();
				break;
			case 2: 
				seat.searchSeat();
				break;
			case 3: 
				seat.CancleSeat();
				break;
			case 4: // �ڷΰ���
				System.out.println("ȯ�ڸ޴��� �̵��մϴ�.");
				input = false;
				return;
			default:
				System.out.println("�߸� �����̽��ϴ�. ��Ȯ�� ��ȣ�� �Է����ּ���.");
			}
		}
	}
}