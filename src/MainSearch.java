import java.util.Scanner;

public class MainSearch {
	int menu;
	Scanner scanner = new Scanner(System.in);
	
	public void start() {
		System.out.println("============  3.��ȸ    ================");
		
		System.out.println("1.��ü ��Ȳ��   2.ȯ�� �˻�   3.���̺� Ȯ����   4. �ڷΰ���");
		System.out.println("=====================================");
		
		System.out.print("�޴��� �Է��ϼ���. : ");
		int result = Integer.parseInt(scanner.nextLine());
		
		if(result == 1) {
			DashBoard dashBoard = new DashBoard();
			start();
		}else if(result == 2) {
			PatientSearch patientsearch = new PatientSearch();	
		}else if(result == 3) {
			ConfirmedByAge confirmedbyage = new ConfirmedByAge();
			confirmedbyage.confirmedByAge();
		}else if(result == 4) {
			Corona19 corona19 = new Corona19();
			corona19.coronaSystem();
		}else {
			System.out.println("���� ��ȣ �Դϴ�. ��ȣ�� �ٽ� �Է����ּ���.");
			start();
			
		}
	}
	
	public static void main(String[] args) {
		MainSearch mainsearch = new MainSearch();
		mainsearch.start();
			
	}

}
